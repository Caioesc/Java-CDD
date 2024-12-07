package fundamentos3;

public class Exercicio08 {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
	
		if(b1 == true) {
			System.out.println("b1 é igual");
		}
		else {
			System.out.println("b1 não é igual");
		}
		if(b2 == true) {
			System.out.println("b2 é igual");
		}
		else {
			System.out.println("b2 não é igual");
		}
		if(b3 == true) {
			System.out.println("b3 é igual");
		}
		else {
			System.out.println("b3 não é igual");
		}
		if(b4 == true) {
			System.out.println("b4 é igual");
		}
		else {
			System.out.println("b4 não é igual");
		}
				
	}

}
