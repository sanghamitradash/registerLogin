package com.example.RegistrationLoginDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/your_database";
        String username = "postgres";
        String password = "orsac@123";

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Perform database operations here...

            // Close the connection when done
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
