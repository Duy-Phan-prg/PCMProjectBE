# Admin API Quick Reference Guide

## 🔐 Authentication
All endpoints require `Authorization: Bearer <JWT_TOKEN>` header and ADMIN role.

---

## 📁 Category Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/admin/categories` | Create new category |
| GET | `/api/admin/categories` | Get all categories |
| PUT | `/api/admin/categories/{id}` | Update category |
| DELETE | `/api/admin/categories/{id}` | Delete category |

### Category Request Body
```json
{
  "categoryName": "Electronics"
}
```

---

## 📦 Product Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/admin/products` | Create new product |
| GET | `/api/admin/products` | Get all products |
| GET | `/api/admin/products/{id}` | Get product by ID |
| PUT | `/api/admin/products/{id}` | Update product |
| DELETE | `/api/admin/products/{id}` | Delete product |

### Product Request Body
```json
{
  "productName": "iPhone 15 Pro",
  "description": "Latest Apple smartphone",
  "price": 999.99,
  "stockQuantity": 50,
  "categoryId": 1
}
```

---

## ✅ Validation Rules

### Product
- ✔️ **productName**: Required, not blank
- ✔️ **description**: Optional
- ✔️ **price**: Required, must be positive (> 0)
- ✔️ **stockQuantity**: Required, cannot be negative (>= 0)
- ✔️ **categoryId**: Required, must exist

### Category
- ✔️ **categoryName**: Required, not blank, unique

---

## 📝 Example Flow

1. **Login** → Get JWT token
2. **Create Category** → POST `/api/admin/categories`
3. **Create Product** → POST `/api/admin/products` (use category ID from step 2)
4. **View Products** → GET `/api/admin/products`
5. **Update Product** → PUT `/api/admin/products/{id}`
6. **Delete Product** → DELETE `/api/admin/products/{id}`

---

## 🎯 Response Format

### Success Response
```json
{
  "status": "SUCCESS",
  "payload": { /* data */ },
  "error": null
}
```

### Error Response
```json
{
  "status": "ERROR",
  "payload": null,
  "error": {
    "message": "Error message",
    "code": "ERROR_CODE"
  }
}
```

---

## 🔍 Testing with Swagger
Access: `http://localhost:8080/swagger-ui.html`
