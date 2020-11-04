
package rancho;
import java.util.ArrayList;
public class Rancho {
    
    private ArrayList<Granero> graneros = new ArrayList<Granero>();    
    
    private double volumenTotal;
    
    public Rancho(){}
    
    private void calcularVolumenTotal(){
        volumenTotal = 0.0;
        graneros.forEach((granero) -> {
            volumenTotal += granero.calcularVolumen();
        });         
    }
    
    public void addGraneros(Granero granero){
        graneros.add(granero);
    }
    
    public double getVolumenTotal(){
        calcularVolumenTotal();        
        return volumenTotal;
    }
    
    public static void main(String[] args) {
        
        Rancho ran = new Rancho();
        
        Cilindrico ci = new Cilindrico("cilindrico",2,5);
        Conico co = new Conico("conico",2,5);
        Cubico cu = new Cubico("cubico",3);
                
        ran.addGraneros(co);
        ran.addGraneros(cu); 
        ran.addGraneros(ci);
        System.out.println(ran.getVolumenTotal());
        
       
    }
    
}
