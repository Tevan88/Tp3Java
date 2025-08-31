/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante();
        estu1.nombre = "Esteban";
        estu1.apellido = "Rivarola";
        estu1.curso = "1er anio";
        estu1.calificacion = 8;
        
        estu1.mostrarInfo();
        estu1.subirCalificacion(2);
        estu1.mostrarInfo();
        estu1.bajarCalificacion(5);
        estu1.mostrarInfo();
        
    }
    
}
