package Estudo_Java8;

import java.util.stream.IntStream;

public class DiferentesTiposLambdas {

	public static void main(String[] args) {
		//DIFERENTES MANEIRAS DE SE FAZER UMA FUNÇÃO LAMBDA
		
		//PRIMIERO EXEMPLO - Stream que vai de 0 a 4
		System.out.println("\n---Modelo mais simples de lambda---");
		IntStream.range(0, 5)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		//(UTILIZAÇÃO DE PARENTESES)
		//SEGUNDO EXEMPLO  - Stream que vai de 0 a 4
		System.out.println("\n---Utilizando parenteses e definindo o tipo do argumento---");
				IntStream.range(0, 5)
					.filter((int n) -> n % 2 == 0) //Para informar o tipo
					.forEach(System.out::println);
				
		 //TERCEIRO EXEMPLO 
				System.out.println("\n---Utilizando parenteses para se passar dois argumentos---");
				IntStream.range(0, 5)
					.filter((int n) -> n % 2 == 0) //Para informar o tipo
					.reduce((n1, n2) -> n1 + n2) //Para utilizar dois argumentos -- aqui está somando todos eles
					.ifPresent(System.out::println);
							
		//QUARTO EXEMPLO 
				System.out.println("\n---Não passando argumentos---");
				@SuppressWarnings("unused")
				Runnable runnable = () -> System.out.println("Computador está lento"); //Sem argumentos para a 
									//função lambda
				
		//(UTILIZAÇÃO DE CHAVES)
		//QUINTO EXEMPLO
				System.out.println("\n---Utilizando return com chaves---");
				IntStream.range(0, 5)
					.filter((int n) -> {return n % 2 == 0;}) //Para utilizar chaves eu preciso colocar return
										//(caso a fução retorne algo) e o ponto e virgula
					.forEach(System.out::println);
				
	//SEXTO EXEMPLO
				System.out.println("\n---Mais linhas de código numa expressão com chaves---");
				IntStream.range(0, 5)
					.filter((int n) -> {
						System.out.println("Posso ter mais linhas de código numa expressão com chaves.");
						return n % 2 == 0;
						}
					) 
					.forEach(System.out::println); //ou .forEach(n -> System.out.println(n);)
	}

}
