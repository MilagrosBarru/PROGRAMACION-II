/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3Empleados;

/**
 *
 * @author milag
 */
public class EmpleadoPlanta extends Empleado {

    public EmpleadoPlanta() {
    }

    public EmpleadoPlanta(String dni, String nombre, int horas_trabajadas) {
        super(dni, nombre, horas_trabajadas);
    }
    
    
    

    public String calcularSueldo(){
       int sueldo= getHoras_trabajadas() * 16000;
        return " El salario de"+ this.getNombre() + "es" + sueldo;
    }
}
