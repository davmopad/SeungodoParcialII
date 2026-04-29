/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConectMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author davmo
 */
public class Conectar {

    private static final String url = "jdbc:mysql://localhost:3306/TicoSoftRH";
    private static final String user = "root";
    private static final String password = "admin$1234";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    public Connection connect() throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("si");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no");
        }
        return con;
    }

}
