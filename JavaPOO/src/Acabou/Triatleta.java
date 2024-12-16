package Acabou;

public class Triatleta implements Ciclista, Nadador, Corredor {

	@Override
	public void correr() {
		System.out.println("Foi correr");
	}

	@Override
	public void nadar() {
		System.out.println("Foi nadar");
	}

	
	public void pedalar() {
		System.out.println("Foi pedalar");

	}

	public static void main(String[] args) {
		Triatleta a1 = new Triatleta();
		a1.correr();
		a1.pedalar();
		a1.nadar();

	}

}
