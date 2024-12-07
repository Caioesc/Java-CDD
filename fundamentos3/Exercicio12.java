//Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de palavras (palavra é definida por um conjunto de caracteres separados por um espaço).
package fundamentos3;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		System.out.println("Digite um texto: ");
		Scanner sc = new Scanner(System.in);
		StringTokenizer texto = new StringTokenizer (sc.nextLine());
		System.out.println(texto.countTokens());
	}

}
