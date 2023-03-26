package OrientecaoAObjetos;

public class Fabricante {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();

		carro1.marcaVeiculo = "Fiat";
		carro1.modeloVeiculo = "Uno";
		carro1.quantidadePortaVeiculo = 4;
		carro2.marcaVeiculo = "BMW";
		carro2.modeloVeiculo = "320";

		carro1.ligar();
		carro2.ligar();
		carro2.Acelerar();
		carro2.pesoVeiculo=500;

		System.out.println("Marca -->  " + carro1.marcaVeiculo + " -- Modelo: "+carro1.modeloVeiculo);
		System.out.println("Marca -->  " + carro2.marcaVeiculo);
		System.out.println("Marca -->  " + carro3.marcaVeiculo);
		System.out.println("Marca -->  " + carro4.marcaVeiculo);
		System.out.println("Qauntidade de Gasolina: "+ carro1.quantidadedeCombustivel()+"Litros");

	}
}

