/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchui;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/shopping_assistant";
    private static final String USER = "your_mysql_username";
    private static final String PASSWORD = "your_mysql_password";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}