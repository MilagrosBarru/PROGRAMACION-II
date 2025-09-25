/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author milag
 */
public class Main {
     public static void main(String[] args) {
   Propietario prop= new Propietario("Milagros Barrutia", "37605489");
   
    Computadora pc= new Computadora("HP", "12346", "PRO","2025");
    
    pc.setPropietario(prop);
   
    
    pc.mostrarComputadora();
   
    
}}
