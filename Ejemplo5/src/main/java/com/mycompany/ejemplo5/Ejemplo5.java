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
    }
}
