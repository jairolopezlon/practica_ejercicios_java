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
public class Particular extends Vehiculo{
    
    public String color;

    public Particular(int velocidad, int pasajeros, String placa, String tipo, String color) {
        super(velocidad, pasajeros, placa, tipo);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Particular{" + "color=" + color + '}';
    }
    
    
    
}
