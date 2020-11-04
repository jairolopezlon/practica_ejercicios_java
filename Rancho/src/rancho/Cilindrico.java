
package rancho;

public class Cilindrico extends Granero {
    
    private final double radio;
    private final double altura;
           
    public Cilindrico(String tipoGranero, double radio, double altura){
        super(tipoGranero);
        this.altura = altura;
        this.radio = radio;        
    }
    
    @Override
    public double calcularVolumen(){
        double volumen = Math.PI * Math.pow(radio,2.0) * altura;
        return  volumen;
    }
    
}
