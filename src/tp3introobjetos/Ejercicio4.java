/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
        //mostrar su estado.
        
        Gallina galli1 = new Gallina();
        Gallina galli2 = new Gallina();
        
        galli1.huevosPuestos = 3;
        galli1.edad = 1;
        galli1.idGallina = 1;
        
        galli1.mostrarEstado(1);
        galli1.envejecer();
        galli1.ponerHuevos();
        galli1.mostrarEstado(1);
        
        galli2.huevosPuestos = 5;
        galli2.edad = 3;
        galli2.idGallina = 2;
        
        galli1.mostrarEstado(1);
        galli2.envejecer();
        galli2.ponerHuevos();
        galli1.mostrarEstado(1);       
        

    }
    
}
