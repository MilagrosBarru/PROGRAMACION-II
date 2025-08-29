/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_2_barrutia;

import java.util.Scanner;

/**
 *
 * @author milag
 */
/*  Composición de funciones para calcular costo de envío y total de compra. 
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de 
envío basado en la zona de envío (Nacional o Internacional) y el peso del 
paquete. 
Nacional: $5 por kg  
Internacional: $10 por kg 
b. calcularTotalCompra(double precioProducto, double 
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con 
el costo de envío. 
Desde main(), solicita el peso del paquete, la zona de envío y el precio 
del producto. Luego, muestra el total a pagar.*/
public class Consigna_9 {

    static double calcularCostoEnvio(double peso, String zona) {
/*Tu método calcularCostoEnvio devuelve un double, pero solo has contemplado dos condiciones (Internacional y Nacional). Si el valor de zona no coincide con ninguna de esas dos, la función no retorna nada, lo cual es ilegal en Java para métodos que deben devolver un valor.
Tu método calcularCostoEnvio devuelve un double, pero solo has contemplado dos condiciones (Internacional y Nacional). Si el valor de zona no coincide con ninguna de esas dos, la función no retorna nada, lo cual es ilegal en Java para métodos que deben devolver un valor.

Solución:

Debes manejar el caso en que zona no sea ni "Internacional" ni "Nacional". Puedes hacer esto agregando un else final con un valor por defecto o lanzando una excepción si es un error.
*/


        if (zona.equalsIgnoreCase("Internacional")) 
        { return peso * 10;}
         else if (zona.equalsIgnoreCase("Nacional"))
         {return peso * 5;} 
         else{return 0;}
    }
    

    static double calcularTotalCompra(double precioProducto, double CostoEnvio) {
        return  precioProducto+CostoEnvio;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
       System.out.print("Ingresa la peso");
       double peso = Double.parseDouble(input.nextLine()); 
       System.out.print("Ingresa la zona");
        String zona = input.nextLine();
        System.out.print("Ingresa el precio del producto");
        double precio = Double.parseDouble(input.nextLine()); 
        
        
        calcularCostoEnvio(peso,zona);
        double total_compra=calcularTotalCompra(precio,calcularCostoEnvio(peso,zona));
        System.out.print(" el precio del envio es : "+ total_compra);
    }
    
    
}

