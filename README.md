# TodoList Project
This project is oriented to create a TODO task list for a specific user.
##Installing
This project's database created by using Docker. Write ``docker-compose up`` to install it.
After that, reach to ``http://localhost:8080`` and authenticate adminer panel to create database.
(Username: root,
Password: password)


SQL Command : ``CREATE DATABASE task;``


Installation of database done, use the Postman or similar tool to test functionality.
 

## Examples

* Create a task:

``curl --request POST \
--url http://localhost:8081/task \
--header 'Content-Type: application/json' \
--header 'conent-type: application/json' \
--data '{
"name": "name",
"description": "description",
"state": "state"
}'``

* Get a task:

``curl --request GET \
--url http://localhost:8081/task/1 \
--header 'Content-Type: application/json' \
--header 'conent-type: application/json' \
--data '{
"name": "name",
"description": "description",
"state": "state"
}'``

* Update a task:

``curl --request PUT \
--url http://localhost:8081/task/1 \
--header 'Content-Type: application/json' \
--header 'conent-type: application/json' \
--data '{
"id": 1,
"name": "name",
"description": "description",
"state": "state1"
}'``

* Delete a task:

``curl --request DELETE \
--url http://localhost:8081/task/1 \
--header 'Content-Type: application/json' \
--header 'conent-type: application/json' \
--data '{
"id": 1,
"name": "name",
"description": "description",
"state": "state1"
}'``

* Create a task group:

``curl --request POST \
--url http://localhost:8081/taskgroup \
--header 'Content-Type: application/json' \
--header 'conent-type: application/json' \
--data '{
"id": 1,
"tasks": [
{
"name": "name",
"description": "description",
"state": "state"
}
]
}'``

* Create a user:

``curl --request POST \
--url http://localhost:8081/user \
--header 'Content-Type: application/json' \
--header 'conent-type: application/json' \
--data '{
"id": 1,
"taskGroup": [{
"id": 1,
"tasks": [
{
"name": "name",
"description": "description",
"state": "state"
}
]
}'``