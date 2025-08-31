/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Mascota {
   //Crear una clase Mascota con los atributos: nombre, especie, edad.
   // Métodos requeridos: mostrarInfo(), cumplirAnios().
public String nombre;
public String especie;
public int edad;

void mostrarInfo(){
    System.out.println(nombre + " " + especie + " " + edad);
}

void cumplirAnios(){
    edad ++;
}
}
