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
public class Terrestre extends Animal{
    
    public final int numeroPatas;

    public Terrestre(int numeroPatas, String nombre, int velocidad, String modoDesplazamiento, String tipoAnimal) {
        super(nombre, velocidad, modoDesplazamiento, tipoAnimal);
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "\tel "+nombre+"\n\tes un animal "+tipoAnimal+"\n\tque se desplaza "+modoDesplazamiento+"\n\tcon "+numeroPatas+" patas\n\ta una velocidad de "+velocidad+"km/h";
    }
    
    
    
    
}
