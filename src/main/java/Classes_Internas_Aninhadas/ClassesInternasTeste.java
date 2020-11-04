package Classes_Internas_Aninhadas;

import Classes_Internas_Aninhadas.ExternaNaoEstatica.InternaEstatica;
import Classes_Internas_Aninhadas.ExternaNaoEstatica.InternaEstatica.Teste;

// Essa é a classe mais externa
public class ClassesInternasTeste {

	private final String MENSAGEM = "Lidando com classes internas";
		
	class Interna {
		public void verificarClasseExterna() {
			System.out.println(MENSAGEM);
			
			//O this dentro da classe interna expoe a classe interna 
			System.out.println("This com classe interna: " + this.getClass().getName());
			
			//this com a classe externa 
			System.out.println("This com classe externa: " + ClassesInternasTeste.this.getClass().getName());
		}
	}
	
	// Esse metodo fica na classe externa
	public static void main(String[] args) {

		// Maneiras de instanciar e utilizar os metodos
		
		ClassesInternasTeste externa = new ClassesInternasTeste();
		
		// Intanciando a classe interna, preciso instanciar a externa e depois a interna
		ClassesInternasTeste.Interna in = externa.new Interna();
		
		// Intanciando diretamente
		ClassesInternasTeste.Interna in2 = new ClassesInternasTeste().new Interna();
		
		in.verificarClasseExterna();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		in2.verificarClasseExterna();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		
		/*
		  	Estou estendendo a classe externa que nao é estatica, e a classe interna que é estatica eu só chamo com o .NomeDaClasse
		*/
		
		ExternaNaoEstatica.InternaEstatica classeEstatica = new ExternaNaoEstatica.InternaEstatica();
		
		
		InternaEstatica est = new InternaEstatica();
		
		
		est.imprimir();
		// Chamando o metodo da classe estatica 
		classeEstatica.imprimir();
		
		//Uma classe estatica dentro de outra classe estatica eu posso instanciar
		InternaEstatica2 testeInternaEstatica = new InternaEstatica2();
		testeInternaEstatica.imprimir();
		
		
		Teste testeInternaEstatica2 = new Teste();
		testeInternaEstatica2.fazAlgo();
	}
	
	
	static class InternaEstatica2 {
		public void imprimir() {
			System.out.println("Dentro do interna 2");
		}
	}

}


//Lidando com classes estaticas
class ExternaNaoEstatica {
	
	//Classe estatica 
    static class InternaEstatica{
        public void imprimir(){
            System.out.println("Dentro da classe Estatica");
        }
        
        static class Teste {
        	public void fazAlgo() {
        		
        	}
        }
    }
    



}

