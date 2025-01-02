# Demo Hibernate Project

This is a demonstration project to learn and showcase the basics of Hibernate ORM (Object-Relational Mapping) with MySQL. The project includes essential concepts like entity creation, configuration, and saving data into the database.

---

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Hibernate Configuration](#hibernate-configuration)

---

## Introduction
Hibernate is a popular Java framework that simplifies the interaction with relational databases by mapping Java objects to database tables. This project demonstrates:
1. Configuring Hibernate with XML.
2. Creating a POJO (Plain Old Java Object) as an entity.
3. Inserting data into the database using Hibernate.

---

## Technologies Used
- **Java**: Core language for the project.
- **Hibernate**: ORM framework for database operations.
- **MySQL**: Relational database for data storage.
- **Eclipse IDE**: Development environment.
- **Maven**: Dependency management.

---

## Setup Instructions
1. Install MySQL and create a database (`db` in this example).
2. Clone this repository.
3. Import the project into Eclipse IDE.
4. Configure Hibernate dependencies in `pom.xml` (if using Maven).
5. Update `hibernate.cfg.xml` with your database details.

---

## Hibernate Configuration

The `hibernate.cfg.xml` file configures Hibernate to connect to the database. Below is the configuration:

```xml
<!DOCTYPE hibernate-configuration PUBLIC 
    "-//Hibernate/Hibernate Configuration DTD 3.0//EN" 
    "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database_name</property>
        <property name="hibernate.connection.username">your_database_username</property>
        <property name="hibernate.connection.password">your_database_password</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
    </session-factory>
</hibernate-configuration>
