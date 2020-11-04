
package rancho;

public class Cubico extends Granero {
    private final double lado;
    
    public Cubico(String tipoGranero, double lado){
        super(tipoGranero);
        this.lado = lado;
    }
    
    @Override
    public double calcularVolumen(){        
        double volumen = Math.pow(lado,3.0);
        return  volumen;
    }
}
