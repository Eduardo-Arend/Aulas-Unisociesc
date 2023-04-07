package Escola;

public class TesteComHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		auloDeGraduacao aluno = new auloDeGraduacao(null, 0);
		aluno.nome = "José";
		aluno.idade = 19;
		System.out.printf("nome: %s, idade: %d", aluno.nome, aluno.idade);
		}

	}
