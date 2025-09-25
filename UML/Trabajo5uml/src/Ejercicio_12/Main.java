/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author milag
 */
public class Main {
  
    public static void main(String[] args) {
        Contribuyente contribuyente= new Contribuyente("Milagros Barrutia", " 3860247545");
        Impuesto impuesto = new Impuesto(46.3545);
        Calculadora calculadora= new Calculadora();
        
        impuesto.setContribuyente(contribuyente);
        calculadora.calcular(impuesto);
        
        
    }
}
