package JavaFundations;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 10;
		int total = 0;
		System.out.println("esse programa gera soma de  " + n + " numeros.");
		for (int i = 0; i < n; i++) {
			;
		System.out.println("Entre com o proximo numero:");
		int value = in.nextInt();
		total += value;
		}
		System.out.println("o tatol é:"+total+".");
		
		

	}
}
