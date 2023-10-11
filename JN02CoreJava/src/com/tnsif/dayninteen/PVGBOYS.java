package com.tnsif.dayninteen;
import java.sql.*;

public class PVGBOYS{

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PVG","root","962356");
            Statement stmt = con.createStatement(); 
            System.out.println("inserting records");
            String sql = "INSERT INTO pvg_it VALUES (25,'dipesh')"; 
            stmt.executeUpdate(sql); // 
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}