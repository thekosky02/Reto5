/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Familia
 */
public class Proyecto {
    private int id;
    private String constructora;
    private int numHab;
    private String ciudad;

    public Proyecto(int id, String constructora, int numHab, String ciudad) {
        this.id = id;
        this.constructora = constructora;
        this.numHab = numHab;
        this.ciudad = ciudad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numHab
     */
    public int getNumHab() {
        return numHab;
    }

    /**
     * @param numHab the numHab to set
     */
    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
