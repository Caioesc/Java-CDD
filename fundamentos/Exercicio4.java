package fundamentos;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		//Faça um programa que solicite 2 notas de um aluno e calcule a média dele e mostre na tela.
		double n1, n2, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota :");
		n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		System.out.printf("Sua média é igual a %.2f", media);

	}

}
