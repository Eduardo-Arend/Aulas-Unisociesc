package array;

public class VetTeste {

	public static void main(String[] args) {
		int v[] = new int[6];

		v[0] = 1;
		v[1] = 6;
		v[2] = 8;
		v[3] = 10;
		v[4] = 1;
		v[5] = 5;
		System.out.println("Variavel int " + v[0]);
		System.out.println("Variavel int " + v[1]);
		System.out.println("Variavel int " + v[2]);
		System.out.println("Variavel int " + v[3]);
		System.out.println("Variavel int " + v[4]);
		System.out.println("Variavel int " + v[5]);

		for (int i = 0; i < 5; i++) {
			System.out.println("int =" + i);
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println("Vetor = " + v[i]);
		}

	}

}
