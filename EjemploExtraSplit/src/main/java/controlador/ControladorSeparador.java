/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import modelo.EstudianteDAO;
import vista.JFTexto;

/**
 *
 * @author jogo
 */
public class ControladorSeparador implements ActionListener {
    
    JFTexto vista;
    EstudianteDAO modelo;
    JButton btnSeparar;
    JTextArea txaTexto;

    public ControladorSeparador(EstudianteDAO modelo, JFTexto vista) {
        this.vista = vista;
        this.modelo = modelo;
        btnSeparar = vista.getBtnSeparar();
        txaTexto = vista.getTxaTexto();
        this.btnSeparar.addActionListener(this);
    }
    
    public void separar(String texto) {    
        
        String[] lineas = texto.split("\n");
        
        for(int i = 0; i < lineas.length; i++){
            String[] columnas = lineas[i].split(",");
            
            try {
                System.out.println("Nombre:" + columnas[0] + " Color:" + columnas[1]+" Edad:" + columnas[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("La linea No. " + i + 1 + " es erronea. " + "Valores: "+ lineas[i]);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSeparar) {
            System.out.println("Separando...");
            separar(txaTexto.getText());
        }
    }
    
    
    
}
