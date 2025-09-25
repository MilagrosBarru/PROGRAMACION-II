/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author milag
 */
public class Reserva {

    private String fecha;
    private String hora;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;

    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    public void mostrarReserva()
    { System.out.print ("La reserva tiene fecha para" + this.getFecha() + "a la hora : " + this.getHora()+
            "en la mesa" + mesa.getNumero() + "Y es del cliente: ");
    }
   

}
    
          
    
    
    
