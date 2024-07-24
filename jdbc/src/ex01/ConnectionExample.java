package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // https://dev.mysql.com/doc/connector-j/en/connector-j-examples.html
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "1234");

            String sql = "SELECT * FROM city";

            // https://dev.mysql.com/doc/connector-j/en/connector-j-query-attributes.html
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ID") + "\t" + rs.getString("Name"));
            }

            // System.out.println("연결 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    // System.out.println("연결 끊기");
                } catch (SQLException e) {
                }
            }
        }
    }
}