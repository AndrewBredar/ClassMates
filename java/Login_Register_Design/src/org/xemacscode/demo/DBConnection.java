/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xemacscode.demo;

import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Nassim
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
    static final String USER = "root";
    static final String PASS = "Googlechrome1*";
    public static Connection connectDB() {
        Connection conn = null;
        try {
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (Exception ex) {
            System.out.println("There were errors while connecting to DB");
            return null;
        }
    }
}
