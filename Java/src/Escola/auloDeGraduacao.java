package Escola;

public class auloDeGraduacao extends aluno{
	 public auloDeGraduacao(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	String nome;
	int idade;
	 double nota1, nota2, notaFinal;
	
	public void alunoDeGraduacao(){
		this.nota1 = 8.5;
		this.nota2 = 9.0;
		this.notaFinal=(nota1 + nota2)/ 2;
		System.out.println("Construindo aluno de Graduação...");
		
	}
	

}
