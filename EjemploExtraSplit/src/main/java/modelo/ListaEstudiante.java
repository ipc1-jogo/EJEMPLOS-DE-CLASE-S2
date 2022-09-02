/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jogo
 */
public class ListaEstudiante {
    private static Estudiante[] estudiantes = new Estudiante[5];
    
    public Estudiante buscar(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                if (estudiante.getId() == id) {
                    return estudiante;
                }
            }
        }
        return null;
    }
    
    public void insertar(Estudiante estudiante) {        
        for(int i = 0; i< estudiantes.length; i++ ){
            if(estudiantes[i] == null) {
                estudiantes[i] = estudiante;
                return;
            }
        }
    }
    
    public void eliminar(int id) {
        for(int i = 0; i< estudiantes.length; i++ ){
            if(estudiantes[i] != null) {
                if(estudiantes[i].getId() == id) {
                    estudiantes[i] = null;
                    return;
                }
            }
        }
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
}
