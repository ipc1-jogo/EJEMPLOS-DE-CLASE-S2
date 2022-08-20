/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo4;

/**
 *
 * @author jogo
 */
public class Alumno {
    private static int correlativo = 1;
    private int carnet;
    private String nombre;
    private double promedio;
    
    public Alumno(int canet, String nombre, double promedio) {
        this.carnet =canet;
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    public Alumno(String nombre, double promedio) {
        this.carnet = correlativo++;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    /**
     * @return the carnet
     */
    public int getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(int carnet) {
        this.carnet = carnet;
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
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
