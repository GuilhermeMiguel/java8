package Estudo_Java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams_2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Person> pessoas = getPeople();
	
		
		
		//==================================================================================================	
		
		//Filtrar pelo genero feminino
		List<Person> feminino = pessoas
			.stream()
			.filter(x -> x.getGenero().equals(Genero.FEMININO))
			.collect(Collectors.toList()); //para voltar a ser uma lista
		
//		feminino.forEach(System.out::println);
		
		
		
		
		
		//==================================================================================================	
		
		//Ordenar
		List<Person> ordenada = pessoas	
			.stream()
			//Method Reference para pegar o campo que eu quero 
			.sorted(Comparator.comparing(Person::getIdade).thenComparing(Person::getGenero)) //Posso adicionar mais de uma comparação
//			.sorted(Comparator.comparing(Person::getIdade).reversed()) //PARA INVERTER A ORDEM DA ORDENAÇÃO -- MAIOR PARA O MENOR  
			.collect(Collectors.toList());
		
//		ordenada.forEach(System.out::println);
		
		
		
		
		//==================================================================================================	
		//All match 
	//Retorna um booleano informando se todos os itens corresponde aquela condição, no exemplo, dizendo se todos tem idade maior que 5
		
		System.out.println();
		
		boolean allMatch = pessoas
				.stream()
				.allMatch(x -> x.getIdade() > 5);
		System.out.println("Todos tem idade maior que 5 ? " + allMatch);
		
		
		System.out.println();
		
		//Como existem mulheres a comparação de que todos sao homens retorna false
		boolean allMatch2 = pessoas
				.stream()
				.allMatch(x -> x.getGenero().equals(Genero.MASCULINO));
		
		System.out.println("Todos são homens ? " + allMatch2);
		
		
		System.out.println();
		
		
		
		
		
		//==================================================================================================	
		
		//Any match 
		//Retorna um booleano informando se algum item corresponde aquela validação, no exemplo se existe alguma mulher
		boolean anyMatch = pessoas
				.stream()
				.anyMatch(x -> x.getGenero().equals(Genero.FEMININO));
		
		System.out.println("Existe alguma mulher? " + anyMatch);
		
		
		System.out.println();
		
		
		
		
		//==================================================================================================	
		
		//None match 
		//Retorna um booleano informando se algum item corresponde aquela validação, no exemplo se não existe algum Antonio, como não existe retorna true
	//Se eu fizesse a validação com James Bond retornaria false, pois existe James Bond
		boolean noneMatch = pessoas
				.stream()
				.noneMatch(x -> x.getNome().equals("Antonio"));
				
		System.out.println("Não existe Antonio na lista ? " + noneMatch);
		
		
		System.out.println();
		
		
		
		//==================================================================================================
		
		//Max 
	//Pega o item com o maior valor de acordo com o campo que estou passando 
		pessoas
			.stream()
			.max(Comparator.comparing(Person::getIdade)) //Pego o maior item
			.ifPresent(System.out::println); //Com method reference imprimo ele
//			.ifPresent(x -> System.out.println(x.getIdade()));
		
		
		System.out.println();
		
		
		
		//==================================================================================================	
		
		//Min 
	//Pega o item com o menor valor de acordo com o campo que estou passando 
		pessoas
			.stream()
			.min(Comparator.comparing(Person::getIdade)) //Pego o maior item
			.ifPresent(System.out::println); //Com method reference imprimo ele
//			.ifPresent(x -> System.out.println(x.getIdade()));
		
		System.out.println();
		
		
		
		
		
		//==================================================================================================	
		
		//Group
	//Agrupa elementos de acordo com uma condição 
		Map<Genero, List<Person>> agrupamento = pessoas
			.stream()
			.collect(Collectors.groupingBy(Person::getGenero));
		
		
		
		agrupamento.forEach((genero, pessoa) -> { //percorre a lista
			System.out.println(genero);	//Imprime o primeito item do map -- a chave
			pessoa.forEach(System.out::println); //Percorre e imprime a lista do map -- valor 
		});
		
		System.out.println();
		
		
		
		//EXEMPLO -- ENCONTRAR A MULHER MAIS VELHA DA LISTA 
		String mulherMaisVelha = pessoas
			.stream()
			.filter(x -> x.getGenero().equals(Genero.FEMININO))
			.max(Comparator.comparing(x -> x.getIdade())).get().getNome();
			
		System.out.println("Mulher mais velha: " + mulherMaisVelha);
		
		
		//ENCONTRAR HOMEM MAIS VELHO DA LISTA
		Optional<String> homemMaisVelho = pessoas
			.stream()
			.filter(x -> x.getGenero().equals(Genero.MASCULINO))
			.max(Comparator.comparing(Person::getIdade))
			.map(y -> y.getNome());
//			.map(Person::getNome);
		
		System.out.println("Homem mais velho: " + homemMaisVelho.get());
								// OU
		homemMaisVelho.ifPresent(x -> System.out.println("Homem mais velho: " + x));
		
								//OU
		homemMaisVelho.ifPresent(System.out::println);
	}	
	
	
	
	
		
	private static List<Person> getPeople() {
		return List.of (
				new Person("James Bond", 20, Genero.MASCULINO),
				new Person("Will Smith", 52, Genero.MASCULINO),
				new Person("Michelle Obama", 50, Genero.FEMININO),
				new Person("Neymar Jr", 27, Genero.MASCULINO),
				new Person("Yara Senger", 40, Genero.FEMININO),
				new Person("Loiane Groner", 36, Genero.FEMININO)
		);
	}
	
	
	
	
	
	
	
	
	
}

class Person {
	private final String nome; // final só se pode gerar get, não set, pois, valores não modificados
	private final int idade;
	private final Genero genero;
	
	
	public Person(String nome, int idade, Genero genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}


	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return idade;
	}


	public Genero getGenero() {
		return genero;
	}
	
	
	
	@Override
	public String toString() {
		return "Pessoa {" +
				"nome='" + nome + '\'' +
				", idade=" + idade + 
				", genero=" + genero +
				'}';
	}
	
}

