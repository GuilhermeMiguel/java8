package ModificadorFinal;

public class Carro {

	//QUANDO A CLASSE LEVA O MODIFICADOR FINAL, ELA NÃO PODE SER EXTENDIDA
	
	
	private String nome;
	private String marca;
	
	
	//A variavel com o modificador final deve ser iniciada e nao pode ser finalizada
	public static final double VELOCIDADE_LIMITE= 250;
	
	//Eu nao vou poder criar uma nova referencia para esse comprador ou seja, instanciando ele novamente, porem eu posso alterar o seu valor
	private final Comprador comprador = new Comprador();
	
	@Override
	public String toString() {
		return "Carro: "
				+ "nome= " +nome
				+ "marca= " +marca;
	}
	
	
	public Comprador getComprador() {
		return comprador;
	}

	//Esse metodo nao pode ser sobrescrito, mas pode ter sobrecarga dele
	public final void  imprime() {
		System.out.println("imprime");
	}
	
	
	public static double getVelocidadeLimite() {
		return VELOCIDADE_LIMITE;
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
	
	
}
