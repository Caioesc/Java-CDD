package JavaPoo;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Caio";
		p1.idade= 19;
		p1.endereco = "Janga";
		p2.nome = "Felipe";
		p2.idade = 23;
		p2.endereco = "Candeias";
		
		
		p1.comer("Laranja");
		p2.comer("Strogonoff");
		
		p1.dormir();
		p2.dormir();
		
		p1.apresentar();
		p2.apresentar();
		

	}

}
