package Escola;

public class TesteLecionar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		professorHorista profHorista = new professorHorista();
		profHorista.setNome("Eduardo");
		professorPesquisador profPesq = new professorPesquisador();
		 profPesq.setNome("José");
		 profHorista.lecionar();
		profPesq.lecionar();
	}
}
