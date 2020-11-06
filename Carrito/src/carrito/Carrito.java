/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jairo-lopez
 */
public class Carrito {
    private String cliente;
    private int subtotal = 0;
    private int total = 0;
    private int descuento;
    private ArrayList<Articulo> productos = new ArrayList<Articulo>();
    
    public void resetearCanasta(){
        this.subtotal = 0;
        this.total = 0;
        this.descuento = 0;
        this.productos.clear();
        this.cliente = "";
    }
    
    public void addProducto(Articulo producto){
        productos.add(producto);
    }
    
    public void addCliente(String cliente){
        this.cliente = cliente;
    }
    
    public void sumarSubtotales(Articulo producto){
        this.subtotal += producto.getCantidad()*producto.getPrecio();
    }
    
    public void calcularDescuento(){
        double desc = 0.0;
        
        if(this.subtotal > 700000){
            desc = subtotal*0.2;
        }else if(this.subtotal > 300000){
            desc = subtotal*0.15;
        }else if(this.subtotal > 150000){
            desc = subtotal*0.1;
        }        
        this.descuento = (int)desc;            
    }
    public void calcularTotal(){
        this.total = this.subtotal - (int)this.descuento;
    }
    
    public void GenerarTicket(){        
        System.out.println("Centro Comercial Unaleño\nCompra más y Gasta Menos\nNIT: 899.999.063");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Art Cant Precio");
        for(Articulo producto: productos){
            sumarSubtotales(producto);
            System.out.println(imprimirProducto(producto));
        }
        calcularDescuento();
        calcularTotal(); 
        System.out.println("Total: $"+this.total);
        System.out.println("En esta compra tu descuento fue $"+this.descuento);
        System.out.println("Gracias por tu compra\n---");
    }
    
    public static String imprimirProducto(Articulo producto){
        String nombre = producto.getNombre();
        int subtotal = producto.getPrecio() * producto.getCantidad();
        int cantidad = producto.getCantidad();        
        String msgProducto = nombre + " x" + cantidad + " $" + subtotal;
        return msgProducto;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Boolean flag2 = true;
        Scanner sc = new Scanner(System.in); 
        Carrito carrito = new Carrito();   
        
                   
            
            while(flag2){           
            String[] entrada = sc.nextLine().split("&");
            String comando = entrada[0];            
            
            switch(comando){
                case "1":
                    String articulo = entrada[1];
                    int cantidad = Integer.parseInt(entrada[2]);
                    int precio = Integer.parseInt(entrada[3]);                    
                    carrito.addProducto(new Articulo(articulo,precio,cantidad));
                    break;
                case "2":                    
                    carrito.addCliente(entrada[1]);
                    carrito.GenerarTicket();
                    carrito.resetearCanasta();                    
                    break;
                case "3":                   
                    flag2 = false;
                    break;                   
            }          
        }         
    }    
}
