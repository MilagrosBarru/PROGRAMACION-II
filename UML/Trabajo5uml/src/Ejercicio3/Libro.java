/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author milag
 */
public class Libro {
    private String titulo;
    private int isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, int isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void mostrarLibro(){
        System.out.print("El libro tiene el titulo: " + titulo + " Autor: " + autor.getNombre() + " La editorial es " + editorial.getNombre());
    }
            
}
