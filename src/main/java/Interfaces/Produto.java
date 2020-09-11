package Interfaces;

public class Produto implements Tributavel, Transportavel {

	
	/*
		Quando se trabalha com interfaces é obrigatorio se implementar todos os metodos 	
	  
	  	Posso implementar mais de uma interface, mas nao posso ter multipla herança
	  	
	  		Posso ter metodos com o mesmo nome em duas interfaces que estou implementando, 
	  	como eles não dizem o que se deve fazer
	  	
	  	
	  	Não se instancia interfaces, nem classes abstratas
	*/
	
	
	
	public Produto(String nome, double preco, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}
	
	@Override
	public void calculaImposto() {
		
		//Posso utilizar o atributo/constante que vem da interface
		this.precoFinal = this.preco + (this.preco * VALOR_IMPOSTO);
	}

	@Override
	public void calculaFrete() {
		this.valorFrete = this.preco / (this.peso * 0.1);
	}
	


	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", preco = " + preco + ", peso = " + peso + ",\n  preco Final com imposto =" + precoFinal
				+ ", valorFrete=" + valorFrete + "]";
	}


	private String nome;
	private double preco;
	private double peso;
	private double precoFinal;
	private double valorFrete;
	
	
	
	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
