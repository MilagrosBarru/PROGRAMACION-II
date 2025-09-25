/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author milag
 */
public class TarjetaDeCredito {
    private String numero;
    private String FechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TarjetaDeCredito(String numero, String FechaVencimiento, Banco banco) {
        this.numero = numero;
        this.FechaVencimiento = FechaVencimiento;
        this.banco = banco;
    }
       public void mostrarTarjeta(){
       System.out.print(" La tarjeta numero" + numero + " es del banco: " + banco.getNombre()+ " y pertenece al cliente " + cliente.getNombre());
       }
   }
    

