package com.advance_jersey_app_3.app.payroll.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnetion {

    Connection conn;
    private static  databaseConnetion dbConnection;

    private  databaseConnetion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/payrol", "root", "");
    }

    public static  databaseConnetion getDBConnection() throws ClassNotFoundException, SQLException {
        if(dbConnection==null){
            dbConnection=new  databaseConnetion();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return conn;
    }
}
