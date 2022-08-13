/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Proyecto;
import Modelo.Vo.SegundoInformeVo;
import java.util.LinkedList;

/**
 *
 * @author Familia
 */
public class SegundoInformeCt {
    
    public static LinkedList<Proyecto> info() {
        LinkedList<Proyecto> listP = new LinkedList<>();
        try {
            listP = SegundoInformeVo.valores();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listP;
    }
}
