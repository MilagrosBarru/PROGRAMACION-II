/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author milag
 */
public class Main {
      public static void main(String[] args) {
          Paciente pac= new Paciente("Milagros Barrutia", "IOMA");
          Profesional prof = new Profesional (" German Rodriguez","Dermatologo");
          CitaMedica citamedica= new CitaMedica("07/08/25", "9:00");
          
          
          citamedica.setProfesional(prof);
          citamedica.setPaciente(pac);
          citamedica.mostrarCita();
      }
}
