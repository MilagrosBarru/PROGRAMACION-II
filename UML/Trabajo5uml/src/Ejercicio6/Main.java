/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author milag
 */
public class Main {
  
     public static void main(String[] args) {
         
Cliente cliente = new Cliente("Milagros","22366850880");
Mesa mesa= new Mesa("5", "4 personas");
Reserva reserva= new Reserva("05/08", "19:00",mesa);
        cliente.setReserva(reserva);        
     reserva.mostrarReserva();
       cliente.mostrarCliente();
}
}