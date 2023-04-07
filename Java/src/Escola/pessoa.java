package Escola;

public class pessoa {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public pessoa(String nome, int idade) {
		System.out.println("Contruindo Pessoa... ");
		setNome(nome);
		setIdade(idade);	
	}
}
