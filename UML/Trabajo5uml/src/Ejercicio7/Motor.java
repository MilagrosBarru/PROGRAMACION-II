/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author milag
 */
public class Motor {
    private String numeroSerie;
    private String tipo;

    public Motor(String numeroSerie, String tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

        public String getNumeroSerie() {
            return numeroSerie;
        }

        public String getTipo() {
            return tipo;
        }


    
   public void mostrarMotor(){
       System.out.print(" El motor tiene el tipo: " + this.getNumeroSerie() + " y es de numero de serie: " + this.getTipo());
   } 
}
