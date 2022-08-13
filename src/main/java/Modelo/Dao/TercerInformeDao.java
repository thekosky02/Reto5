/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Modelo.JDBCUtilities;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Familia
 */
public class TercerInformeDao {
    
    public static ResultSet consulta() {
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            var conn = JDBCUtilities.getConnection();
            String csql = "SELECT ID_Compra,Constructora,banco_vinculado FROM Compra INNER JOIN Proyecto on Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE proveedor = 'Homecenter' and ciudad = 'Salento'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
