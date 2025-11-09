🧾 SpringBoot-CRUD-Application
A simple backend-only CRUD (Create, Read, Update, Delete)** application built using Spring Boot, Spring Data JPA, and MySQL.  
This project demonstrates how to design RESTful APIs to perform CRUD operations on a database and test them using Postman.

🚀 Features
- ➕ Create new record  
- ✏️ Update existing record  
- ❌ Delete record  
- 👀 Retrieve single or all records  
- 💾 Persistent storage using MySQL  
- ⚙️ Tested using Postman (no frontend)

⚡ Getting Started

1️⃣ Clone the Repository
git clone https://github.com/NILESHMESHRAM29/SpringBoot-CRUD-Application.git
cd SpringBoot-CRUD-Application

2️⃣ Configure the Database
Edit the src/main/resources/application.properties file with your database credentials:

properties
spring.application.name=springboot-crud-application
spring.datasource.url=jdbc:mysql://localhost:3306/studentinfo
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

💡 Ensure that the database "studentinfo" exists in MySQL.

3️⃣ Run the Application
mvn spring-boot:run
or run the main class `SpringBootCrudApplication` in your IDE.

🧪 API Endpoints
| HTTP Method | Endpoint       | Description      |
| ----------- | -------------- | ---------------- |
| `POST`      | `/save`        | Add new record   |
| `GET`       | `/view/all`    | Get all records  |
| `GET`       | `/view/{id}`   | Get record by ID |
| `PUT`       | `/update/{id}` | Update record    |
| `DELETE`    | `/delete/{id}` | Delete record    |

🧩 Dependencies Used
`spring-boot-starter-web`
`spring-boot-starter-data-jpa`
`mysql-connector-j`
`spring-boot-devtools`
`lombok` (optional)

🧑‍💻 Author
Nilesh Meshram
📧 [nileshmeshram29@gmail.com](mailto:nileshmeshram29@gmail.com)
🌐 [GitHub Profile](https://github.com/NILESHMESHRAM29)


⭐ If you found this project helpful, consider giving it a star on GitHub!
Would you like me to also include **example Postman screenshots section** (placeholders like “POST request example”, “GET all records example”) so your GitHub looks more complete visually?

