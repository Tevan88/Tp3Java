/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Estudiante {
    //Crear una clase Estudiante con los atributos: nombre, apellido, curso,calificación.
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;
    
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    double subirCalificacion(double puntos){
        calificacion += puntos;
        return calificacion;
    }
    double bajarCalificacion(double puntos){
        calificacion -= puntos;
        return calificacion;
    }
}
