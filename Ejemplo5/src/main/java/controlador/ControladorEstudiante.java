/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;
import modelo.EstudianteDAO;
import vista.JFEstudiante;

/**
 *
 * @author jogo
 */
public class ControladorEstudiante implements ActionListener {
    private EstudianteDAO modelo;
    private JFEstudiante vista;
    JButton btnCrear; 
    JButton btnVer;
    JButton btnBuscar;
    JTextField txfId;
    JTextField txfNombre; 
    JTextField txfPromedio;
    JTable tblEstudiantes;

    public ControladorEstudiante(EstudianteDAO modelo, JFEstudiante vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.btnBuscar = this.vista.getBtnBuscar();
        this.btnCrear = this.vista.getBtnCrear();
        this.btnVer= this.vista.getBtnVer();
        this.txfNombre = this.vista.getTxfNombre();
        this.tblEstudiantes = this.vista.getTblEstudiantes();
        this.txfId = this.vista.getTxfId();
        this.txfPromedio = this.vista.getTxfPromedio();
        this.btnCrear.addActionListener(this);
        this.btnVer.addActionListener(this);
    }
    
    public void crear() {
        String nombre = txfNombre.getText();
        String strPromedio = txfPromedio.getText();
        double promedio = Double.parseDouble(strPromedio);
        modelo.insertar(nombre, promedio);
    }
    
    
    
    public void llenarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tblEstudiantes.setModel(modeloTabla);
        
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Promedio");
        
        Estudiante[] estudiantes = modelo.obtenerTodos();
        
        Object columnas[] = new Object[3];
        
        for (Estudiante estudiante : estudiantes) {
            if(estudiante != null) {
                columnas[0] = estudiante.getId();
                columnas[1] = estudiante.getNombre();
                columnas[2] = estudiante.getPromedio();
                modeloTabla.addRow(columnas);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.btnCrear) {
            System.out.println("Creando...");
            crear();
        }
        
        if(e.getSource() == this.btnVer) {
            llenarTabla();
            System.out.println("Visualizando...");
        }
        
        if(e.getSource() == this.btnBuscar) {
            llenarTabla();
            System.out.println("Buscando...");
        }
    }
    
    
    
}
