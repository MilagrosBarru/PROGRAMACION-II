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
public class Consigna_6 {
    /*Contador de Positivos, Negativos y Ceros (for).  
Escribe un programa que pida al usuario ingresar 10 números enteros y 
cuente cuántos son positivos, negativos y cuántos son ceros.*/


public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 int numero;
 int numeros_positivos;
 int numeros_negativos;
 int cant_ceros;
 numeros_positivos=0;
 numeros_negativos=0;
 cant_ceros=0;
 
 for(int i=1;i<=10;i++){
     System.out.print("Ingrese el numero " + i);
     numero=input.nextInt();
 
if (numero>0) {
    numeros_positivos=numeros_positivos +1;}
 else if (numero<0){numeros_negativos=numeros_negativos + 1;}
 else {cant_ceros= cant_ceros +1;};
 }
    
  System.out.print("La cantidad de ceris es" + cant_ceros);
  
  System.out.print("La cantidad de numeros positivos es" + numeros_positivos );
  System.out.print("La cantidad de numeros negativos es" + numeros_negativos );
 }}
       









