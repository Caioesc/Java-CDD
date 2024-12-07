package fundamentos2;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*double notas = 0, media;
		int num = 0, cont = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de alunos na sala: ");
		num = sc.nextInt();
		
		while(cont < num) {
			System.out.printf("Digite a nota do %dº aluno: ", cont+1);
			notas += sc.nextDouble();
			cont++;
		}
		media = notas/num;
		System.out.printf("A média da turma é: %.2f", media);*/
		
		int num = 1;
		
		while(num <= 50) {
			if (num % 2 != 0){
				System.out.println(num);
			}num++;
		}
	}

}
