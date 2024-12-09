package Metodos;

public class LojadeCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro("Porshe");
		Carro c3 = new Carro("Ferrari", "Vermelho");
		Carro c4 = new Carro("Camaro", "Amarelo", 150000);
		c1.desligar();
		c1.ligar();
		c1.ligar();
		c1.frear();
		c1.acelerar();
		c1.desligar();
		c1.acelerar();
		c1.acelerar();
		c1.desligar();
		c1.ligar();
		
		System.out.println(c1.modelo + " " + c1.cor + " " + c1.preco);
		System.out.println(c2.modelo + " " + c2.cor + " " + c2.preco);
		System.out.println(c3.modelo + " " + c3.cor + " " + c3.preco);
		System.out.println(c4.modelo + " " + c4.cor + " " + c4.preco);

	}

}
