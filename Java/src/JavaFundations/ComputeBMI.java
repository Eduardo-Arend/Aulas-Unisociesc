package JavaFundations;
import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args){
    	Scanner scan= new Scanner(System.in);
    	System.out.println("Informe o Peso: ");
    	double peso= scan.nextDouble();
    	System.out.println("Informe a altura:");
    	double altura= scan.nextDouble();
    	double imc= peso/ (altura*altura);
    	System.out.println(imc);
    	
            
        
        }
}
