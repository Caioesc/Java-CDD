package Metodos;

public class Carro {
	String modelo, cor;
	double preco;
	boolean desligado = true;
	
public Carro() {
	
}
public Carro(String modelo) {
	this.modelo = modelo;
}
public Carro(String modelo, String cor) {
	this.modelo = modelo;
	this.cor = cor;
}
public Carro(String modelo, String cor, double preco) {
	this.modelo = modelo;
	this.cor = cor;
	this.preco = preco;
}
	
	public void ligar() {
		if(desligado == true) {
		System.out.println("O carro ligou!");
		desligado = false;	
		}
		else {
			System.out.println("O carro já está ligado!");
		}
	}
	public void desligar() {
		if(desligado == false) {
		System.out.println("O carro desligou!");
		desligado = true;
		}
		else {
			System.out.println("O carro já está desligado!");
		}
	}
	public void acelerar() {
		if(desligado == false) {
		System.out.println("Acelerando...");
		}
		else {
			System.out.println("Não é possível acelerar com o carro desligado!");
		}
	}
	public void frear() {
		if(desligado == false) {
		System.out.println("Freando...");
		}
		else {
			System.out.println("Não é possível frear com o carro desligado!");
		}
	}

}
