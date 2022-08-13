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
public class SegundoInformeDao {
    
    public static ResultSet consulta() {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            var conn = JDBCUtilities.getConnection();
            String csql = "SELECT ID_Lider,constructora,numero_habitaciones,ciudad FROM Proyecto WHERE clasificacion = 'Casa Campestre' AND ciudad IN ('Santa Marta','Cartagena','Barranquilla')";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        return rs;
    }
}
