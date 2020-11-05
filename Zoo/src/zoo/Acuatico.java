/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author jairo-lopez
 */
public class Acuatico extends Animal{
    
    public final int numeroAletas;

    public Acuatico(int numeroaletas, String nombre, int velocidad, String modoDesplazamiento, String tipoAnimal) {
        super(nombre, velocidad, modoDesplazamiento, tipoAnimal);
        this.numeroAletas = numeroaletas;
    }

    @Override
    public String toString() {
        return "\tel "+nombre+"\n\tes un animal "+tipoAnimal+"\n\tque se desplaza "+modoDesplazamiento+"\n\tcon "+numeroAletas+" aletas\n\ta una velocidad de "+velocidad+"km/h";
    }
}
