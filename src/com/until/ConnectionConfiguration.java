package com.until;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {
    public static Connection getConnection(){
        Connection connection = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/company","root","123456");
        }
        catch (Exception e){
         e.printStackTrace();
        }
        return connection;
    }
}
