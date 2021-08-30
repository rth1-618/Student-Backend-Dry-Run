# Student-Backend-Dry-Run
Backstage rehearsals for DB and APIs

Code for Mapped API with Java Springboot where the database is self hosted Online MongoDB.

In order to test the API on your local Machine, download and run the project sb-mongo-tutorial in an IDE that supports Java Spring Framework and test the APIs with a test client such as Postman.

format for POST RequestBody: 

{
        "sName": "enter a string",
        "sID": "enter a string"
    }

Scope of the run doesn't include the API hosted at heroku yet. So the 
http://localport:8080/api/student 
would work in the test client after successful run of the Springboot Maven project at your local device.

DB link: https://cloud.mongodb.com/v2/611e5fb0996f970a64390988#metrics/replicaSet/611e61464d5b0f1231732206/explorer/student-db-test/student/find
