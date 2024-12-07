// Escreva um programa que solicite a quantidade de alunos de uma sala e depois solicite uma nota para cada aluno, imprimindo no final a média da sala.
package fundamentos2;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		double notas = 0, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos na sala: ");
		int alunos = sc.nextInt();
		
		for(int i = 0; i < alunos; i++) {
			System.out.printf("Digite a nota do %dº aluno: ", i+1);
			notas += sc.nextDouble();
		}
		media = notas/alunos;
		System.out.printf("A média da sala é: %.2f", media);
	}

}
