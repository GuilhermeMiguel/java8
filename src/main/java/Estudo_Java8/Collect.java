package Estudo_Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		//MÉTODO COLLEC CONTENDO AGRUPAMENTO PARA OBJETOS MUTAVEIS 
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//fornecedor (função lambda que vai fornecer a instancia do objeto que estamos querendo utilizar
	//+ acumulação + combinação
		System.out.println("\n---Lambda que fornece a instancia do objeto---");
		lista.stream()
		.collect(
				() -> new ArrayList<>(),
				(l, e) -> l.add(e),
				(l1, l2) -> l1.addAll(l2)
				);
	
		//Método toList
		System.out.println("\n---Transforma o stream em list---");
		List<Integer> collect = lista.stream()
			.filter(n -> n % 2 == 0)
			.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		//Método toSet
		System.out.println("\n---Transforma o stream em set---");
		Set<Integer> collect2 = lista.stream()
					.filter(n -> n % 2 == 0)
					.collect(Collectors.toSet());
				
				System.out.println("Esse é o list: " + collect + " esse é o set: " +collect2);
		
		//Método collect
		System.out.println("\n---Transforma o stream em LinkedList---");
		lista.stream()
				.filter(n -> n % 3 == 0)
				.collect(Collectors.toCollection(() -> new LinkedList()));
				
		//	System.out.println("Esse é o toCollection: " + collect3);
		
		//Método joining - agrupa os valores do stream em uma unica string
			//diferente do reduce, o joining usa internamente um stringbuilder que é muito mais performatico
		System.out.println("\n---Agrupa os valores em uma única string---");
		String join = lista.stream()
				.map(n -> n.toString())
				.collect(Collectors.joining());
		
		System.out.println(join);
		
		
		//averaging - média
		System.out.println("\n---Tira a média---");
			Double mediaInteiros = lista.stream()
				.collect(Collectors.averagingInt(n -> n.intValue()));
			
			System.out.println("Média dos valores inteiros presentes nessa lista:" +mediaInteiros);
		
			
		//summing - faz o mesmo, que o anterior
			System.out.println("\n---Tira a média dos valores inteiros---");
			Integer somaInteiros = lista.stream()
				.collect(Collectors.summingInt(n -> n.intValue()));
			
			System.out.println("Média dos valores inteiros presentes nessa lista:" +somaInteiros);
			
			
			//summarizing
			System.out.println("\n---Tira varios tipos de valores, media, quantidade, maximo, minimo---");
			IntSummaryStatistics mediaTotais = lista.stream()
				.collect(Collectors.summarizingInt(n -> n.intValue()));
			
			System.out.println("" +mediaTotais.getAverage());
			System.out.println("" +mediaTotais.getCount());
			System.out.println("" +mediaTotais.getMax());
			System.out.println("" +mediaTotais.getMin());
			System.out.println("" +mediaTotais.getSum());
		
			
			//counting
			System.out.println("\n---Quantidade---");
			Long quantidade = lista.stream()
				.collect(Collectors.counting());
			System.out.println(quantidade);
			
			
			//max
			System.out.println("\n---Maximo---");
			Optional<Integer> max = lista.stream()
					.collect(Collectors.maxBy(Comparator.naturalOrder()));
				System.out.println(max);
				
				
			//min
				System.out.println("\n---Min---");
				Optional<Integer> min = lista.stream()
						.collect(Collectors.minBy(Comparator.naturalOrder()));
					System.out.println(min);
					
					
			//groupinBy
			System.out.println("\n---Forma grupos---");
			Map<Integer, List<Integer>> groupingBy = lista.stream()
					.collect(Collectors.groupingBy(n -> n % 3 ));
			System.out.println(groupingBy);
			
			
			//partitionBy
			System.out.println("\n---Forma grupos para true e false para determinada condição---");
			Map<Boolean, List<Integer>> partitioningBy = lista.stream()
					.collect(Collectors.partitioningBy(n -> n % 3 == 0 ));
			System.out.println(partitioningBy);
			
			
			//toMap -- duas expressões lambda, uma para definir a chave e outra o valor
			System.out.println("\n---Forma grupos de acordo com os valores da condição---");
			Map<Integer, Integer> toMap = lista.stream()
					.collect(Collectors.toMap(n -> n, n -> n * 2));
			System.out.println(toMap);
			
			
			//toMap -- duas expressões lambda, uma para definir a chave e outra o valor
			System.out.println("\n---Forma grupos de acordo com os valores da condição---");
			Map<Integer, Double> toMap2 = lista.stream()
					.collect(Collectors.toMap(n -> n, n -> Math.pow(n.doubleValue(), 5)));
			System.out.println(toMap2);
	}
}
