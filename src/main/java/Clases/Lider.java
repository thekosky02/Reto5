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
public class Lider {
    private int id;
    private String nombre;
    private String primerApellido;
    private String ciudadRecidencia;

    public Lider(int id, String nombre, String primerApellido, String ciudadRecidencia) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.ciudadRecidencia = ciudadRecidencia;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the ciudadRecidencia
     */
    public String getCiudadRecidencia() {
        return ciudadRecidencia;
    }

    /**
     * @param ciudadRecidencia the ciudadRecidencia to set
     */
    public void setCiudadRecidencia(String ciudadRecidencia) {
        this.ciudadRecidencia = ciudadRecidencia;
    }
}
