/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author jairo-lopez
 */
public abstract class Vehiculo {
    
    public int velocidad;
    public int pasajeros;
    public String placa;
    public String tipo;

    public Vehiculo(int velocidad, int pasajeros, String placa, String tipo) {
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.placa = placa;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "velocidad=" + velocidad + ", pasajeros=" + pasajeros + ", placa=" + placa + ", tipo=" + tipo + '}';
    }
    
}
