# 1. Run Spring Boot in docker

```
docker-compose build
docker-compose up
```

Two containers should automatically run under the same default bridge network

# API

Host: localhost:8080

## Get all users

    GET  localhost:8080/users
    
    Response:
    [ {
        "id": "TMLMu2oBZ8DK69StBIiC",
        "email": "brucelee@gmail.com",
        "firstName": "Bruce",
        "lastName": "Lee"
       },
       
       {
        ....
       }
     ]
    
## Get user by id

    GET  localhost:8080/users/{id}
    
    Response:
    
    {
      "id": "TMLMu2oBZ8DK69StBIiC",
      "email": "brucelee@gmail.com",
      "firstName": "Bruce",
      "lastName": "Lee"
     }
    
## Add user

    POST localhost:8080/users
    
    Body:
    
    {
    	"firstName": "elastic",
    	"lastName": "search",
    	"email" : "elasticseaerch@gmail.com"
    }
    
## Update user
     
    PUT localhost:8080/users/{id}
    
    Body:
    
    {
    	"firstName": "elastic",
    	"lastName": "search",
    	"email" : "elasticseaerch@gmail.com"
    }

## Delete user 
    
    DELETE localhost:8080/users/{id}
    
    
