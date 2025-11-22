/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Vehiculos;

/**
 *
 * @author milag
 */
public class Vehiculo {
    private String modelo;
    private String marca;

    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public void mostrarInfo(){
        System.out.print("El vehiculo es modelo: " + modelo + "Y marca: " + marca);
    };
}
