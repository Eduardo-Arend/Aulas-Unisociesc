package array;

import java.util.Random;

public class Arrayteste {

	private String nomeDisciplina;
	private double notas1[];
	private double notas2[];
	private double medias[];
	private int qtdeAlunos;
	private int qtdeAlunosProf;

	public Arrayteste(String nomeDisciplina, int qtdeAlunos) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas1 = new double[qtdeAlunos];
		this.notas2 = new double[qtdeAlunos];
		this.medias = new double[qtdeAlunos];
		this.qtdeAlunos = qtdeAlunos;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void gerarNotas() {
		Random gerador = new Random();
		System.out.println("Irei gerar notas...");
		for (int i = 0; i < this.qtdeAlunos; i++) {
			this.notas1[i] = gerador.nextDouble() * 10;
			this.notas2[i] = gerador.nextDouble() * 10;
			
		}
	}

	public void calcularMedias() {
		System.out.println("Irei calcular médias..");
		for (int i = 0; i < this.notas1.length; i++) {
			double media = (this.notas1[i] + this.notas2[i]) / 2;
			this.medias[i] = media;
			System.out.printf("Medias: %.2f\n", media);
			System.out.println("------------------|");
		}
		System.out.println("");
	}

	public void mostrarMedias() {
		String todasAsMedias = "";
		System.out.println("Irei listar médias...");
		for (int i = 0; i < qtdeAlunos; i++) {
			todasAsMedias += String.format("Aluno %d: %.2f %.2f %.2f\n", i + 1, notas1[i], notas2[i],medias[i]);
		}
		System.out.println(todasAsMedias);
	}

	public String exibeMaior() {
		// suponha que o primeiro seja o maior
		double maior = this.medias[0];
		// olhe para os demais, um a um
		for (int i = 1; i < this.qtdeAlunos; i++) {
			// se encontrar um maior, atualize a variável
			if (this.medias[i] > maior)
				maior = this.medias[i];

		}
		System.out.printf("Media Maior: %.2f\n", maior);
		return "Media Maior:" + maior;
		
		
	}
	
	public String exibeSegundaMaior() {
	    double maior = this.medias[0];
	    double segundoMaior = -1;

	    for (int i = 1; i < this.qtdeAlunos; i++) {
	        if (this.medias[i] > maior) {
	            segundoMaior = maior;
	            maior = this.medias[i];
	        } 
	    }

	    System.out.printf("Segunda maior media: %.2f\n", segundoMaior);
	    return "Segunda maior media: " + segundoMaior;
	}


	public double mediaDaTurma() {
		double mediaDaTurma = 0;
		for (int i = 0; i < this.qtdeAlunos; i++) {
			mediaDaTurma += this.medias[i];
		}
		return (mediaDaTurma / this.qtdeAlunos);

	}
	public void qtdeAlunosProf() {
		
		System.out.printf("quantos alunos o prof tem :", this.qtdeAlunos);
	

	}
}
