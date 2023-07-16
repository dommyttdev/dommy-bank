# 詳細設計

## モジュール構成
| モジュール名                | 概要                   | ポート(dev) | ポート(prd |
|-----------------------|----------------------|----------|---------|
| AccountApiServer      | 預金口座管理APIサーバ         | 8102     | 8002    |
| ApiGatewayServer      | APIゲートウェイサーバ         | 8100     | 8000    |
| CustomerApiServer     | 顧客管理APIサーバ           | 8101     | 8001    |
| SavingApiServer       | 貯蓄口座管理APIサーバ         | 8103     | 8003    |
| VirtualDebitApiServer | バーチャルデビットカード管理APIサーバ | 8104     | 8004    |
| WebApplication        | Webアプリケーション          | 8080     | 80      |

