package MyPackage;

import java.sql.*;

public class Student {
    public void createDatabase(){
        try {
            String url = "jdbc:mysql://localhost:3306/anshuraj";
            String username = "root";
            String password = "AnshuK@0810";

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();

            String query = "create database anshuraj";
            stm.execute(query);
            System.out.println("database created succesfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createTable() {

        try {
            String url = "jdbc:mysql://localhost:3306/anshuraj";
            String username = "root";
            String password = "AnshuK@0810";

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();

            String query = "CREATE TABLE student (rollno INT(3), sname VARCHAR(200))";
            stm.execute(query);
            System.out.println("table created succesfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createdata() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db ="anshuraj";
            String username = "root";
            String password = "AnshuK@0810";

            Connection conn = DriverManager.getConnection(url+db, username, password);
            String query = "INSERT into student (rollno, sname) VALUES (?,?)";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 13);
            pstm.setString(2, "Kushwaha");
            //pstm.executeUpdate(); // to update the data use executeUpdate
            pstm.execute();
            System.out.println("data inserted succesfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db ="anshuraj";
            String username = "root";
            String password = "AnshuK@0810";

            Connection conn = DriverManager.getConnection(url+db, username, password);
            String query = "select * from student";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()) {
                System.out.println("rollno = "+rs.getInt(1));
                System.out.println("name = "+rs.getString(2));
            }

            System.out.println("read succesfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db ="anshuraj";
            String username = "root";
            String password = "AnshuK@0810";

            Connection conn = DriverManager.getConnection(url+db, username, password);
            String query = "UPDATE student set rollno = ? where sname = ?";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 11);
            pstm.setString(2, "Raj");
            //pstm.executeUpdate(); // to update the data use executeUpdate
            pstm.execute();
            System.out.println("data updated succesfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            String url = "jdbc:mysql://localhost:3306/anshuraj";
            String username = "root";
            String password = "AnshuK@0810";

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();

            // SQL query to delete specific data from the "student" table
            String query = "DELETE FROM student WHERE rollno = 11"; // Adjust the condition as needed
            int rowsAffected = stm.executeUpdate(query);

            System.out.println(rowsAffected + " row(s) deleted successfully.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


//                      YOU REPEAT THE CODE IN EVERY VOID STATEMENT SO REMEMBER DON'T REPEAT YOUR CODE
