package fundamentos2;

public class Atividade03 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}