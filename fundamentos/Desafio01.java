package fundamentos;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println(numero + " é positivo");
	}
		else {
			System.out.println(numero + " é negativo");
		}
	}
}
