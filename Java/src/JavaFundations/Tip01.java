package JavaFundations;
import java.text.DecimalFormat;

public class Tip01 {
    public static void main(String[] args) {
        double[] valores= {10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0};
         

        DecimalFormat df = new DecimalFormat("#.##"); 
        for(int i=0; i< valores.length;i++) {
        	valores[i]*=1.2;
        }
        
        for (int i=0; i < valores.length;i++) {
                  System.out.println("Pessoa"+(i+1)+":$"+df.format(valores[i]));
        	
        }
       
        

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
