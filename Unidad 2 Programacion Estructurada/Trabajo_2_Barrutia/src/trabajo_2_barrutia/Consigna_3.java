/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_2_barrutia;

import java.util.Scanner;
/*Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor"*/
/**
 *
 * @author milag
 */
public class Consigna_3 {
 public static void main(String[] args) {
Scanner input= new Scanner(System.in);   
   int edad;
    System.out.println("Ingrese su edad: ");
    edad= Integer.parseInt(input.nextLine());
   
    if ( edad <12 ){System.out.print("Niño");}
    else if( edad >=12 && edad<=17){System.out.print("Adolescente");}
    else if ( edad >=18 && edad <=59){System.out.print("Adulto")
            ;}
    else {System.out.print("Adulto mayor");}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}}
