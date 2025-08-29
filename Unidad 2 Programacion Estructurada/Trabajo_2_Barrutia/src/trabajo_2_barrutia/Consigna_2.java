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
public class Consigna_2 {

      public static void main(String[] args) {
   Scanner input= new Scanner(System.in);
   
    int num1; 
    int num2;
    int num3;
    
    System.out.print("Ingrese el numero 1: ");
    num1=Integer.parseInt(input.nextLine());
      System.out.print("Ingrese el numero 2: ");
    num2=Integer.parseInt(input.nextLine());
    System.out.print("Ingrese el numero 3: ");
    num3=Integer.parseInt(input.nextLine());
    
    if( (num1 > num2) && (num2>num3))
        {System.out.print("El numero 1 es el mayor numero ");} 
     else if ((num3 > num2) && (num2 > num1))
      {System.out.print("El numero 3 es el mayor numero ");}
      
     else if((num2 > num1 ) && (num1 > num3))
     {System.out.print("El numero 2 es el mayor numero");} 
      
      
      
      
      
      
      
      
      }}


