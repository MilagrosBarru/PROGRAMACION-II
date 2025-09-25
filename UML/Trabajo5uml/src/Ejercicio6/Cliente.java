/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author milag
 */
public class Cliente {
    private String nombre;
    private String telefono;
private Reserva reserva; 



    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
   public void mostrarCliente()
    {
        System.out.print(" El cliente es" + this.getNombre() + " Su telefono es: "+ this.getTelefono());
    }
}
