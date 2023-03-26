package ArividadesMar24;

public class Jogador {
	String nomeDojogador;
	String Time;
	int numeroDojogador;
	int idadeDojogador;
	private int numeroDeProcessos;
    double pagamentoDojogador;
    
	public Jogador(String nomeDojogador, String time, int numeroDojogador, int idadeDojogador, int numeroDeProcessos,
			double pagamentoDojogador, String processo) {
		super();
		this.nomeDojogador = nomeDojogador;
		Time = time;
		this.numeroDojogador = numeroDojogador;
		this.idadeDojogador = idadeDojogador;
		this.numeroDeProcessos = numeroDeProcessos;
		this.pagamentoDojogador = pagamentoDojogador;
		Processo = processo;
	}
	//get and set
	public int getNumeroDeProcessos() {
		return numeroDeProcessos;
	}
	public void setNumeroDeProcessos(int quantidadeDeProcesso) {
		this.numeroDeProcessos = quantidadeDeProcesso;
	}
	private String Processo;
	
	public String getProcesso() {
		return Processo;
	}
	public void setProcesso(String tipoDeprocesso) {
		Processo = tipoDeprocesso;
	}
	
	public void Gol() {
		System.out.println("Jogador com maior número de Gols:   " + this.nomeDojogador);
	}
	public void Treinar() {
		System.out.println("Jogardor que tem Treinado com frequencia: "+ this.nomeDojogador );
		System.out.println("");
	}
	
	
	
	


}
