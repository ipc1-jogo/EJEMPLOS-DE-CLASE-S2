/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo1;

/**
 *
 * @author jogo
 */

import java.util.*;

public class Ejemplo1 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Ingrese un número: ");
      int numero = scan.nextInt();
      System.out.println("El número ingresado es : " + numero);
      
      if(numero % 2 == 0) {
          System.out.println("El número es par!");
      } 
      else {
          System.out.println("El número es impar!");
      }

    }
}
