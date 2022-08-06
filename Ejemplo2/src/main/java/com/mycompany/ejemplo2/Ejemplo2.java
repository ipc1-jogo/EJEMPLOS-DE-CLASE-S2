/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo2;

/**
 *
 * @author jogo
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        // Suma de todos los antecesores de un número hasta 0
        // 10 = 10 + 9 +8 +7 +6 +5+ 4+ 3 + 2 +1 ----xxx
        
        int suma = sumaRecursiva(10);
        System.out.println(suma);
        System.out.println("Resultado suma recursiva: " + suma);
    }
    
    public static int sumaRecursiva(int numero) {
        if(numero > 1) {
            return numero + sumaRecursiva(numero - 1);
        }
        else {
            return 1;
        }
    }
    
    public static int suma(int num_pam) {
        int suma = 0;
        for(int numero = num_pam; numero > 0; numero--) {
            suma += numero;
        }
        return suma;
    }
}
