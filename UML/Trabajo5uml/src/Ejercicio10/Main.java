/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *CuentaBancaria - ClaveSeguridad - Titular
a. Composición: CuentaBancaria → ClaveSeguridad
b. Asociación bidireccional: CuentaBancaria ↔ Titular
Clases y atributos:
i. CuentaBancaria: cbu, saldo
ii. ClaveSeguridad: codigo, ultimaModificacion
iii. Titular: nombre, dni.

 * @author milag
 */
public class Main {
  

    public static void main(String[] args) {
        CuentaBancaria cuenta= new CuentaBancaria( "123456", 456, "123", "08/07/25");
        Titular tit = new Titular(" Milagros Barrutia", "38603968");
        
      
       cuenta.setTitular(tit);
        cuenta.mostrarCuenta();
       
    }
}
