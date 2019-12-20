package EstudoJava8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		//REFERENCIA A METODOS
		System.out.println("Method Reference");
		
		System.out.println("\n---Sysout com dois pontos duplo antes o println é uma referência a métodos");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.stream()
			.forEach(System.out::println); //os dois pontos duas vezes são o method reference
		
		//Existem 4 tipos de Method reference
		System.out.println("\n---Existem 4 tipos de Method Reference---");
		
		//Primeiro exemplo - métodos estáticos
			//Sem method reference
		System.out.println("\n---Métodos estáticos -- na mesma classe---");
		lista.stream()
			.map((n) -> multipliquePorDois(n))
			.forEach(System.out::println); 
		
			//Com method reference
		lista.stream()
			.map(MethodReference::multipliquePorDois)
			.forEach(System.out::println); 
	
		//Segundo exemplo - métodos construtores
			//Sem method reference
		System.out.println("\n---Métodos Construtores---");
		lista.stream()
			.map((n) -> new BigDecimal(n))
			.forEach(System.out::println); 

		//Com method reference
		lista.stream()
			.map(BigDecimal::new)
			.forEach(System.out::println); 

		//Terceiro exemplo - várias instancias
			//Sem method reference
		System.out.println("\n---Várias instâncias---");
		lista.stream()
					.map((n) -> n.doubleValue()) //Tranforma os valores em double
					.forEach(System.out::println); //ele chama uma instancia a cada novo n

		//Com method reference
				lista.stream()
					.map(Integer::doubleValue)
					.forEach(System.out::println); 

		//Quarto exemplo - unica instancia
				//Sem method reference
				System.out.println("\n---Única instancia---");
				BigDecimal dois = new BigDecimal(2);
				lista.stream()
					.map((n) -> new BigDecimal(n))
					.map((b) -> dois.multiply(b))
					.forEach(System.out::println); 

				//com method reference
				lista.stream()
					.map(BigDecimal::new)
					.map(dois::multiply) //chamando o método multiply da instancia da classe BigDecimal
						//e não com o nome da classe própriamente dita
					.forEach(System.out::println); 
				
//		// representação com expressão lambda
//				(x, y) -> x.compareTo(y);
//				// representação com method reference
//				Integer::compareTo;
//				 
//		// representação com expressão lambda
//				(x, y) -> conversor.converte(x, y);
//		
//		// representação com method reference
//				conversor::converte;

	}
	
	private static Integer multipliquePorDois(Integer i) {
		return i * 2;
	}
}
