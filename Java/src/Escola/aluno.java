package Escola;

public class aluno extends pessoa{
	int ra;
	public aluno (String nome, int idade) {
		super(nome, idade); 
		System.out.println("Construindo Aluno...");
		}
}