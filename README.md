# Java-Database-Connectivity
Student Database Management using JDBC
This Java program demonstrates basic CRUD (Create, Read, Update, Delete) operations on a MySQL database using the JDBC API.
The program interacts with a database named anshuraj and a table named student.
Below is a description of the key components and functionalities provided by the program.

:- Features
1. Create Database
   
The createDatabase() method creates a new database named anshuraj on a local MySQL server.

2. Create Table
   
The createTable() method creates a table named student in the anshuraj database with the following schema:
rollno (INT): Student roll number
sname (VARCHAR): Student name

3. Insert Data
   
The createdata() method inserts a new row into the student table using a PreparedStatement. Example data added:
rollno: 13
sname: "Kushwaha"

4. Read Data
   
The readData() method retrieves and displays all rows from the student table.

5. Update Data
    
The update() method updates the rollno field for a student based on their sname.

6. Delete Data
    
The deleteData() method deletes a specific row from the student table based on a condition (e.g., rollno = 11).


: Notes

The program uses hardcoded credentials for simplicity. For production, use environment variables or a secure configuration.
Ensure the MySQL server is running and accessible on localhost:3306.
To customize the database or table name, update the corresponding SQL queries in the code.

: Dependencies

Java Development Kit (JDK) |
MySQL Server |
MySQL JDBC Driver (mysql-connector-java) |


