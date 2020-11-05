
package zoo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jairo-lopez
 */
public class Zoo {
    
    private ArrayList<Animal> Ambientes = new ArrayList<>();
    
    public Zoo(){};
        
    public void agregarAnimal(Animal animal){
        Ambientes.add(animal);
    }    
    public void presentarAnimales(){  
        System.out.println("Estos son los animales del Zoo");
        for(Animal animal :Ambientes){          
            System.out.println(animal);            
        }
        System.out.println("Vuelvan pronto a visitar el Zoologico");
    }
    
    public void ordenes(){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);        
        while(flag){
            
            String[] data = sc.nextLine().split("&");
            String orden = data[0];
            switch(orden){
                
                case "A":                                        
                    String tiAni = data[1];
                    String nomAni = data[2];
                    int vel = Integer.parseInt(data[3]);
                    String metDes = data[4];
                    int numExt = Integer.parseInt(data[5]);
                    
                    if(tiAni.equals("terrestre")){
                        agregarAnimal(new Terrestre(numExt,nomAni,vel,metDes,tiAni));
                    }else{
                        agregarAnimal(new Terrestre(numExt,nomAni,vel,metDes,tiAni));
                    }                   
                    break;
                case "B":
                    presentarAnimales();
                    break;
                case "C":
                    flag = false;
                    break;                
            }
        }
    }
   
    public static void main(String[] args) {        
         
        Zoo zologico = new Zoo();
        zologico.ordenes();
        
    }
    
}
