
package rancho;

public abstract class Granero {
    
    private final String tipoGranero;
    
    public Granero(String tipoGranero){
        this.tipoGranero = tipoGranero;
    }
    
    public String visualizarTipo(){
        return this.tipoGranero;
    } 
    
    public abstract double calcularVolumen();
}
