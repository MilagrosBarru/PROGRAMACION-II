/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico2;

/**
 *
 * @author milag
 */
public class Main {
    public static void main(String[] args) {
        //punto 1
        Biblioteca biblioteca= new Biblioteca();
        //punto 2
        Autor a1= new Autor("01","Julio Cortazar","Argentino");
        Autor a2= new Autor("02"," Stephen King","Estados Unidos");
        Autor a3= new Autor("03","John Katzenbach","Ingles");
        
        
        biblioteca.agregarLibro("1235454560","Bestiario",1960,a1);
         biblioteca.agregarLibro("1235454561","Dr Sueño",1960,a2);
          biblioteca.agregarLibro("1235454554","Rayuela",1960,a1);
           biblioteca.agregarLibro("456468221","El psicoanalista",1960,a3);
            biblioteca.agregarLibro("456445665","Juegos de ingenio",1960,a3);
            
            biblioteca.obtenerCantidadLibros();
            biblioteca.mostrarAutoresDisponibles();
}
    
    
}