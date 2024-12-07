package fundamentos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Faça um programa que verifique (usando if e else) se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M- Masculino
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite F ou M: ");
		char letra = sc.next().charAt(0);
		Character.toLowerCase(letra);
		
		if(letra == 'f' || letra == 'F') {
			System.out.println("Feminino");
		}
		else if (letra == 'm' || letra == 'M') {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Letra inválida!");
		}
	}
}
