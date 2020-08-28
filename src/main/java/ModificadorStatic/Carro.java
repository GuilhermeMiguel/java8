package ModificadorStatic;

public class Carro {

	//A velocidade limite deve ser igual para todos os carros do pais
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240;
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	//O elemento static pertence a classe e não a um objeto que estende ela
	
	//Por exemplo, instanciando carro 
	
	//Carro audi 
//	Carro audi = new Carro();
//	audi.setVelocidadeLimite();
//	
//	Dessa forma se o atributo nao for estatico a velocidade limite será alterada somente para o objeto audi, mas nao para todos
//	
//tornando o atributo velocidadeLimite estatico, eu faço com que ele seja da classe e nao do objeto
//
//	Entao 
//	
//	
	 
	//this faz referecia ao objeto e nao a classe, entao velocidadeLimite nao precisa de this, pois é da classe
	public void imprime(){ //Se eu colocar um static nesse metodo eu nao vou poder utilizar nenhum this 
		//Metodos estaticos podem acessar as varaiveis antes mesmo de estarem na memoria
		//Nao posso acessar atributos nao estaticos atraves de metodos estaticos sem instanciar a classe
		System.out.println("nome " + this.nome + "\nvelocidadeMaxima " +this.velocidadeMaxima + "\nvelocidadeLimite " +velocidadeLimite);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
//	public static double getVelocidadeLimite() {
//		return velocidadeLimite;
//	}
//	public static void setVelocidadeLimite(double velocidadeLimite) {
//		Carro.velocidadeLimite = velocidadeLimite;
//	}
	
//	O set esta alterando o atributo da classe carro e nao do seu objeto -- Porque e static
//é como se ele estivesse alterando a propria classe
	
}
