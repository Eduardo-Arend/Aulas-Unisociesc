package OrientecaoAObjetos;

import java.util.Date;

public class Carro {

	String marcaVeiculo;
		String modeloVeiculo;
		Date dateFabricacaoVeiculo;
		double pesoVeiculo;
		int quantidadeMarchaVeiculo;
		int quantidadePortaVeiculo;
		
		public void ligar() {
		System.out.println("Ligar o Carro >>>>>      " + this.marcaVeiculo +"/"+ this.modeloVeiculo + "      Quantidade de Portas:"+ this.quantidadePortaVeiculo);
	    }
		public void Desligar() {
			System.out.println("Desligar o carro >>>>>>" + this.toString());
		}
		public void Acelerar() {
			System.out.println("Acelerar o carro >>>>>>"+this.toString());
		}
		public void Freiar() {
			System.out.println("Freiar o carro >>>>>>"+this.toString());
		}
			public int quantidadedeCombustivel() {
				return 25;
			} 
		}
	
	


