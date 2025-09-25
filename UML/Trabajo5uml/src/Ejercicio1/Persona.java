/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author milag
 */
public class Persona {
    private String nombre;
    private Pasaporte pasaporte;
//constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if(pasaporte!=null && pasaporte.getPersona()!=this){pasaporte.setPersona(this);}
        
    }}
    
    

