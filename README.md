# 💳 Bank Customer Management System

A console-based **Bank Customer Management System** developed using **Java, Hibernate ORM, and MySQL**.  
This project follows a **Layered Architecture** approach and performs complete CRUD operations on customer data.

---

# 📌 Features

✅ Add New Customer  
✅ View All Customers  
✅ Search Customer By ID  
✅ Update Customer Details  
✅ Delete Customer  
✅ Auto Increment Customer ID  
✅ Hibernate ORM Integration  
✅ MySQL Database Connectivity  

---

# 🛠️ Technologies Used

- ☕ Java
- 🔥 Hibernate ORM
- 🗄️ MySQL
- 📦 Maven
- 🧠 OOP Concepts

---

# 🏗️ Project Architecture

```text
UserApplication
       ↓
Controller Layer
       ↓
Service Layer
       ↓
DAO Layer
       ↓
Hibernate ORM
       ↓
MySQL Database
```

---

# 📂 Project Structure

```text
bank_hibernate/
│
├── customer.java
├── controller.java
├── service.java
├── Dao.java
├── userApplication.java
│
├── hibernate.cfg.xml
```

---

# 🗄️ Hibernate Concepts Used

- `@Entity`
- `@Id`
- `@GeneratedValue`
- `SessionFactory`
- `Session`
- `Transaction`
- `HQL Queries`

---

# ⚙️ Database Configuration

```xml
<property name="hibernate.connection.url">
jdbc:mysql://localhost:3306/bankCustomer_db?createDatabaseIfNotExist=true
</property>

<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>

<property name="hibernate.hbm2ddl.auto">update</property>
```

---

# ▶️ How To Run

## 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/your-repository-name.git
```

## 2️⃣ Open Project

Open the project in:

- Eclipse
- IntelliJ IDEA

## 3️⃣ Configure Database

Update MySQL username and password in:

```text
hibernate.cfg.xml
```

## 4️⃣ Run Project

Run:

```text
userApplication.java
```

---

# 📸 Sample Console Menu

```text
---- Bank Customer System ----

1. Insert Customer
2. View All Customers
3. Search Customer By ID
4. Update Customer
5. Delete Customer
6. Exit
```

---

# 🧠 Learning Outcomes

Through this project, I learned:

- Hibernate ORM fundamentals
- CRUD operations using Hibernate
- Entity Mapping
- HQL Queries
- Layered Architecture
- Session & Transaction Management
- MySQL integration with Hibernate

---

# 🚀 Future Enhancements

- User Authentication
- Deposit & Withdraw Module
- Exception Handling
- Spring Boot Integration
- REST APIs
- GUI Interface

---

# 👨‍💻 Author

**Karan Khabale**
