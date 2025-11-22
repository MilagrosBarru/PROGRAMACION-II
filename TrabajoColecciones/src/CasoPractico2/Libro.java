/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico2;

/**
 *
 * @author milag
 */
public class Libro {
   private  String isbn ;
private String titulo ;
private int anioDePublicacion;
private Autor autor;

    public Libro(String isbn, String titulo, int anioDePublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
        this.autor = autor;
    }

    
    public String mostrarInfo() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioDePublicacion=" + anioDePublicacion + ", autor=" + autor + '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

}
