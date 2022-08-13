/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Compra;
import Modelo.Vo.TercerInformeVo;
import java.util.LinkedList;

/**
 *
 * @author Familia
 */
public class TercerInformeCt {
    
    public static LinkedList<Compra> info() {
        LinkedList<Compra> listC = new LinkedList();
        try {
            listC = TercerInformeVo.valores();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listC;
    }
}
