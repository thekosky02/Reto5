/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Lider;
import Modelo.Vo.PrimerInformeVo;
import java.util.LinkedList;

/**
 *
 * @author Familia
 */
public class PrimerInformeCt {
    
    public static LinkedList<Lider> info() {
        LinkedList<Lider> listLd = new LinkedList();
            
        try {
            listLd = PrimerInformeVo.valores();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listLd;
    }
}
