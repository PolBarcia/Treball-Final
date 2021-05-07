# Treball Final

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](http://www.pyarts.org)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](http://www.pyarts.org)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](https://sushildangi.github.io/online-shopping/) online-shopping.

This is an online shopping project using Spring Boot,Spring web-flow, Spring Rest Services and Hibernate. In this project we also used Spring Security with java and annotation configuration

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

# Runnig this project

1. Clone this project https://github.com/sushildangi/online-shopping.git change default branch "Upgrade-spring-boot" if default branch is "master"
2. create databases schema in mysql - **online_shopping_db**
3. edit **username** and **password** in **applicaton.properties** file
4. Run Project One time using Spring boot command - **mvn spring-boot:run** or using eclipse IDE run as Java Application
5. Run this Query in mysql

```sql
insert into online_shopping_db.user_detail(contact_number,email,enabled,first_name,last_name,password,role) values ('9876543210','admin@gmail.com',true,'admin','admin','$2a$10$6UVHQoHhpoYZxBB.k9r.deSLTT0RD1Yk8GdggRywGw0Snr8syRDtG','ADMIN')
```

**Password = 123456(in encoded Form)**

6. Then Again run project using boot
7. create user by signup