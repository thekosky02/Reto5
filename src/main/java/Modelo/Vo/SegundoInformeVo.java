/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Vo;

import Clases.Proyecto;
import Modelo.Dao.SegundoInformeDao;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Familia
 */
public class SegundoInformeVo {
    
    public static LinkedList<Proyecto> valores() {
        LinkedList<Proyecto> listP = new LinkedList<>();
        
        try {
            ResultSet rs = SegundoInformeDao.consulta();
            
            while (rs.next()) {
                int id = rs.getInt("ID_Lider");
                String constructora = rs.getString("constructora");
                int numHab = rs.getInt("numero_habitaciones");
                String ciudad = rs.getString("ciudad");
                
                Proyecto p = new Proyecto(id,constructora,numHab,ciudad);
                
                listP.add(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listP;
    }
}
