/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author milag
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Propietario propietario;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
   public void mostrarVehiculo(){
    System.out.println ("El vehiculo es de modelo: " + this.getModelo() +" Y la patente es" + this.getPatente());
            motor.mostrarMotor();
           System.out.print("El autor pertenece a" + propietario.getNombre());
}
}
