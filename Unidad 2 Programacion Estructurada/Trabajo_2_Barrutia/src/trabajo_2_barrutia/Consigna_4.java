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
/*culadora de Descuento según categoría. 
Escribe un programa que solicite al usuario el precio de un producto y 
su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el 
precio final*/
public class Consigna_4 {

    final static double PORCENTAJE_A = 0.90;
    final static double PORCENTAJE_B = 0.85;
    final static double PORCENTAJE_C = 0.80;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Categoria;
        double precio;
       double descuentoA;
        double descuentoB;
        double descuentoC;

        //aNTES ESTABA ACA el calcul de los descuentos pero al no estar inicializada daba error
        //Se piden al usuario la cateogira y el precio
        System.out.print("Ingrese la categoria");
        Categoria = input.nextLine();
        System.out.print("Ingrese el precio");
        precio = Double.parseDouble(input.nextLine());

        //Calculo de descuentos
        descuentoA = precio * PORCENTAJE_A;
        descuentoB =  precio * PORCENTAJE_B;
        descuentoC = precio * PORCENTAJE_C;
        switch (Categoria) {

            case "A" -> { 
                System.out.print("El precio con el descuento es " + descuentoA);
                System.out.println();
            }
            
       
            case "B" -> { 
                System.out.print("El precio con el descuento es "+ descuentoB);
                System.out.println();
            }
            case "C" -> { 
                System.out.print("El precio con el descuento es " + descuentoC);
                System.out.println();
            } 
            }
        }
    }




























