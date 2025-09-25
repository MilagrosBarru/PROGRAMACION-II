/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author milag
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    
    public Computadora(String marca, String numeroSerie,String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre =  new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario !=null && propietario.getComputadora()!= this){
            propietario.setComputadora(this);
        }
    }
    
    public void mostrarComputadora(){
    System.out.print("Esta computadora pertenece a: " + propietario.getNombre() +
            "Y su placa madre tiene la siguiente informacion: " );
    System.out.println();
    placaMadre.mostrarPlacaMadre();
            }
    
    
    
    
}
