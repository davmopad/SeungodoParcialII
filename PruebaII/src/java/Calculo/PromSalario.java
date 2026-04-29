/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import Constructores.Salario;
import java.util.List;
import java.sql.*;

/**
 *
 * @author davmo
 */
public class PromSalario {

    public List<Salario> Salariomesyanio(int ide, int anioc) {
        Connection conn = null;
        PreparedStatement p = null;
        ResultSet r = null;
        try {
            String sql = "SELECT * FROM Salarios \n"
                    + "WHERE id_empleado = ? AND ((anio = ? AND mes=12) OR (anio= ? AND mes BETWEEN ¨ AND ¨)";
            p = conn.PreparedStatement(sql);
            p.setInt(1, ide);
            p.setInt(2, anioc - 1);
            p.setInt(3, anioc);

            r = p.executeQuery();
        } catch (Exception e) {

        }
        return null;

    }

}
