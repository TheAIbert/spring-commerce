# Spring Commerce – Shopping Cart Backend with Spring Boot & JWT

Welcome to **Spring Commerce**, a fully functional and secure shopping cart backend system built with **Spring Boot**, **Spring Security**, and **JWT**. This project demonstrates backend architecture, domain modeling, secure authentication, and clean service-layer design using real-world e-commerce scenarios.

## Project Overview

**Spring Commerce** provides the backend foundation for an e-commerce platform. It includes robust domain modeling for products, categories, and images, along with layered architecture and secure endpoints. Ideal for learning how to structure scalable backend systems using **Spring Boot** and **JPA**.

### Key Features

* **JWT-Based Authentication**: Secure user login using JSON Web Tokens.
* **Product Management**: Create, update, retrieve, and delete products.
* **Category and Image Management**: Handle related entities with clear JPA relationships.
* **DTO Usage**: Clean separation of domain models and request/response payloads.
* **Exception Handling**: Robust and descriptive error management.
* **JPA Finder Methods**: Powerful dynamic query generation using Spring Data JPA.


## Functional Requirements

### Authentication & Security

* Secure endpoints protected by JWT and Spring Security.

### Domain Modeling

* **Entities**:

  * `Product` (includes name, brand, price, images)
  * `Category` (linked to products)
  * `Image` (linked to a product)

* **Relationships**:

  * Many products → one category (`@ManyToOne`)
  * One product → many images (`@OneToMany`)

### Services & Logic

* Interfaces like `IProductService`, `ICategoryService`, etc., define clean contracts.
* Concrete services handle business logic, exception handling, and data conversion.
* Helper methods like `createProduct()` and `updateExistingProduct()` ensure clarity and modularity.

### Database Integration

* MySQL database configuration via `application.properties`.
* Automatic schema creation using JPA and Hibernate.
* Reverse engineering and validation via MySQL Workbench.


## Technologies Used

* **Backend**: Java 17, Spring Boot, Spring Web, Spring Data JPA, Spring Security
* **Authentication**: JWT (JSON Web Token)
* **Database**: MySQL
* **Libraries**: Lombok, ModelMapper
* **Build Tool**: Maven
* **Testing**: JUnit
* **Version Control**: Git


## License
This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details
