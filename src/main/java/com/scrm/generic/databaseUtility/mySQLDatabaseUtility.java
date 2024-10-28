package com.scrm.generic.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mySQLDatabaseUtility 
{
	
    // Database URL, Username, and Password
    private static final String URL = "jdbc:mysql://localhost:3306/suitecrm";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws ClassNotFoundException {
    	insertData("Shariq",12234);
	}
    // Method to insert data
    public static void insertData(String name, int age) throws ClassNotFoundException {
    	Class.forName("com.mysql.cj.jdbc.Driver");

        String insertQuery = "INSERT INTO users_dummy (name, age) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
