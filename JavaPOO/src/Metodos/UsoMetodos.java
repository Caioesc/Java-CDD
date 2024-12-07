package Metodos;

import java.util.Scanner;

public class UsoMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JavaMetodos j1 = new JavaMetodos();
		System.out.println("Digite o ano do seu nascimento: ");
		int anos = sc.nextInt();

		System.out.printf("Idade: %d", j1.idade(anos));

		System.out.println("\nDigite o valor da sua hora de trabalho: ");
		double valorHora = sc.nextDouble();
		System.out.println("\nDigite o valor de horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.printf("\nValor a receber: %.2f", j1.valor(valorHora, horas));

		System.out.println("\nDigite seu nome: ");
		String retornoNome = j1.nome(sc.next());
		System.out.printf("\nNome: %s", retornoNome);
		
		System.out.println("\nDigite quantos anos de relacionamento: ");
		boolean retornoEstado = j1.estado(sc.nextInt());
		if(retornoEstado == true) {
			System.out.println("Está enrolando!");
		}
		else {
			System.out.println("Não está enrolando");
		}

	}

}
