/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author jairo-lopez
 */
public class Articulo {
    
    public String nombre;
    public int precio;
    public int cantidad;
    
   public Articulo(String nombre, int precio, int cantidad){
       this.nombre = nombre;
       this.precio = precio;
       this.cantidad = cantidad;
   }
   
   public void setPrecio(int newPrecio){
       this.precio = newPrecio;
   }
   
   public String getNombre(){
       return nombre;
   }
   public int getPrecio(){
       return precio;
   }
   public int getCantidad(){
       return cantidad;
   }
    
}
