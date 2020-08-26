package ModificadorStatic;

public class CarroTeste {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Carro audi = new Carro("Audi", 280);
		
		Carro bmw = new Carro("Bmw", 290);
		
		System.out.println("----------------");
		audi.imprime();
		bmw.imprime();
		
		
		//Se o atributo é estatico muda para todos e nao só para bmw, porem fazer isso nao e correto, pois da a impressao de que estou alterando 
//somente para o objeto bmw
//		bmw.setVelocidadeLimite(300);
		
		Carro.velocidadeLimite = 300;
		System.out.println("\n####################");
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
		
		System.out.println("\n####################");
		Carro chevrolet = new Carro("chevrolet", 280);
		audi.imprime();
		bmw.imprime();
		chevrolet.imprime();
	}

}
