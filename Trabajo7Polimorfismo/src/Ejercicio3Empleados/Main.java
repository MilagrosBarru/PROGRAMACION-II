/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3Empleados;
//Clase abstracta: Empleado con método calcularSueldo()
//● Subclases: EmpleadoPlanta, EmpleadoTemporal


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente,
//usar instanceof para clasificar 
/**
 *
 * @author milag
 */
public class Main {
   
    public static void main(String[] args) {
     List<Empleado> empleados = new ArrayList<>(); 

EmpleadoPlanta e1= new EmpleadoPlanta("12626515","Alberto Suarez ", 25);
EmpleadoTemporal e2= new EmpleadoTemporal("12626415","Sebastian Benitez  ", 25);
EmpleadoPlanta e3= new EmpleadoPlanta("12626515","Alberto Suarez ", 20);
EmpleadoPlanta e4= new EmpleadoPlanta("12626515","Alberto Suarez ", 13);
EmpleadoPlanta e5= new EmpleadoPlanta("12626515","Alberto Suarez ", 9);
EmpleadoTemporal e6= new EmpleadoTemporal("12626415","Sebastian Benitez  ", 36);
EmpleadoTemporal e7= new EmpleadoTemporal("12626415","Sebastian Benitez  ", 18);
  
 empleados.addAll(Arrays.asList(e1, e2, e3, e4,e5,e6,e7));

  
    for (Empleado empleadoss : empleados)
    { System.out.println(empleadoss.calcularSueldo());}
            
            }
    
    
    }


