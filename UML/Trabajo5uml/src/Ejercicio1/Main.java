/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author milag
 */
public class Main {
   
/**
 *
 * @author milag
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancio la clase pasaporte con el objeto pasaporte
       Pasaporte pasaporte= new Pasaporte("123456","http//","PNG");
       //Instancio la clase persona con la persona a llamada Milagros
             Persona a = new Persona("Milagros");
             
    
    a.setPasaporte(pasaporte);
    pasaporte.setPersona(a);
    
    pasaporte.MostrarPasaporte();
}
}


