package Assertivas;

public class AssertivasTeste {

	public static void main(String[] args) {

		calculaSalario(-5);
		
		calcSalario(-5);
	}
	
	
	private static void calculaSalario(double salario) {
		
		/*
		 		O assert eu posso utilizar na fase de testes para retirar esses if e else
		 	
		 	com ele eu garanto que aquela condição é sempre verdadeira, pois se não for eu tenho um grande erro no meu codigo
		 
		 	e ele vai expor isso 
		 	
		 	
		 	
		 	-- Deve ser utilizado para metodos privados
		 	 	
		 	
		 	
		 	 !!!!!!!!!!!!!!!!!!!!!!!! Para eles funcionarem eu preciso ativa-los, por padrão eles estão desabilitados !!!!!!!!!!!!!!!!!!!!!!!!!!
		 			 	
		 	
		 	
		 	-- https://www.youtube.com/watch?v=kd8L6jS8C3Q&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=78 -- Video para auxilio
		 	
		 	
		 	
		 	-- Asserts não são exceptions, são erros mesmo, aquilo não deve acontecer nunca -- funcionam com a lógica de um if
		 	
		 	
		 	
		 	-- E se for pra produção, esse código vai ser ignorado -- a jvm vai ignorar pois esta desativado
		 	
		 	 
		*/
		
		
		assert (salario > 0) : "O salário deve ser maior que zero, foi passado o salario : " + salario;
		
		
		
		if(salario > 0) {
			//faz algo
		} else {
			System.out.println("Ferrou");
		}
	}
	
	
	// Caso o metodo seja publico o ideal é eu lançar uma excessão 
	public static void calcSalario(double salario) {
		if(salario < 0) {
			throw new IllegalArgumentException();
		}
	}

}
