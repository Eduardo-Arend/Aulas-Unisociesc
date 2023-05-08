package Calculadora;

public class adicao extends operacao {
	public adicao() {
		super();
	}

	public adicao(int prm1, int prm2) {
		super(prm1, prm2);			
		}
	public float calcula(){
		return this.Numero1 + this.Numero2;
	}
}
