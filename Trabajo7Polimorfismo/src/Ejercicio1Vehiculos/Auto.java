/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Vehiculos;

/**
 *
 * @author milag
 */
public class Auto extends Vehiculo {
   private int cantidadPuertas;

  

    public Auto(String modelo, String marca,int cantidadPuertas) {
        super(modelo, marca);
        this.cantidadPuertas = cantidadPuertas;
    }

@Override
public void mostrarInfo(){
super.mostrarInfo();
System.out.print("Cantidad de puertas" + cantidadPuertas);
}}