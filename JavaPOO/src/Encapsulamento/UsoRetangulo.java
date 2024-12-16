package Encapsulamento;

import java.util.Scanner;

public class UsoRetangulo {

	public static void main(String[] args) {
		int area, perimetro;
		Scanner sc = new Scanner(System.in);
		Retangulo t1 = new Retangulo();
		System.out.println("Digite o valor da base: ");
		t1.setBase(sc.nextInt());
		System.out.println("Digite a altura: ");
		t1.setAltura(sc.nextInt());
		
		area = t1.getBase() * t1.getAltura();
		perimetro = (t1.getBase() * 2) + (t1.getAltura() * 2);
		
		System.out.printf("Com o valor de base %d e altura %d, o valor da área é de %d e do perímetro é %d", t1.getBase(), t1.getAltura(), area, perimetro);
		
	
		

	}

}
