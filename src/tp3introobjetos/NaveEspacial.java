/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    private static final int MAX_COMBUSTIBLE = 100; 
    //Métodos requeridos: despegar(), avanzar(distancia),
    //recargarCombustible(cantidad), mostrarEstado().
    
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, MAX_COMBUSTIBLE);    
    }
    
        public void despegar() {
         if (combustible >= 10) {
            combustible -= 10;
            System.out.println("🚀 " + nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("⚠️ No hay suficiente combustible para despegar. Se requieren al menos 10 unidades.");
        } 
     }
        
        public void avanzar(int distancia) {
            if (combustible >= distancia) {
                combustible -= distancia;
                System.out.println("🛰️ " + nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
         } else {
                System.out.println("⛔ No hay suficiente combustible para avanzar " + distancia + " unidades. Combustible actual: " + combustible);
         }
      }
        
        public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede agregar una cantidad negativa o cero de combustible.");
        return;
        }
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("⛽ Combustible recargado al máximo (100 unidades).");
       } else {
            combustible += cantidad;
            System.out.println("⛽ " + nombre + " ha recargado " + cantidad + " unidades. Combustible actual: " + combustible);
       }
     }
        public void mostrarEstado() {
        System.out.println("\n🚀 Nave: " + nombre);
        System.out.println("⛽ Combustible disponible: " + combustible + " unidades");
        System.out.println("-----------------------------");
    }

     

}