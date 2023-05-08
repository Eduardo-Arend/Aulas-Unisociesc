package Calculadora;

public class operacao {
protected	int Numero1;
protected	int Numero2;
	
	public int getNumero1() {
	return Numero1;
}

public void setNumero1(int Numero1) {
	this.Numero1 = Numero1;
}

public int getNumero2() {
	return Numero2;
}

public void setNumero2(int Numero2) {
	this.Numero2 = Numero2;
}

	public operacao(){
		this.Numero1= 0;
		this.Numero2= 0;	
	}

	public operacao(int prm1, int prm2){
		this.Numero1= prm1;
		this.Numero2= prm2;
	}
	public float calcula() {
		System.out.println("Não será possivel calcular!!");
		return -1;
	}
}
