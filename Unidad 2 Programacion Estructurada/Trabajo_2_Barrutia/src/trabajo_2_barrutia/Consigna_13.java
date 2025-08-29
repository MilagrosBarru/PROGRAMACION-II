/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_2_barrutia;



/**
 *
 * @author milag
 */
/*13.  Impresión recursiva de arrays antes y después de modificar un elemento. 
Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Use una función recursiva para mostrar los precios originales. 
c. Modifique el precio de un producto específico. 
d. Use otra función recursiva para mostrar los valores modificados.*/
public class Consigna_13 {
   static int[] devolverArray(int[] array, int i) {
    if (i == array.length) {
        return array; // caso base: cuando llegamos al final devolvemos el arreglo
    }
    // llamada recursiva para recorrer el array
    return devolverArray(array, i + 1);
}
     public static void main(String[] args) {
        
int[]array= {56,45,89,45,89,45};
System.out.print(devolverArray(array,6));


     }}
    
