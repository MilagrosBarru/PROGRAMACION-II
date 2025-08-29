/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_2_barrutia;

import java.util.Scanner;

/*. Actualización de stock a partir de venta y recepción de productos. 
Crea un método actualizarStock(int stockActual, int cantidadVendida, 
int cantidadRecibida), que calcule el nuevo stock después de una venta y 
recepción 
de productos: 
NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
NuevoStock = CantidadVendida + CantidadRecibida 
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la 
cantidad recibida, y muestra el stock actualizado. */
/**
 *
 * @author milag
 */
public class Consigna_10 {
    static int actualizarStock(int stockActual, int cantidadVendida, 
int cantidadRecibida)
  { int NuevoStock;
NuevoStock=stockActual - cantidadVendida + cantidadRecibida;  
  return NuevoStock;}
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int stock_actual;
    int cantidad_vendida;
    int cantidad_recibida;
    
        System.out.print("Ingrese el stock actual");
        stock_actual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida");
        cantidad_vendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida");
        cantidad_recibida = Integer.parseInt(input.nextLine());
int nuevo_stock;
   nuevo_stock=actualizarStock(stock_actual,cantidad_vendida,cantidad_recibida);
        
        
   System.out.print("El stock actual es " + nuevo_stock);
        
    }

    

}
    
    
    
    
    
    
    




    

