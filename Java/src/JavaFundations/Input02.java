package JavaFundations;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	double y = sc.nextDouble();
    	String z = sc.next();
    	sc.close();
        
        JOptionPane.showMessageDialog(null,
                "Bem Vindo, Eduardo!!",
                "Boas Vindas",
                1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "é isto a questão?",
                "Titulo do dialogo",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
    
}
