/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2FiguarGeometricas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milag
 */
public class Main {
    
    public static void main(String[] args) {
     List<Figura> figuras = new ArrayList<>(); 
    
    
     Circulo circulo= new Circulo(4,"Circulo 1 ");
     Rectangulo rectangulo = new Rectangulo("Rectangulo 1 ",7,8);
       Circulo c2= new Circulo(4,"Circulo 2 ");
         Circulo c3= new Circulo(3,"Circulo 3 ");
           Circulo c4= new Circulo(2,"Circulo 4 ");
           Rectangulo r2 = new Rectangulo("Rectangulo 2 ",7,8);
                 Rectangulo r1 = new Rectangulo("Rectangulo 3",7,8);
           Rectangulo r3 = new Rectangulo("Rectangulo 4",7,8);
           
           
     
    figuras.add(circulo);
    figuras.add(rectangulo);
    figuras.add(c2);
    figuras.add(c3) ;
    figuras.add(c4);
    figuras.add(r1);
    figuras.add(r2);
    figuras.add(r3);
    
     for (Figura figura : figuras) {
    figura.mostrarArea();
}
      
   
     
   
     
     
     
    }
}
