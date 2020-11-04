package Modificador_Static;

public class CarroTeste {

	/*
	  		Classes Estáticas – As classes estáticas são aquelas que contêm apenas membros estáticos, além de que elas não podem ser instanciadas.
	 
			Em suma, métodos estáticos e variáveis ​​estáticas são de nível de classe, como métodos de instância 
		e variáveis ​​de instância são instância ou nível de objeto. 
	  
	*/
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Carro audi = new Carro("Audi", 280);
		
		Carro bmw = new Carro("Bmw", 290);
		
		
		audi.imprime();
		bmw.imprime();
		
		
		//Se o atributo é estatico muda para todos e nao só para bmw, porem fazer isso nao e correto, pois da a impressao de que estou alterando 
//somente para o objeto bmw
//		bmw.setVelocidadeLimite(300);
		
		Carro.velocidadeLimite = 300; // Dessa forma eu mudo para todos
		System.out.println("\n### Muda a velocidade ###");
		audi.imprime();
		bmw.imprime();
		
		
		//Ou eu posso fazer isso -- se o atributo for public
		//Como ele é private o set dele que faz isso, dessa forma:
		
//		public static void setVelocidadeLimite(double velocidadeLimite) {
//			Carro.velocidadeLimite = velocidadeLimite;
//		}
//		
//		Dessa forma se esta alterando o atributo antes mesmo de se "criar" um objeto
		Carro.velocidadeLimite = 500;
		
		System.out.println("\n### Muda a velocidade ###");
		Carro chevrolet = new Carro("chevrolet", 280);
		audi.imprime();
		bmw.imprime();
		chevrolet.imprime();
		
		
		//Chamando um método estático 
		Carro.metodoEstatico();
		
		
		//Instanciando para chamar o mesmo metodo, mas não é necessário
		Carro c = new Carro("Model 3", 400);
		
		c.metodoEstatico();
		
	}

}
