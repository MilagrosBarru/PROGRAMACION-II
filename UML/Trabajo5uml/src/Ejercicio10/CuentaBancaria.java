/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author milag
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo; 
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion ) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo,ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getCbu() {
        return cbu;
    }

    public Titular getTitular() {
        return titular;
    }

   public void mostrarCuenta()
   {System.out.print(" La cuenta Bancaria con cbu: " + this.getCbu() + " Es del Titular: " + this.getTitular().getNombre() );
    
}}

