package fundamentos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int resposta;
		Scanner sc = new Scanner (System.in);
		System.out.println("Telefonou para a vítima? Digite 1 para sim e 0 para não: ");		
		resposta = sc.nextInt();
		System.out.println("Esteve no local do crime? ");		
		resposta += sc.nextInt();
		System.out.println("Mora perto da vítima? ");		
		resposta += sc.nextInt();
		System.out.println("Devia para a vítima?");		
		resposta += sc.nextInt();
		System.out.println("Já trabalhou com a vítima?");		
		resposta += sc.nextInt();
		
		if (resposta == 5) {
			System.out.println("Culpado!");
		}
		else if (resposta >= 3 && resposta <= 4) {
			System.out.println("Cúmplice");
		}
		else if (resposta == 2) {
			System.out.println("Suspeito");
		}
		else {
			System.out.println("Inocente");
		}
	}
}
