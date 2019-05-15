# 1. Run App in Docker

Requirement: Docker, mvn

```
mvn package
docker-compose build
docker-compose up
```

# API

**Host**: localhost:8080

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

Response:

    Success:

    { "success" : "true" }

    Fail:
    {
      "timestamp": "2019-05-15T23:08:39.605+0000",
      "status": 400,
      "error": "Bad Request",
      "errors": [
        {
            "codes": [
                "Email.user.email",
                "Email.email",
                "Email.java.lang.String",
                "Email"
            ],
            ... ...
            ... ...
            "defaultMessage": "must be a well-formed email address",
            "objectName": "user",
            "field": "email",
            "rejectedValue": "bruceleeail.com",
            "bindingFailure": false,
            "code": "Email"
        }
      ],
      "message": "Validation failed for object='user'. Error count: 1",
      "path": "/users"
    }



## Update user

    PUT localhost:8080/users/{id}

    Body:

    {
    	"firstName": "elastic",
    	"lastName": "search",
    	"email" : "elasticseaerch@gmail.com"
    }

Response:

    Success:

    { "success" : "true" }

    Fail:

    {
      "timestamp": "2019-05-15T23:03:56.968+0000",
      "status": 500,
      "error": "Internal Server Error",
      "message": "No value present",
      "path": "/users/SsLLu2oBZ8DK69StLYit"
    }


## Delete user

    DELETE localhost:8080/users/{id}

Response:

    Success:

    { "success" : "true" }

    Fail:

    {
      "timestamp": "2019-05-15T23:03:56.968+0000",
      "status": 500,
      "error": "Internal Server Error",
      "message": "No value present",
      "path": "/users/SsLLu2oBZ8DK69StLYit"
    }
