package Modificador_Final;

public class Carro {

	/*
	  	QUANDO A CLASSE LEVA O MODIFICADOR FINAL, ELA NÃO PODE SER EXTENDIDA -- ELA NAO PODE SER MODIFICADA
	  	
	  	public class Monza extends Carro {
	  	
	  	}    Isso não vai funcionar
	  	
	  	Mas é muito raro definir uma classe como final
	 */
	
	
	
	
	private String nome;
	private String marca;
	
	
	//A variavel com o modificador final deve ser iniciada e nao pode ser finalizada
	public static final double VELOCIDADE_LIMITE= 250;
	
	/*
	  Eu nao vou poder criar uma nova referencia para esse comprador,
	   ou seja, não posso instanciar ele novamente, porem, eu posso alterar o seu valor.
	   
	   
	   não posso fazer isso  
	   |
	    `--->   Carro c = new Carro();
	   			c.comprador = new Comprador();
		   
	   Uma varável que faz referencia a outra classe, para ser inicializada preciso fazer um new
	*/
	
	private final Comprador comprador = new Comprador();
	
	
	
	public Comprador getComprador() {
		return comprador;
	}

	
	/*	
	 	QUANDO UM METODO LEVA O MODIFICADOR FINAL, ELE NAO PODE SER SOBRESCRITO 
	 	
	 		Caso a classe leve o modificador final eu posso ficar tranquilo, que ela nao sera extendida, 
	 	então não tem chance do metodo ser sobrescrito
	  	
	  	Esse metodo nao pode ser sobrescrito, sempre tera o mesmo comportamento nas classes filhas, mas ele pode ter sobrecarga dele
	*/
	
	public final void imprime() {
		System.out.println("imprime");
	}
	
	
	
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	@Override
	public String toString() {
		return "Carro{" +
				 "nome='" + nome + '\'' +
				 ", marca='" + marca + '\'' +
				 '}';
	}
	
}
