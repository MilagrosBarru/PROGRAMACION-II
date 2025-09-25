/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 * 
 * bidireccional: Celular ↔ Usuario 
 *
 * @author milag
 */
public class Main {

    public static void main(String[] args) {
        //Instancio una bateria, para luego instanciar un celular y pasarle la bateria que instancie como parametro.
    //la vinculacion entonces se hizo a traves del constructor
   
   Bateria bat = new Bateria("Samsung", "5.4hZ");
   Celular cell = new Celular("123", "Samsung", "A33", bat);
   Usuario usuario= new Usuario("Milagros", "38603968");
   
   usuario.setCelular(cell);
   cell.setUsuario(usuario);

   cell.MostrarCel();
   
   
    
    
    }

}
