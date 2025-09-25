/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author milag
 */
public class Main {
    public static void main(String[] args) {
    
    Banco banco = new Banco ("Banco provincia");
    
    TarjetaDeCredito VISA= new TarjetaDeCredito("123456", "07/02/2026",banco);
    
    Cliente cliente= new Cliente("Milagros Barrutia", "38603968");
    
    
    VISA.setCliente(cliente);
    cliente.setTarjeta(VISA);
    VISA.mostrarTarjeta();
}}
