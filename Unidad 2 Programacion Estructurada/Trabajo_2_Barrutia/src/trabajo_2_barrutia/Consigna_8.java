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
/*Cálculo del Precio Final con impuesto y descuento.  
Crea un método calcularPrecioFinal(double impuesto, double 
descuento) que calcule el precio final de un producto en un e-commerce. La 
fórmula es: 
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times 
Descuento) 
Desde main(), solicita el precio base del producto, el porcentaje de 
impuesto y el porcentaje de descuento, llama al método y muestra el precio 
final. 
E*/
public class Consigna_8 {
static double calcularPrecioFinal (double impuesto, double descuento,double PrecioBase )

{impuesto=impuesto/100;
descuento=descuento/100;
double PrecioFinal = PrecioBase + (PrecioBase * impuesto) - (PrecioBase * descuento); 
return PrecioFinal;
}

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double PrecioBase;
double porcentaje_impuesto;
double porcentaje_descuento;
double precio_final;

System.out.print("Ingrese el precio base del producto");
PrecioBase=Double.parseDouble(input.nextLine());

System.out.print("Ingrese el descuento del producto");
porcentaje_descuento=Double.parseDouble(input.nextLine());
System.out.print("Ingrese el impuesto del producto");
porcentaje_impuesto=Double.parseDouble(input.nextLine());

precio_final= calcularPrecioFinal(porcentaje_impuesto,porcentaje_descuento,PrecioBase);
System.out.print("El precio final del proudcto es" + precio_final);
}}
