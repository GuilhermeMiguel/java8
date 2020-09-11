package Modificador_Static;

public class Carro {

	//A velocidade limite deve ser igual para todos os carros do pais
	private String nome;
	private double velocidadeMaxima;

	/*
	 		Metodos estaticos pertencem a classe e não aos objetos que instanciam essa classe
		são os métodos em Java que podem ser chamados sem criar um objeto de classe
	*/
	
	public static double velocidadeLimite = 240;
			//velocidadeLimite pertence a classe Carro
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public static void metodoEstatico() {
		System.out.println("\n ------------------------------------------------------ \n Esse é um método estatico");
	}
/*
	 
	 O elemento static pertence a classe e não a um objeto que estende ela
	
			Por exemplo, instanciando carro: 
	
			 Carro audi = new Carro();
			audi.setVelocidadeLimite();
	
	Dessa forma se o atributo nao for estatico a velocidade limite será alterada somente para o objeto audi, nao para todos
tornando o atributo velocidadeLimite estatico, eu faço com que ele seja da classe e nao do objeto

	Se eu setar audi.setVelocidadeLimite() os objetos que acessarão essa velocidade depois também estarão com ela alterada, 
então não faz sentido colocar para um objeto setar, mas sim para acessar chamando a classe 
	 Carro.velocidadeLimite 
	 
	 
*/
	 
	
	
	public void imprime(){  
/*
		 A palavra reservada this faz referecia ao objeto e nao a classe, entao velocidadeLimite nao precisa de this, pois é um atributo associado a classe
	Se eu colocar um static nesse metodo eu nao vou poder utilizar nenhum this
		
		
		Metodos estaticos podem acessar as variaveis antes mesmo de estarem na memoria, podendo gerar um problema, por isso eu não acesso atributos não estaticos/iniciliazados na classe
	//pois precisaria preencher esses atributos ao instanciar a classe 
				
*/
		
		System.out.println("----------------");
		
		System.out.println("nome " + this.nome + "\nvelocidadeMaxima " +this.velocidadeMaxima + "\nvelocidadeLimite " +velocidadeLimite);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		//coloca-se this para o java saber que é o atributo da classe
	//se eu não colocasse ele utilizaria duas vezes o parametro recebido no metodo, pois ele da mais prioridade
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
//é como se ele estivesse alterando a propria classe, então não faz sentido eu colocar set, que sera acessado só quando um objeto instanciar a classe
	
}
