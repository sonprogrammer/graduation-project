package com.example.SchoolBus.Tensorflow;
import java.sql.*;

public class DataPreprocessing {
    static final String DB_URL = "jdbc:mariadb://localhost:3306/mydatabase";
    static final String USER = "user";
    static final String PASS = "password";

    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable")) {

            while(rs.next()) {
                int id = rs.getInt("id");
                double feature1 = rs.getDouble("feature1");
                double feature2 = rs.getDouble("feature2");
                double label = rs.getDouble("label");

                // Do something with the data...
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}