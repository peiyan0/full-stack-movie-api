# Movie API
- full stack development project to create a movie API

## Technologies
- Java
- Spring Boot
- React
- MongoDB

## Dependencies
- Lombok
  - reduce boilerplate code
    - @Data, @AllArgsConstructor, @NoArgsConstructor, @Builder
- Spring Web
- Spring Data MongoDB
- Spring Boot DevTools
- Spring Dotenv

### MongoDB
- cluster created using own IP address
- connection using MongoDB Compass

.env file to store environment variables eg. connection string

### Terminal
curl -i http://localhost:8080/api/v1/movies
output:
````
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 10
Date: Wed, 05 Mar 2025 16:59:04 GMT

All Movies
