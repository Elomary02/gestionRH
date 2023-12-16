package com.example.gestionrh.Model;

import java.sql.*;

public class DatabaseHandler {
    private Connection connection;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/gestion_rh";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public DatabaseHandler() {
        try {
            this.connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    /*
     * User Section
     * */

    public ResultSet getEmployeData(String fname, String employe_password) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM employe WHERE fname = ? AND employe_password = ?";
            preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setString(1, fname);
            preparedStatement.setString(2, employe_password);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getEmployeInfos(String fname, String lname, String phoneNumber, String email, Date birthday, String adress, String post, Double salary) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM employe WHERE fname = ? AND lname = ? AND phoneNumber = ? AND email = ? AND birthday = ? AND adress = ? AND post = ? AND salary = ?";
            preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setString(1, fname);
            preparedStatement.setString(2, lname);
            preparedStatement.setString(3, phoneNumber);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, String.valueOf(birthday));
            preparedStatement.setString(6, adress);
            preparedStatement.setString(7, String.valueOf(salary));
            preparedStatement.setString(8, post);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void insertNewEmploye(String employe_password, String fname, String lname,
                                 Date birthday, String address, String phoneNumber, String email,
                                 Double salary, String post) {
        PreparedStatement preparedStatement = null;
        try {
            String query = "INSERT INTO employe (employe_password, fname, lname, birthday, adress, phoneNumber, email, salary, post) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setString(1, employe_password);
            preparedStatement.setString(2, fname);
            preparedStatement.setString(3, lname);
            preparedStatement.setDate(4, birthday);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, phoneNumber);
            preparedStatement.setString(7, email);
            preparedStatement.setDouble(8, salary);
            preparedStatement.setString(9, post);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * Admin Section
     * */
    public ResultSet getAdminData(String username, String password) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
