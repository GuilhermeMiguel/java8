package Interfaces_Java8;

//METODOS DEFAULT em INTERFACES
public class Default {

	public static void main(String[] args) {
		

	}
	
	interface Corredor {
		void correr();
	}
	
	static class Pessoa implements Corredor {
		@Override
		public void correr() {
			System.out.println("Piloto correndo.");
		}
	}
	
	//Default são metodos que se eu coloco numa interface eles
//são sobreescritos automaticamente
	//Então eu evito de fornecer uma implementação para esses métodos 
//implementados na interface

}
