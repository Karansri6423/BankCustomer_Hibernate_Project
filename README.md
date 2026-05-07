**📌 Project Overview**

This project is a simple Bank Customer Management System developed using Java, Hibernate, and MySQL.

**It follows a layered architecture using:**

Controller Layer
Service Layer
DAO Layer
Hibernate ORM
MySQL Database

**The application allows users to perform basic customer operations such as:**

Add Customer
View All Customers
Search Customer by ID
Update Customer Details
Delete Customer


**🛠️ Technologies Used**
☕ Java
🗄️ MySQL
🔥 Hibernate ORM
📦 Maven
🧠 OOP Concepts
🏗️ Layered Architecture


**📂 Project Structure**
bank_hibernate/
│
├── customer.java          // Entity class
├── Dao.java               // Database operations
├── service.java           // Business logic layer
├── controller.java        // User input handling
├── userApplication.java   // Main class
│
├── hibernate.cfg.xml      // Hibernate configuration


**⚙️ Features**
✅ Insert Customer
Add customer details
Auto-generated customer ID
Balance validation
✅ View All Customers
Fetch all customer records from database
✅ Search Customer By ID
Retrieve customer using primary key
✅ Update Customer
Update customer balance/details
✅ Delete Customer
Remove customer using customer ID

**🏗️ Architecture Flow**
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


**🗄️ Hibernate Concepts Used**
@Entity
@Id
@GeneratedValue
SessionFactory
Session
Transaction
HQL Queries


**📌 Example Hibernate Operations**
Insert
session.save(customerObject);
Select By ID
session.get(customer.class, id);
Select All
session.createQuery("from customer", customer.class).list();
Update
session.update(customerObject);
Delete
session.remove(customerObject);


**🧠 Learning Outcomes**

Through this project, I learned:

Hibernate ORM fundamentals
CRUD operations using Hibernate
Layered architecture implementation
Entity mapping
HQL Queries
Database connectivity using Hibernate
Maven dependency management


**▶️ How to Run**
Clone the repository
git clone <your-github-repository-link>
Open project in Eclipse/IntelliJ
Configure MySQL database
Update database credentials in:
hibernate.cfg.xml
Run:
userApplication.java

**🗃️ Database Configuration**
<property name="hibernate.connection.url">
jdbc:mysql://localhost:3306/bankCustomer_db?createDatabaseIfNotExist=true
</property>


**📸 Sample Operations**
1. Insert Customer
2. View All Customers
3. Search Customer By ID
4. Update Customer
5. Delete Customer


**📌 Future Enhancements**
Login Authentication
Transaction Management
Deposit & Withdraw Module
Exception Handling
Spring Boot Integration
REST API Development


**👨‍💻 Author**

**Karan Khabale**
