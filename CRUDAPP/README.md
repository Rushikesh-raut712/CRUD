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

- `GET /api/items` - Get all items
- `GET /api/items/{id}` - Get item by ID
- `POST /api/items` - Create a new item
- `PUT /api/items/{id}` - Update an existing item
- `DELETE /api/items/{id}` - Delete an item

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- Your Name - Initial work

## 🙏 Acknowledgments

- Spring Boot team for the amazing framework
- MySQL team for the database
- All contributors who participate in this project 