/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Vo;

import Clases.Compra;
import Modelo.Dao.TercerInformeDao;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Familia
 */
public class TercerInformeVo {
    
    public static LinkedList<Compra> valores() {
        LinkedList<Compra> listC = new LinkedList<>();
        try {
            ResultSet rs = TercerInformeDao.consulta();
            
            while (rs.next()) {

                int id = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("banco_vinculado");

                Compra c = new Compra(id,constructora,banco);               
                
                
                listC.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listC;
    }
}
