/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jogo
 */
public class EstudianteDAO {
    ListaEstudiante estudiantes;

    public EstudianteDAO() {
        this.estudiantes = new ListaEstudiante();
    }
    
    public String insertar(String nombre, double promedio) {
        String mensaje = null;
        Estudiante estudiante = new Estudiante(nombre, promedio);
        estudiantes.insertar(estudiante);
        return mensaje;
    }
    
    public String Eliminar(int id) {
        String resultado = null;
        estudiantes.eliminar(id);
        return resultado;
    }
    
    public Estudiante obtenerUno(int id) {
        Estudiante estudiante = estudiantes.buscar(id);
        return estudiante;
    }
    
    public Estudiante[] obtenerTodos() {
        Estudiante[] listaEstudiantes = estudiantes.getEstudiantes();
        return listaEstudiantes;
    }
    
}
