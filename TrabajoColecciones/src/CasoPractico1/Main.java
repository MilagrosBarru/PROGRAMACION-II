/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

/**
 *
 * @author milag
 */
public class Main {
   //    public Producto(String id, String nombre, double precio, int cantidad, Categoria_Producto categoria) 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   //Creo el inventario  
   Inventario inventario= new Inventario();
   //punto 1, agrega productos al inventario
   inventario.agregarProductos(new Producto("01","Aceite",4000.0,5,CategoriaProducto.ALIMENTOS));
   inventario.agregarProductos(new Producto("02","Auriculares",500.0,15,CategoriaProducto.ELECTRONICA));
   inventario.agregarProductos(new Producto("03","Remera",2500.0,20,CategoriaProducto.ROPA));
   inventario.agregarProductos(new Producto("04","Harina",2700.0,25,CategoriaProducto.ALIMENTOS));
   inventario.agregarProductos(new Producto("05","Macetas",5500.0,35,CategoriaProducto.HOGAR));


System.out.println("---------------------------------------------------------------");
// Punto 2
inventario.listarProductos();
System.out.println("-------------------Punto 3 filtrar por id");
//Punto 3
    inventario.buscarProductosPorId("03");
    System.out.println("---------------Punto 4 -----------------------");
    //punto 4
    inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
    inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
    // punto 5 
    System.out.println("------------punto 5 eliminar producto");
    inventario.eliminarProducto("01");
    //punto 6
    System.out.println("------------punto 6 actualizar stock");
    inventario.actualizarStock("02", 8);
    System.out.println("-----------Mostrar el total stock disponible punto 7");
    inventario.obtenerTotalStock();
    System.out.println("-----------Mostrar producto con mayor Stock punto 8");
    inventario.obtenerProductoConMayorStock();
    System.out.println("-----------Filtrar productos por precio  punto 9");
    inventario.filtrarProductoPorPrecio(1000,3000);
    
    CategoriaProducto[] categoriaproduc=CategoriaProducto.values();
    for( int i  = 0; i<categoriaproduc.length;i++){
        System.out.print(categoriaproduc[i]);
    }
}}


