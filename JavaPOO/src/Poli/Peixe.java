package Poli;

public class Peixe extends Animal {

	public Peixe() {
		
	}
	
	public void comer(String comida) {
		System.out.printf("\nO peixe foi comer %s", comida);
	}
	
	public void locomover(String locomocao) {
		System.out.printf("\nO peixe foi %s", locomocao);
	}

}
