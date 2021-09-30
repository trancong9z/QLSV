/*
ket noi database
 */
package database;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseHelper {

    public static Connection openConnection() throws Exception{

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl ="jdbc:sqlserver://localhost:1433;databaseName=BTLSV";
        String username ="sa";
        String password ="123";
        Connection con= DriverManager.getConnection(connectionUrl,username,password);
        
        return con;
    }
    public static void main(String[] args) {
        new DatabaseHelper();
    }
    
    
}
