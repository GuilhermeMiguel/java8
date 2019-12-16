package EstudoJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class InterfacesFuncionais {

	public static void main(String[] args) {
	//INTERFACES FUNCIONAIS - aquelas que só tem um método
		
		//Supplier  -- Representa uma função que vai entregar algo, ela não recebe nada, porém irá entregar algo
			//É um fornecedor, o suplier entrega um valor para um metodo, no caso o generate
		Stream.generate(() -> new Random().nextInt())
			.limit(5)
			.forEach(System.out::println);
		
		//Consumer -- Não retorna nada, porém espera um valor
			//Por exemplo o forEach -- que espera algo mas nao retorna nada, só recebe algo e o utiliza
		Stream.generate(() -> new Random().nextInt()) //Suplier
			.limit(5)
			.forEach(n -> System.out.println(n));
		
		
		//Consumer -- BiConsumer
		
		
		//Predicate 
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.stream()
			.filter(e -> e % 2 == 0) //O filter recebe um predicate -- Recebe um valor e retorna um booleano
					//Ele faz um tipo de teste
			.forEach(System.out::println);
		
		
		//BiPredicate -- Ele recebe dois valores e faz uma comparação dentro desses dois valores dentro 
			//de um expressão lambda e retorna o verdadeiro ou falso
		
		//Function -- Recebe um valor e retorna um valor
		
		lista.stream()
			.filter(e -> e % 2 == 0) //O filter recebe um predicate -- Recebe um valor e retorna um booleano
					//Ele faz um tipo de teste
			.map(e -> e * 2) //O map é uma function, ele recebe um valor, processa e retorna outro valor 
			.forEach(System.out::println);
		
		//BiFunction -- Recebe dois valores e retorna um novo valor
		
		
		//UnaryOperator e BinaryOperator -- São na verdade Functions
			//Unary o parametro de entrada e a saida devem ser do mesmo tipo
			//O BiFunction os tres argumentos de entrada tem que ter o mesmo tipo, os de saida tbm
			//REDUCE UTILIZA MUITO ISSO
			lista.stream()
				.filter(e -> e % 2 == 0) //predicate
				.map(e -> e * 2)  //function
				.reduce((e1, e2) -> e1 + e2) //BinaryOperator
				.ifPresent(System.out::println);
	}
}
