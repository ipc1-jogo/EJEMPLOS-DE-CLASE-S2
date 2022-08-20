/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo3;

/**
 *
 * @author jogo
 */
public class Ejemplo3 {

    public static void main(String[] args) {
       
        
        Perro perro1 = new Perro("Firulais", "Negro", 1);  
        Perro perro2 = new Perro("Pluto", "Amarillo", 2);  
        perro2.setNombre("Snoopy");
        perro1.ladrar();
        perro2.ladrar();
        perro2 = perro1;
        perro2.setNombre("Bolt");
        perro1.ladrar();
        perro2.ladrar();
        
        
        
        
 
        

        
        
    
        
        
    }
}

