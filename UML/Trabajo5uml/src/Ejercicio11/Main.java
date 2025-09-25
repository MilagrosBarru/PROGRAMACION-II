/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *11. Reproductor - Canción - Artista
a. Asociación unidireccional: Canción → Artista
b. Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos:
i. Canción: titulo.
ii. Artista: nombre, genero.
iii. Reproductor->método: void reproducir(Cancion cancion)
 * @author milag
 */
public class Main {
    public static void main(String[] args) {
    Cancion cancion= new Cancion("JiJiJi");
    Artista artista = new Artista("Patricio Rey y los Redondos de Ricota", "Rock Nacional");
    Reproductor reproductor=  new Reproductor();
    
    cancion.setArtista(artista);
    reproductor.reproducir(cancion);
    
}}
