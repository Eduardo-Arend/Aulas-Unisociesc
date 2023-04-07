package Escola;

public class professorPesquisador extends professor {
	public professorPesquisador(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	private String nome;
	private int idade;

	public void pesquisar() {
		System.out.println("Pesquisando.. ");
	}

}
