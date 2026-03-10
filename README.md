# 🚀 Microservice Project

Dự án mẫu triển khai hệ thống **Microservices** sử dụng:
- Spring Boot
- Eureka Server
- API Gateway
- Order Service
- Inventory Service
- PostgreSQL

Triển khai và chạy bằng **Docker Compose**.

---

## 📋 Yêu cầu hệ thống
- **JDK 21** (nếu build jar thủ công)
- **Maven 3.9+**
- **Docker Desktop**
- **Docker Compose v2**

---

## 📂 Cấu trúc project

microservice-project/ \
├── eureka-server/ \
├── api-gateway/ \
├── order-service/\
├── inventory-service/ \
├── init.sql \
├── docker-compose.yml \
├── .env.example \
└── README.md


---

## ⚙️ Cài đặt & Chạy hệ thống

### 1️⃣ Clone repository
```bash
git clone https://github.com/anduon/microservice-project.git
cd microservice-project
```
### 2️⃣ Tạo file .env
Copy từ .env.example:

```bash
cp .env.example .env
```
Sau đó chỉnh sửa giá trị phù hợp:
```bash
POSTGRES_USER=postgres
POSTGRES_PASSWORD=changeme
POSTGRES_DB_ORDERS=orderservice
POSTGRES_DB_INVENTORY=inventorydb

EUREKA_PORT=8761
GATEWAY_PORT=8080
ORDER_PORT=8081
INVENTORY_PORT=8082
```
### 3️⃣ Build & chạy bằng Docker Compose
```bash
docker-compose up --build
```
🔍 Kiểm tra hệ thống
Eureka Server → http://localhost:8761

API Gateway → http://localhost:8080

Order Service → http://localhost:8081

Inventory Service → http://localhost:8082

Postgres → chạy ở port 5432, database được khởi tạo từ init.sql
