/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 * Batería: modelo, capacidad
 *
 * @author milag
 */
public class Bateria {

    private String modelo;
    private String capacidad;

    //Genero constructor 
    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;

    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void MostrarBateria() {
       System.out.println("Bateria capacidad: " + this.getCapacidad());
    System.out.println("Con modelo: " + this.getModelo());

    }

}
