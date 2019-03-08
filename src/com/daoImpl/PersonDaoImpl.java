package com.daoImpl;

import com.dao.PersonDao;
import com.entities.Person;
import com.until.ConnectionConfiguration;

import java.sql.*;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    private static String DB_URL = "jdbc:mysql://localhost:3308/company";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";


    @Override
    public void creatPersonTable() {



        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from person");
            // show data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3));
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }




    @Override
    public void insert(Person person) {

    }

    @Override
    public Person selectById(int id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Person person, int id) {

    }
}
