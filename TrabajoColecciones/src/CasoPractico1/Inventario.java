/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProductos(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            for (int i = 0; i < productos.size(); i++) //Obtiene el objeto con el get, y con el punto que metodo quiero de ese objeto
            {
                System.out.print(productos.get(i).mostrarInfo());
            }
        }
    }

    {
    }

    public void buscarProductosPorId(String id) {
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();

        while (it.hasNext() && productoEncontrado == null) {
            Producto p = it.next();
            if (p.getId().equals(id)) {
           
                productoEncontrado = p;
                System.out.print(p.mostrarInfo());
            }
        }
    }

    public void eliminarProducto(String id) {
        Producto productoEncontrado =null;
        Iterator <Producto> it=this.productos.iterator();
        while (it.hasNext() && productoEncontrado == null) {
            Producto p = it.next();
            if (p.getId().equals(id)) {
                it.remove();
                productoEncontrado = p;
            }
            this.listarProductos();
        }
        
    }

    public void actualizarStock(String id, int nuevaCantidad) {
      
    Producto productoEncontrado = null;
    Iterator<Producto> it = this.productos.iterator();
    
    while (it.hasNext() && productoEncontrado == null) {
        Producto p = it.next();
        
        if (p.getId().equals(id)){
            p.setCantidad(nuevaCantidad);
            productoEncontrado = p;
           
        }
        System.out.print(p.mostrarInfo()); // Asegúrate de que esto imprima algo útil
    }

    if (productoEncontrado == null) {
        System.out.println("Producto con ID " + id + " no encontrado.");
    }


       }
        
        
    

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>(); // defino la lista de productos no tiene nada q ver con el iterator
        Iterator<Producto> it = this.productos.iterator(); // Creo el iterador que va recorrer toda la lista de productos
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getCategoria().equals(categoria)) {
                productosEncontrados.add(p);
            }
        }
        for (int i = 0; i < productosEncontrados.size(); i++) //Obtiene el objeto con el get, 
            //y con el punto que metodo quiero de ese objeto
        {
            System.out.print(productosEncontrados.get(i).mostrarInfo());
        }
    }

   


    

    public void obtenerTotalStock() {
        int stock=0;
        for (int i = 0; i < productos.size(); i++) //Obtiene el objeto con el get, y con el punto que metodo quiero de ese objeto
            {stock=stock +  productos.get(i).getCantidad();
              
            }
        System.out.print("El total de Stock de los productos es: "+ stock);
    }

    public void obtenerProductoConMayorStock() {
        Producto productoConMayorStock= null;
        int stockMax=-1;
        for(Producto producto: productos)
            if(producto.getCantidad()>stockMax){
            stockMax=producto.getCantidad();
            productoConMayorStock=producto;
            System.out.println(productoConMayorStock.mostrarInfo());
          
            if (productoConMayorStock != null) {
    System.out.println(productoConMayorStock.mostrarInfo());



        }
        }
        
    }

    public void filtrarProductoPorPrecio(double min, double max) {
   
    Iterator<Producto> it = this.productos.iterator();
    ArrayList<Producto> productosEncontrados = new ArrayList<>(); 

    while (it.hasNext()) {
        Producto p = it.next();
        // Nota: Si usas > min y < max, los productos con precio exactamente min o max se excluyen.
        if (p.getPrecio() > min && p.getPrecio() < max) {
            productosEncontrados.add(p);
        }
    }

    // *** AGREGAR ESTA VERIFICACIÓN ***
    if (productosEncontrados.isEmpty()) {
        System.out.println("No se encontraron productos en el rango $" + min + " - $" + max);
        return; // Salir del método
    }
    
    System.out.println("Productos encontrados:");

    for (int i = 0; i < productosEncontrados.size(); i++) { 
        // Usar println es generalmente mejor para mostrar listas de objetos.
        System.out.println(productosEncontrados.get(i).mostrarInfo());
    }
}
    
    
    public void mostrarCategoriasDisponibles() {
    }


}