/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author milag
 */
public class Pasaporte {
   
    private Persona persona;
       
    private String numero;
    private Foto foto;

    
    //constructor Pasaporte
    public Pasaporte(String numero, String imagen, String formato) {
        this.numero = numero;
        //usa el constructor creado en foto 
        this.foto =new Foto(imagen,formato);
    }
//getter y setter

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
   
    
    //seter para persona
    public void setPersona(Persona persona){
        this.persona=persona;
        if(persona!=null && persona.getPasaporte()!=this){persona.setPasaporte(this);
    }}

    public Persona getPersona() {
        return persona;
    }
    
    
    
    public void MostrarPasaporte() {
    System.out.print("Pasaporte con numero: " +numero + "Con foto: ");
           foto.Mostrarfoto();
           System.out.println();
           System.out.print("Este pasaporte pertenece a: " + persona.getNombre() );
    }
}
    


