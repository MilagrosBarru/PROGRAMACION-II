/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author milag
 */
public class Main {

    public static void main(String[] args) {
        
       
        Usuario usuar= new Usuario("Milagros Barrutia","xx@gmail.com");
        
         Documento doc = new Documento("Documento1", "Texto", "1230","07/08/25", usuar);
    
         doc.mostrarDocumento();
        
}
}