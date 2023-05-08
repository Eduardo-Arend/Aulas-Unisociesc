package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a Operação(1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Exponenciação, 6-Fatorial):");
		int tipo = teclado.nextInt();
		System.out.println("Digite o valor 1:");
		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 0){
			System.out.println("Digite o valor 2:");
			valor2 = teclado.nextInt();	
		}
		teclado.close();
		//processamento sem orientaçao objetos - nivel 1
		switch (tipo) {
		case 1 :System.out.println("Adição"+(valor1+valor2));break;
		case 2 :System.out.println("Subtração"+(valor1+valor2));break;
		case 3 :System.out.println("Multiplicação"+(valor1+valor2));break;
		case 4 :System.out.println("Divisão"+(valor1+valor2));break;
		default : System.out.println("Operação invalida!");
		}
		//processamento com orientação objetos - nivel 2 - usando o set numeros e set numeros2 para a operaçao sem parametro funcional
		operacao operacaoNivel2;
		switch (tipo) {
		case 1 : operacaoNivel2 = new adicao();
		operacaoNivel2.setNumero1(valor1);
		operacaoNivel2.setNumero2(valor2);
		System.out.println("Adição "+operacaoNivel2.calcula());
		break;
		case 2 : operacaoNivel2 = new subtracao();
		break;
		default : operacaoNivel2 = null;
		System.out.println("Não foi possivel identificar a operação desejada!!!");
		}
	operacao opercaoNivel3;
	 
	
	}

	}


