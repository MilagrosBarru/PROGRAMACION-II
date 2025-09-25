/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author milag
 */
public class Main {
    
    public static void main(String[] args){
        GeneradorQR generador = new GeneradorQR();
        CodigoQR codigoQR= new CodigoQR("12346");
        generador.generar(codigoQR, "Milagros", "milagrosbarrutia");
}}
