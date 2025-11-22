/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2FiguarGeometricas;

/**
 *
 * @author milag
 */

public class Circulo extends Figura{
 private static double pi=3.14;   
private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area=Math.pow(radio,2)*pi;
       return area;  // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void mostrarArea(){
        System.out.println("El area del circulo" + super.getNombre() + "es: " + this.calcularArea());
    }
    
    
    
}
