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
public class Consigna_5 {

    /*Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los 
números pares. El ciclo debe continuar hasta que el usuario ingrese el número 
0, momento en el que se debe mostrar la suma total de los pares ingresados.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int suma;
        suma = 0;
        
         System.out.print("Ingrese numeros, ingrese 0 para terminar el programa");
            numero = Integer.parseInt(input.nextLine());

              while (numero != 0) {
                  if (numero%2==0){
                  suma = suma + numero;}
            System.out.print("Ingrese numeros, ingrese 0 para terminar el programa");
            numero = Integer.parseInt(input.nextLine());
        }

        System.out.print("La suma de los numeros pares es " + suma);

    }
}
