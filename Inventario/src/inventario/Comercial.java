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
public class Comercial extends Vehiculo{
    public int cargaMaxima;

    public Comercial(int cargaMaxima, int velocidad, int pasajeros, String placa, String tipo) {
        super(velocidad, pasajeros, placa, tipo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return "Comercial{" + "cargaMaxima=" + cargaMaxima + '}';
    }
    
    
    
    
}
