package Escola;

public class professor extends pessoa{
	public professor(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	int matricula;
	public void lecionar () {
		System.out.println(getNome() + " lecionando...");
		}

}
