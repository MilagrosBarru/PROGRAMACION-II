/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author milag
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmadigital;

    public Documento(String titulo,String contenido, String codigoHash,String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmadigital = new FirmaDigital(codigoHash,fecha,usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
    public void mostrarDocumento()
    {System.out.print(" El documento tiene el titulo: " + this.getTitulo() + " Y su contenido es: " + this.getContenido()+
            " La firma digital es de codigo hash: " + firmadigital.getCodigoHash() + " Y pertenece a " + 
            firmadigital.getUsuario().getNombre());
            }
}
