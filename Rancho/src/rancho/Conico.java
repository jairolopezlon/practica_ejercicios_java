
package rancho;

public class Conico extends Granero{
    
    private final double radio;
    private final double altura;
    
    public Conico(String tipoGranero, double radio, double altura){
        super(tipoGranero);
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calcularVolumen(){
        double volumen = (Math.PI * Math.pow(radio,2.0) * altura)/3.0;
        return  volumen;
    }
}
