# Olá Mundo – Spring Boot + JDBC + MySQL

Projeto de estudo com **Spring Boot** e **JDBC puro**, sem uso de JPA/Hibernate.

---

## 🚀 Tecnologias
- Java 21
- Spring Boot
- JDBC
- MySQL
- Maven
- Postman

---

## 🗄️ Banco de dados
```sql
CREATE DATABASE teste;
USE teste;

CREATE TABLE `User` (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(15),
    email VARCHAR(15)
);

INSERT INTO `User` (nome, email) VALUES
('Ana', 'ana@email.com'),
('João', 'joao@email.com'),
('Maria', 'maria@email.com');
````

## 🧪 Testes

Endpoints testados no Postman.
Requisições GET não utilizam body.

## 📌 Observações

- Projeto sem JPA

- Uso de PreparedStatement

- AUTO_INCREMENT não reutiliza IDs

- Tabela chamada User (uso de crase no SQL)
