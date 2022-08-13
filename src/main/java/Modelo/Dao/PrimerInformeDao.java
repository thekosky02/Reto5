/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Clases.Lider;
import Modelo.JDBCUtilities;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Familia
 */
public class PrimerInformeDao {
    
    public static ResultSet consulta() {
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            var conn = JDBCUtilities.getConnection();
            String csql = "SELECT ID_Lider,nombre,primer_apellido,ciudad_residencia FROM Lider ORDER by ciudad_residencia ASC";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return rs;
    }
}
