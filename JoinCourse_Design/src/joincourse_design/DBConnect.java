/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joincourse_design;
import java.sql.*;

/**
 *
 * @author alexi
 */
public class DBConnect {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "agsg1935";
    private static final String CONN_STRING = 
        "jdbc:mysql://localhost:3307/sql_ctest?\" + \"autoReconnect=true&useSSL=false";
    
    public static Connection getConn() {
        Connection conn = null;
        try{
          conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
          return conn;
         
        }catch(SQLException e){
          System.err.println(e);
          return null;
      }
    }
    
    public static ResultSet getData(String sq) throws Exception {
        return DBConnect.getConn().createStatement().executeQuery(sq);
    }
}
