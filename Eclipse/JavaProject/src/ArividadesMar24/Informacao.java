package ArividadesMar24;

public class Informacao {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Evandro", "Palmeiras", 9, 28, 2, 23.500, "Pensao");
		Jogador jogador2 = new Jogador(null, null, 0, 0, 0, 0, null);
		 //jogador1
		
		
		//jogador2
		jogador2.nomeDojogador = "Thiago";
		jogador2.idadeDojogador= 30;
		jogador2.Time="Internacional";
		jogador2.numeroDojogador= 10;
		
		jogador1.Gol(); 
		jogador2.Treinar();
		
		
		
		System.out.println("Imformaçoes do Jogador 1: ");
		System.out.println("Nome: "+jogador1.nomeDojogador);
		System.out.println("Idade: "+jogador1.idadeDojogador);
		System.out.println("Time: "+jogador1.Time);
		System.out.println("Numero da Camisa: "+jogador1.numeroDojogador);
		System.out.println("Número de Processos: " + jogador1.getNumeroDeProcessos());
		System.out.println("Tipo do Processo: "+ jogador1.getProcesso());
		System.out.println("------------------");
		
		System.out.println("Imformaçoes do Jogador 2: ");
		System.out.println("Nome: "+jogador2.nomeDojogador);
		System.out.println("Idade: "+jogador2.idadeDojogador);
		System.out.println("Time: "+jogador2.Time);
		System.out.println("Numero da Camisa: "+jogador2.numeroDojogador);
		
		
				

	}

}
