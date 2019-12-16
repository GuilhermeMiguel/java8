package EstudoJava8;

import java.util.stream.IntStream;

public class DiferentesTiposLambdas {

	public static void main(String[] args) {
		//DIFERENTES MANEIRAS DE SE FAZER UMA FUNÇÃO LAMBDA
		
		//PRIMIERO EXEMPLO - Stream que vai de 0 a 4
		IntStream.range(0, 5)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		//(UTILIZAÇÃO DE PARENTESES)
		//SEGUNDO EXEMPLO  - Stream que vai de 0 a 4
				IntStream.range(0, 5)
					.filter((int n) -> n % 2 == 0) //Para informar o tipo
					.forEach(System.out::println);
				
		 //TERCEIRO EXEMPLO 
				IntStream.range(0, 5)
					.filter((int n) -> n % 2 == 0) //Para informar o tipo
					.reduce((n1, n2) -> n1 + n2) //Para utilizar dois argumentos -- aqui está somando todos eles
					.ifPresent(System.out::println);
				
	    //QUARTO EXEMPLO 
				IntStream.range(0, 5)
					.filter((int n) -> n % 2 == 0) //Para informar o tipo
					.reduce((n1, n2) -> n1 + n2) //Para utilizar dois argumentos -- aqui está somando todos eles
					.ifPresent(System.out::println);
				
		//QUINTO EXEMPLO 
				@SuppressWarnings("unused")
				Runnable runnable = () -> System.out.println("Computador está lento"); //Sem argumentos para a 
									//função lambda
				
		//(UTILIZAÇÃO DE CHAVES)
		//SEXTO EXEMPLO
				IntStream.range(0, 5)
					.filter((int n) -> {return n % 2 == 0;}) //Para utilizar chaves eu preciso colocar return
										//(caso a fução retorne algo) e o ponto e virgula
					.forEach(System.out::println);
				
	//SETIMO EXEMPLO
				IntStream.range(0, 5)
					.filter((int n) -> {
						System.out.println("Posso ter mais linhas de código numa expressão com chaves.");
						return n % 2 == 0;
						}
					) 
					.forEach(System.out::println); //ou .forEach(n -> System.out.println(n);)
	}

}
