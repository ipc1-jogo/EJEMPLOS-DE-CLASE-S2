/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo4;

/**
 *
 * @author jogo
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        
        Alumno alumnos[] = new Alumno[10];
        insertar(alumnos, "Fulanito de Tal", 80.50);
        insertar(alumnos, "Menganito de Tal", 50.50);
        insertar(alumnos, "Tenganito de Tal", 80.50);
        insertar(alumnos, "Cenganito de Tal", 70.50);
        modificar(alumnos, 1,"Miguel Angel Asturias", 98.50);
        mostrar(alumnos);

        
//        Alumno alumno1 = new Alumno( "Fulanito de Tal", 78.50);
//        Alumno alumno2 = new Alumno("Menganito de Tal", 80.50);
//        Alumno alumno3 = new Alumno( "Tenganito de Tal", 50.50);

        
//        Alumno alumnoBuscado = buscar(alumnos, 3);
//        
//        if(alumnoBuscado != null) {
//            System.out.println("El promedio del alumno " +alumnoBuscado.getNombre()+" es: "+alumnoBuscado.getPromedio());
//        }
//        else {
//            System.out.println("Alumno no encontrado");
//        }
//        

        
//
//        alumno1.setPromedio(80.75);
//        System.out.println("El promedio del alumno " +alumno1.getNombre()+" es: "+alumno1.getPromedio());
    }
    
    public static void mostrar(Alumno alumnos[]) {
        for(int i = 0; i< alumnos.length; i++ ){
            if(alumnos[i] != null) {
                System.out.println("El promedio del alumno " + alumnos[i].getCarnet() + " "+ alumnos[i].getNombre()+" es: "+ alumnos[i].getPromedio());
            }
        }
    }
    
    public static Alumno buscar(Alumno alumnos[], int carnet) {
        for(int i = 0; i< alumnos.length; i++ ){
            if(alumnos[i] != null) {
                if(alumnos[i].getCarnet() == carnet) {
                    return alumnos[i];
                }
            }
        }
        return null;
    }
    
    public static void insertar(Alumno alumnos[], String nombre, double promedio) {
        Alumno nuevoAlumno = new Alumno( nombre, promedio);
        
        for(int i = 0; i< alumnos.length; i++ ){
            if(alumnos[i] == null) {
                alumnos[i] = nuevoAlumno;
                return;
            }
        }
    }
    
    public static void eliminar(Alumno alumnos[], int carnet) {
        for(int i = 0; i< alumnos.length; i++ ){
            if(alumnos[i] != null) {
                if(alumnos[i].getCarnet() == carnet) {
                    alumnos[i] = null;
                    return;
                }
            }
        }
    }
    
    public static void modificar(Alumno alumnos[], int carnet, String nombre, double promedio) {
        for(int i = 0; i< alumnos.length; i++ ){
            if(alumnos[i] != null) {
                if(alumnos[i].getCarnet() == carnet) {
                    alumnos[i].setCarnet(carnet);
                    alumnos[i].setNombre(nombre);
                    alumnos[i].setPromedio(promedio);
                    return;
                }
            }
        }
    }
    
    
}

//|0           | 1            |2     |3     |4     |..
//| null       |@ajkdjf1  |null  |null  |null |