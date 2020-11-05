
package zoo;

/**
 *
 * @author jairo-lopez
 */
abstract public class Animal {
    
    protected final String nombre;
    protected final int velocidad;
    protected final String modoDesplazamiento;
    protected final String tipoAnimal;

    public Animal(String nombre, int velocidad, String modoDesplazamiento, String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.modoDesplazamiento = modoDesplazamiento;
    }
    
    @Override
    public String toString(){
        return "\tel "+nombre+"\n\tes un animal "+tipoAnimal+"\n\tque se desplaza "+modoDesplazamiento+"\n\ta una velocidad de "+velocidad+"km/h";
    };

    
//    @Override
//    public String toString() {
//        return "Animal{" + "nombre=" + nombre + ", velocidad=" + velocidad + ", modoDesplazamiento=" + modoDesplazamiento + ", tipoAnimal=" + tipoAnimal + '}';
//    }

       
            
}

