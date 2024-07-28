/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Strix
 */
public class MySqlConnection {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/nature_kits";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    // Method to establish a connection to the database
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Registering the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nature_kits", "root", "");
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to connect to the database");
        }
        return connection;
    }
    
    
    public static void DefaultLoader(){
    }

}

