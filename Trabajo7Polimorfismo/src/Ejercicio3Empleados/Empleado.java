/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3Empleados;

/**
 *
 * @author milag
 */
public abstract class Empleado {
     private String dni;
    private String nombre;
    private int horas_trabajadas;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, int horas_trabajadas) {
        this.dni = dni;
        this.nombre = nombre;
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }
    
    
    public abstract String calcularSueldo();
    
}
