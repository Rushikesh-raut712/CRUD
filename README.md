# Spring Boot CRUD Application

A basic Spring Boot CRUD (Create, Read, Update, Delete) application that demonstrates fundamental database operations using Spring Data JPA and MySQL.

## 🚀 Features

- RESTful API endpoints for CRUD operations
- MySQL database integration
- Spring Data JPA for database operations
- Input validation
- Spring Boot 3.4.4

## 🛠️ Technologies Used

- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- MySQL
- Maven
- Spring Web
- Spring Validation

## 📋 Prerequisites

- Java 21 or higher
- Maven
- MySQL Server
- Git (for cloning the repository)

## 🔧 Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/CRUD.git
```

2. Navigate to the project directory
```bash
cd CRUD
```

3. Configure MySQL database
   - Create a MySQL database named `userinfo`
     ```sql
     CREATE DATABASE userinfo;
     ```
   - Update the database configuration in `src/main/resources/application.properties`

4. Build the project
```bash
./mvnw clean install
```

5. Run the application
```bash
./mvnw spring-boot:run
```

## 💻 Usage

The application will start on `http://localhost:8080` by default.

### API Endpoints

- GET `http://localhost:8080/Controller/getallusers` - Get all items
- GET `http://localhost:8080/Controller/getuser/{id}` - Get item by ID
- POST `http://localhost:8080/Controller/createuser` - Create a new item
- PUT `http://localhost:8080/Controller/updateuser/{id}` - Update an existing item
- DELETE `http://localhost:8080/Controller/deleteuser/{id}` - Delete an item

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License.

## 👥 Authors

- Rushikesh Raut - Initial work

## 🙏 Acknowledgments

- Spring Boot team for the amazing framework
- MySQL team for the database
- All contributors who participate in this project

<img width="1016" alt="create_user" src="https://github.com/user-attachments/assets/dcc19e75-45a7-42c6-9ea3-98052522f3e6" />



<img width="1013" alt="get_all_users" src="https://github.com/user-attachments/assets/1e27b928-7c9e-45e3-ad2b-0a3e9205d875" />



<img width="1010" alt="get_user_by_id" src="https://github.com/user-attachments/assets/a20339f2-3420-43f2-b67d-847b3d62d223" />



<img width="1013" alt="update_user" src="https://github.com/user-attachments/assets/86f69c4f-d067-43ff-9ce3-9fff7fd2a128" />



<img width="1013" alt="delete_user" src="https://github.com/user-attachments/assets/f198fe8f-0274-4f96-a48a-7882327435d5" />




