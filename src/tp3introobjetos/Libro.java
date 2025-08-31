/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introobjetos;

/**
 *
 * @author Esteban
 */
public class Libro {
    //Crear una clase Libro con atributos privados: titulo, autor,añoPublicacion.
    //Métodos requeridos: Getters para todos los atributos. Setter con validación
    //para añoPublicacion.
    
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion != 0) {
            this.añoPublicacion = añoPublicacion;
        }else {
            System.out.println("Anio invalido");
        }
    }
    
}
    
    

