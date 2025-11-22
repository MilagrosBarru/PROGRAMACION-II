/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author milag
 */
public class Biblioteca {
private String nombre;
private List <Libro> libros = new ArrayList<>();

  

public void agregarLibro(String isbn, String titulo,int anioPublicacion,Autor autor){;
libros.add(new Libro(isbn,titulo,anioPublicacion,autor));}



public void listarLibros(){if (libros.isEmpty()) {
            System.out.println("No hay libros");
        } else {
            for (int i = 0; i < libros.size(); i++) //Obtiene el objeto con el get, y con el punto que metodo quiero de ese objeto
            {
                System.out.print(libros.get(i).mostrarInfo());
            }
        }
};
public void buscarLibroPorIsbn(String isbn)
{ Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator();

        while (it.hasNext() && libroEncontrado == null) {
            Libro l = it.next();
            if (l.getIsbn().equals(isbn)) {
           
                libroEncontrado = l;
                System.out.print(l.mostrarInfo());
            }
        }
}
public void eliminarLibro(String isbn){
Libro libroEncontrado =null;
        Iterator <Libro> it=this.libros.iterator();
        while (it.hasNext() && libroEncontrado == null) {
            Libro l = it.next();
            if (l.getIsbn().equals(isbn)) {
                it.remove();
                libroEncontrado = l;
            }
            this.listarLibros();}
}
public void obtenerCantidadLibros(){
  
        System.out.print("El total de los librod es: " + libros.size());}


public void filtrarLibrosPorAnio(int anio){
ArrayList<Libro> librosEncontrados = new ArrayList<>(); // defino la lista de productos no tiene nada q ver con el iterator
        Iterator<Libro> it = this.libros.iterator(); // Creo el iterador que va recorrer toda la lista de productos
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getAnioDePublicacion() == anio) 
            {librosEncontrados.add(l);
            }
        }
}
public void mostrarAutoresDisponibles(){
    
    List<Autor> autoresYaVistos = new ArrayList<>();

    for (int i = 0; i < libros.size(); i++) {
        // 1. Obtener el objeto Autor del libro actual
        Autor autorActual = libros.get(i).getAutor(); 

        if (!autoresYaVistos.contains(autorActual)) {
            autoresYaVistos.add(autorActual);

            System.out.println(autorActual.mostrarInfo()); 
        }
    }
}
  
}
