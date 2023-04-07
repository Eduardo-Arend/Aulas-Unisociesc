package Calculadora;
import javax.swing.*;
public class Resultado {

	public static void main(String[] args) {
		 Resultado c = new Resultado();
		 int opcao = 1;

	        int operador1 = 10;
	        int operador2 = 10;

	        float operador1=(float)10.99;
	        float operador2=(float)20.99;
	        int resultado;
	        float f = 0;
	        
	        if(opcao == 1){
	            resultado = c.soma(operador1,operador2);
	            f= c.soma(operador1,operador2);
	        }
	        else if (opcao == 2){
	            resultado= c.subtracao(operador1, operador2);
	        }
	        else if (opcao == 3){
	            resultado- c.multiplicacao(operador1, operador2);
	        }
	        else(
	            resultado = c.divisao(operador1, operador2);
	        )
	        System.out.println("Resultado int:  " + resultado);
	        System.out.println("Resultado float: "+ r);


	    }
	}