/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author milag*13. GeneradorQR - Usuario - CódigoQR
a. Asociación unidireccional: CódigoQR → Usuario
b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i. CodigoQR: valor.
ii. Usuario: nombre, email.
iii. GeneradorQR->método: void generar(String valor, Usuario usuario)
 */
public class GeneradorQR {
    public void generar(CodigoQR codigoqr, String nombre, String email)
    {
            Usuario user = new Usuario(nombre,email);
            System.out.print("El valor del QR es" + codigoqr.getValor()  + " para el usuario" + user.getNombre());       
}}
