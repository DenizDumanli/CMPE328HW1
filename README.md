# CMPE328HW1
You can simply download the code and open the project in IntelliJ or in other IDE's and run it from the DemoApplication.java class.

Some test scripts for Postman

GET localhost:5000/users to see all users

POST localhost:5000/users with body as to add user:
{
"id":2,
"name": "TEST",
"surName": "TESTER",
"mail": "TEST@mail.com"
}

GET localhost:5000/user/2 to get specific user that has id as 2.

PUT localhost:5000/users with body as to update the user with id 2:
{
"id":2,
"name": "UpdatedTEST",
"surName": "TESTER",
"mail": "TEST@mail.com"
}

DELETE localhost:5000/user/2 to delete user that has id as 2.
