/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author milag
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){
        System.out.print( " El monto del impuesto es: " + impuesto.getMonto() + " Y pertenece a " + impuesto.getContribuyente().getNombre());
    }
}
