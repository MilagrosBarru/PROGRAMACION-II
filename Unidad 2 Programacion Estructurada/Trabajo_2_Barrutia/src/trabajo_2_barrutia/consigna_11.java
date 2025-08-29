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
/*Cálculo de descuento especial usando variable global. 
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
método calcularDescuentoEspecial(double precio) que use la variable global para 
calcular el descuento especial del 10%. 
Dentro del método, declara una variable local descuentoAplicado, almacena 
el valor del descuento y muestra el precio final con descuento. 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 200 
El descuento especial aplicado es: 20.0 
El precio final con descuento es: 180.0*/
public class consigna_11 {
        static double DESCUENTO = 0.10;
        static double calcularDescuentoEspecial(double precio)
        {
          double  descuento_aplicado=precio-(precio*DESCUENTO);
            return descuento_aplicado;
            
        }
        
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    int precio;
    System.out.print("Ingrese el precio: ");
        precio = Integer.parseInt(input.nextLine());
        
       
  double precio_con_descuento=calcularDescuentoEspecial(precio);
        
        
   System.out.print("El precio con descuento es " + precio_con_descuento);
        
    }
        
        
        
        
        
}






}
