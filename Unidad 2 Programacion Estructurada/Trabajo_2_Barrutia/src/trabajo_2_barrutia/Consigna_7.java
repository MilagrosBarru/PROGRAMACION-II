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
public class Consigna_7 {

    /*Validación de Nota entre 0 y 10 (do-while). 
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el 
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota 
hasta que ingrese un valor válido.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;
        System.out.print("Ingrese la nota por favor");
        nota = Integer.parseInt(input.nextLine());
        if (nota < 0 || nota > 10) {
            do {
                System.out.print("Ingrese una nota entre 0 y 10 por favor");
                nota = Integer.parseInt(input.nextLine());
            } while (nota < 0 || nota > 10);
        } 
        
            System.out.print("Nota guardada correctamente");
        

    }
}
