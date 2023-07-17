package com.dommy.bank.api.gateway.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpCookie;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class TokenTranslationFilterFactory extends AbstractGatewayFilterFactory<TokenTranslationFilterFactory.Config> {

    public TokenTranslationFilterFactory(){
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        System.out.println("TokenTranslationFilterFactory#apply");
        return (exchange, chain) -> {
            try {
                HttpCookie cookieLoginSession = exchange.getRequest().getCookies().getFirst("LOGIN_SESSION");

                String token;
                if(cookieLoginSession == null) {
                    token = this.requestAuth(new AuthRequestData("application id", "application key")).getAccessToken();
                } else {
                    String sessionId = cookieLoginSession.getValue();
                    String userId = this.getUserId(sessionId);
                    token = this.getAuthToken(userId);
                }
                ServerHttpRequest request = exchange.getRequest().mutate().header("X-AUTH-TOKEN", token).build();
                return chain.filter(exchange.mutate().request(request).build());

            } catch (NullPointerException e){
                e.printStackTrace();
                return null;
            }
        };
    }

    private String getUserId(String sessionId){
        return "test-user";
    }

    private String getAuthToken(String userId){
        return "test-token";
    }

    private AuthResponseData requestAuth(AuthRequestData authRequestData) {
        return new AuthResponseData("test-user", "test-token");
    }

    public static class Config{}

    @AllArgsConstructor
    @Getter
    public static class AuthRequestData{
        private String applicationId;
        private String applicationKey;
    }

    @AllArgsConstructor
    @Getter
    public static class AuthResponseData{
        private String userId;
        private String accessToken;
    }
}
