package JavaFundations;
import javax.swing.JOptionPane;
public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
    	 
        //Store the input as a String and print it.
    	 String input2 = (String)JOptionPane.showInputDialog(null,
    			 "Esta é uma pergunta ?",
     			"título da caixa de Diálogo",
     			2,
     			null,
     			null,
     			"digite algo aqui.");
    	String[] acceptableValues = {"Escolha 1 ", "Escolha 2 ", "Escolha 3"};
      String input3 = (String)JOptionPane.showInputDialog(null,
    			"Esta é uma pergunta ?",
    			"título da caixa de Diálogo",
    			2,
    			null,
    			acceptableValues,
    			acceptableValues[1]);
      JOptionPane.showMessageDialog(null,
      "Não há uma entrada aqui; apenas uma mensagem",
      "Título",
      1);
        
        //Parse the input as an int.
        //Print its value +1
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
