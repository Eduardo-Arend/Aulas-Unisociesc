package Calculadora;

public class subtracao  extends operacao{
	public subtracao() {
		super();
		
	}

	public subtracao(int prm1, int prm2) {
		super(prm1, prm2);
	}
	public float calcula() {
		return this.Numero1 - this.Numero2;
	}
}
