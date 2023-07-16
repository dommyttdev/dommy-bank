# 基本設計

## API設計
### API一覧

| API名              | 概要                               |
|-------------------|----------------------------------|
| Account API       | 預金口座管理API                        |
| Saving API        | 貯蓄口座管理API                        |
| Virtual Debit API | バーチャルデビットカード管理API                |
| Customer API      | 顧客管理API                          |
| API Gateway       | Webアプリ-API間、API-API間通信用APIゲートウェイ |

### API通信方式
| API/ノード     | API               | 方式   |
|-------------|-------------------|------|
| API Gateway | Account API       | gRPC |
| API Gateway | Saving API        | gRPC |
| API Gateway | Virtual Debit API | gRPC |
| API Gateway | Customer API      | gRPC |
| Webアプリケーション | API Gateway       | REST |
