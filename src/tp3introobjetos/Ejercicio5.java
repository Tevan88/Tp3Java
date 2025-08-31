/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Apolo 11", 50);
        
        System.out.println("📌 Estado Inicial de la Nave:");
        nave1.mostrarEstado();

        System.out.println("\n🔄 Intentando avanzar 60 unidades sin recargar...");
        nave1.avanzar(60);
        
        // Recargar 40 unidades de combustible
        System.out.println("\n🔄 Recargando 40 unidades de combustible...");
        nave1.recargarCombustible(40);

        System.out.println("\n🔄 Intentando avanzar 60 unidades nuevamente...");
        nave1.avanzar(60);
        
        System.out.println("\n📌 Estado Final de la Nave:");
        nave1.mostrarEstado();



    }
    
}
