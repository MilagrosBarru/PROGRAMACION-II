/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author milag
 */
public class Main {
    public static void main(String[] args) {
        Propietario prop = new Propietario("Milagros BArrutia", "4850");
        Motor motor = new Motor("Comun", "46");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Fiat133", motor);

       prop.setVehiculo(vehiculo);  
        vehiculo.mostrarVehiculo();
        
         
         
         
}
}