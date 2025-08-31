/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        
        miMascota.nombre = "Ofelia";
        miMascota.especie = "Perro";
        miMascota.edad = 2;
        
        miMascota.mostrarInfo();
        miMascota.cumplirAnios();
        miMascota.mostrarInfo();
    }
    
}
