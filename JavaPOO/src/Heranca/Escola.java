package Heranca;

public class Escola {

	public static void main(String[] args) {
		Professor p1 = new Professor("Welligton", "12332112332", "81996614669");
		Aluno a1 = new Aluno("Caio", "01234567891", "81996546350");
		
		p1.diversao();
		a1.sofrer();
		p1.certificar();

	}

}
