/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
        //uno válido, mostrar la información final.

        Libro nuevoLibro = new Libro();
        
        nuevoLibro.setAñoPublicacion(0);
        nuevoLibro.setAñoPublicacion(1944);
        System.out.println(nuevoLibro.getAñoPublicacion());
        System.out.println(nuevoLibro.getAutor() + " " + nuevoLibro.getTitulo() + " " + nuevoLibro.getAñoPublicacion());
       
    }
    
}
