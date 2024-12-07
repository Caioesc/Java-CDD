package fundamentos3;

public class Exercicio13 {

	public static void main(String[] args) {
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		boolean texto = texto01.equals(texto02);
		
		if(texto == true) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("São diferentes");
		}
	}

}
