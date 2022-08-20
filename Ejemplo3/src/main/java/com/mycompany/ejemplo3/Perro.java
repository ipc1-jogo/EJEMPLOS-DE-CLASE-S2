/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author jogo
 */
public class Perro {
    private String nombre;
    private String color;
    private int edad;
    
    public Perro(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    
    public void ladrar() {
        System.out.println("El perro que ladra es " + getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
