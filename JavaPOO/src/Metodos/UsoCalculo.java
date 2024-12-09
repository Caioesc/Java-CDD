package Metodos;

public class UsoCalculo {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		c1.somar(5, 4);
		c1.somar(5, 4, 10);
		c1.dividir(10, 2);
		c1.dividir(10, 2, 2);
		c1.subtrair(10, 5);
		c1.subtrair(10, 5, 2);
		c1.multiplicar(5, 5);
		c1.multiplicar(10, 5, 2);

	}
}
