/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *i. Celular: imei, marca, modelo
 * @author milag
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    
    
    public void setUsuario(Usuario usuario) {
        if (usuario!= null && usuario.getCelular() != this);
        {
        this.usuario = usuario;
    }}
    
    
    
    

public void MostrarCel(){
    System.out.println("El Celular es de marca: " + this.getMarca() + "con Imei: " + this.getImei()+ "Y el modelo es: " + this.getModelo()+ " Y la bateria tiene las siguientes caracteristicas: ");
 bateria.MostrarBateria();
 System.out.print("El celular pertenece al usuario: " + usuario.getNombre() +"Con numero de dni: " + usuario.getDni());
}
    
    
    
    
}

