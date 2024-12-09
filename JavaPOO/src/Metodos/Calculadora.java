package Metodos;

public class Calculadora {
	public void somar(double x, double y) {
		double soma = x+y;
		System.out.println(soma);
	}
	public void somar(double x, double y, double z) {
		double soma = x+y+z;
		System.out.println(soma);
	}
	public void dividir(double x, double y) {
		double divisao = x/y;
		System.out.println(divisao);
	}
	public void dividir(double x, double y, double z) {
		double divisao = x/y/z;
		System.out.println(divisao);
	}
	public void subtrair(double x, double y) {
		double subtracao = x-y;
		System.out.println(subtracao);
	}
	public void subtrair(double x, double y, double z) {
		double subtracao = x-y-z;
		System.out.println(subtracao);
	}
	public void multiplicar(double x, double y) {
		double multiplicacao = x*y;
		System.out.println(multiplicacao);
	}
	public void multiplicar(double x, double y, double z) {
		double multiplicacao = x*y*z;
		System.out.println(multiplicacao);
	}

}
