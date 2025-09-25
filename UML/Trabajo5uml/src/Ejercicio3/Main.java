/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**3. Libro - Autor - Editorial
a. Asociación unidireccional: Libro → Autor
b. Agregación: Libro → Editorial
Clases y atributos:
i. Libro: titulo, isbn
ii. Autor: nombre, nacionalidad
iii. Editorial: nombre, direccion
 *
 * @author milag
 */
public class Main {
    public static void main(String[] args) {
    Editorial editorial = new Editorial("SIGLO XXI");
    Autor autor= new Autor("Julio Cortazar", "Argentina");
    Libro libro = new Libro("Bestiario", 12354678,editorial);
    
    libro.setAutor(autor);
    libro.mostrarLibro();
    }}
     
    

