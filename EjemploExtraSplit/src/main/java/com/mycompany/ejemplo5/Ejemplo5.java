/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo5;

/**
 *
 * @author jogo
 */
import controlador.ControladorEstudiante;
import modelo.EstudianteDAO;
import vista.JFEstudiante;

public class Ejemplo5 {

    public static void main(String[] args) {
        JFEstudiante vistaEstudiante = new JFEstudiante();
        EstudianteDAO modeloEstudiante = new EstudianteDAO();
        ControladorEstudiante ctrlEstudiante = new ControladorEstudiante(modeloEstudiante, vistaEstudiante);
        vistaEstudiante.setVisible(true);
//        String texto =  "Pluto,Amarillo,2\n" +
//                        "Firulais,café,1\n" +
//                        "Fido,Negro\n" +
//                        "Bolt,Blanco,3\n" +
//                        "Chems,Bensh,3\n" +
//                        "Fado,Gris,1\n" +
//                        "Fedo,Negro,4";
//        
//        String[] lineas = texto.split("\n");
//        
//        for(int i = 0; i < lineas.length; i++){
//            String[] columnas = lineas[i].split(",");
//            
//            try {
//                System.out.println("Nombre:" + columnas[0] + " Color:" + columnas[1]+" Edad:" + columnas[2]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("La linea No. " + i + 1 + " es erronea. " + "Valores: "+ lineas[i]);
//            }
//        }
        

    }
}
