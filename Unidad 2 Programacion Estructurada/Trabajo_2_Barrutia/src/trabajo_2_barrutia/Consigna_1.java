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
public class Consigna_1 {
     public static void main(String[] args) {
   Scanner input= new Scanner(System.in);
    
    int año;
 
    
     System.out.println ("Ingrese un numero ");
     año = Integer.parseInt(input.nextLine());

        
     if((año%4==0 && año%100!=0) || (año%4==0 && año%400==0 && año%100==0)){
            System.out.print(" EL anio es bisiesto");}
      else {System.out.print(" El a;o no es bisiesto");
                    }
    }
  

}
