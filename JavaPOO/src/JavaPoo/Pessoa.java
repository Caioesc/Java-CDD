package JavaPoo;

public class Pessoa {
	String nome, endereco;
	int idade;
	
	public void comer(String comida) {
		System.out.printf("%s foi comer %s \n", this.nome, comida);
	}
	public void dormir() {
		System.out.printf("%s foi dormir \n", this.nome);
	}
	public void apresentar() {
		System.out.printf("Me chamo %s, tenho %d anos e moro no bairro %s \n", this.nome, this.idade, this.endereco);
	}
	

}
