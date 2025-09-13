/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.pkg4.poo;

/*1. Implementar la clase Empleado aplicando todos los puntos anteriores. 
2. Crear una clase de prueba con método main que: 
○ Instancie varios objetos usando ambos constructores. 
○ Aplique los métodos actualizarSalario() sobre distintos 
empleados. 
○ Imprima la información de cada empleado con toString(). 
○ Muestre el total de empleados creados con 
mostrarTotalEmpleados().
 */
public class Trabajo4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Empleado a= new Empleado( 1,"Juan","Programador",456.5);
   Empleado b= new Empleado( "Pedro","Analista");
   Empleado c= new Empleado( "Juan","Soporte de redes");
   
   
    
    
   System.out.print(a);
    System.out.println();
   System.out.print(b);
    System.out.println();
   System.out.print(c);
    System.out.println();
   c.ActualizarSalario(50);
   System.out.println();
   b.ActualizarSalario();
   System.out.println();
   int totalEmpleados=Empleado.mostrarTotalEmpleados();
   System.out.println(" EL total de emplados es" + totalEmpleados);
   
    
    }
    
}
