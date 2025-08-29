/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_2_barrutia;

/**
 *
 * @author milag
 */
/*Arrays y Recursividad:  
12.  Modificación de un array de precios y visualización de resultados.  
Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Muestre los valores originales de los precios. 
c. Modifique el precio de un producto específico. 
d. Muestre los valores modificados.*/
public class Consigna_12 {
    
public static void main(String[] args) {
    double[] precios  = {100.0, 250.50, 30.50, 400.60};
    System.out.print("La lista de precios actual");
   for (int i=0; i<precios.length;i++)
   {System.out.println("Precio: " + precios[i]);}
  
   
   precios[2]=58.3;
   System.out.print("La lista de precios modificados");
   for (int i=0; i<precios.length;i++)
   {System.out.println("Precio modificado: " + precios[i]);}
  
   
}}

