/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Vo;

import Clases.Lider;
import Modelo.Dao.PrimerInformeDao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Familia
 */
public class PrimerInformeVo {
    
    public static LinkedList<Lider> valores() {
        LinkedList<Lider> listLd = new LinkedList<>();
        
        try {
            ResultSet rs = PrimerInformeDao.consulta();
            
            while (rs.next()) {
                int id = rs.getInt("ID_Lider");
                String nombre = rs.getString("nombre");
                String pApellido = rs.getString("primer_Apellido");
                String ciudad = rs.getString("ciudad_residencia");

                Lider ld = new Lider(id,nombre,pApellido,ciudad);
                
                listLd.add(ld);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listLd;
    }
}
