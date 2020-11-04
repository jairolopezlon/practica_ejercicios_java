package inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    
    public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public void inventario(){}
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void listarVehiculos(){
        System.out.println("***Inventario de vehículos***");
        for(Vehiculo vehiculo: vehiculos){
            System.out.println("\tVehículo "+vehiculo.tipo+" - Placa: "+vehiculo.placa);
            System.out.println("\tvelocidad: "+vehiculo.velocidad+" km/h");
            System.out.println("\tpasajeros: "+vehiculo.pasajeros);
            switch(vehiculo.tipo){
                case "Particular":
                    Particular particular = (Particular)vehiculo;
                    System.out.println("\tcolor: "+particular.color);
                    break;
                case "Comercial":
                    Comercial comercial = (Comercial)vehiculo;
                    System.out.println("\tCarga máxima: "+comercial.cargaMaxima+"kg");
                    break;                
            }            
        }
    }
    
    public void procesarComandos(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){  
            String[] data = sc.nextLine().split("&");
            switch(data[0]){
                case "1":
                    String tipo = data[1];
                    int pasajeros = Integer.parseInt(data[2]);
                    int velocidad = Integer.parseInt(data[3]);
                    String placa = data[4];
                    switch(tipo){
                        case "Particular":
                            String color = data[5];
                            this.agregarVehiculo(new Particular(velocidad, pasajeros, placa, tipo, color ));
                        break;
                        case "Comercial":
                            int carga = Integer.parseInt(data[5]);
                            this.agregarVehiculo(new Comercial(carga,velocidad, pasajeros, placa, tipo));
                        break;
                    }
                    break;
                case "2":
                    this.listarVehiculos();
                    break;
                case "3":
                    flag = false;
                    break;                        
            }
        }
    }
    
    public static void main(String[] args) {
           Inventario inventario = new Inventario();
           inventario.procesarComandos();
    }    
}
