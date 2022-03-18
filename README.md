#### Notes:
This is my first time using Java and Spring Boot for the backend to make a RESTful API.

#### Getting setup (windows 10):
1. git clone repository: `git clone git@github.com:ptpeck357/SprintBoot.git`.
2. Make an environment variable called `mysql_pw` that stores your MySQL Password. I already made the assumption that your username is `root`...
3. Open `usertable` in an IDE. I used IntelliJ IDEA (free version).
4. Run the application in whatever IDE you are using.

#### Testing:
1. Open MySQL Workbench (or something similar) and navigate to `fullstack` schema and go to `user` table.
2. Open Insomnia or Postman API Platform to test the API.
3. There are 5 different endpoints to this API:
    * POST method `localhost:8080/save` - saves an user.
        * Request body example:
        * `{"name": "John Doe", "email": "johndoe@gmail.com",	"phone": "808-404-2022"}`
    * GET method `localhost:8080/getAll` - grabs all the users. Every. Single. One. Leave no man behind.
    * GET method `localhost:8080/get/{userid}` - grabs an user based off their unique user Id.
    * DEL method `localhost:8080/delete/{userid}` - nukes an user from existence based off their unique user Id.
    * PUT method `localhost:8080/update/{userid}` - updates an user based off the unique user Id. Fancy.
        * Request body example:
        * `{"name": "John Deere", "email": "john.deere@hotmail.com",	"phone": "808-404-2022"}`
4. Refresh the `user` table in MySQL to see the changes being updated in real-time.
    * Or a SELECT command: `SELECT * FROM fullstack.user;`
