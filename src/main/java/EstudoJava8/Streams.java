package EstudoJava8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		//STREAMS - Fluxo de dados 
		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);
		
		//Java 5
		for (Integer lists : lista) {
			System.out.println(lists);
		}
		
		System.out.println("-----------------------------------------");
		
		//Java8 -- É como se cada item da lista fosse um dado do fluxo de dados
		lista.stream().forEach(e -> System.out.println(e));
		
		//OPERAÇÕES INTERMEDIARIAS
		
		//Método skip
		lista.stream()
			.skip(2) //Esse método pula/ignora os primeiros dados da lista, no caso são 2 (ignora 1 e 5)
					//Operação intermediaria, pois consigo fazer várias dela antes de fechar o stream, por exemplo,
				//eu consigo fazer vários skips
			.forEach(e -> System.out.println(e));
		
		
		//Método skip
				lista.stream()
					.limit(2) //Esse método diz quantos elementos serão processados, no caso 2 números
					.forEach(e -> System.out.println(e));
				
				
		//Método distinct
				lista.stream()
					.distinct() //Assim como no sql são ignorados os elementos repetidos
								//Ele usa a comparação do equals e hashcode, para classes de tipo primitivo ou wrappers
						//esses métodos já estão implementados, agora para classes minhas eu preciso implementar corretamente
					.forEach(e -> System.out.println(e));
				
	 //Método distinct
				lista.stream() //Operações intermediarias eu consigo fazer várias antes que o strem seja finalizado
					.skip(2)
					.limit(3)
					.distinct() 
					.forEach(e -> System.out.println(e)); //FOREACH é uma operação final, depois dele não se pode fazer nada
				
	//Método filter
				lista.stream() //filtros mais especificos
					.filter(e -> e % 2 == 0) //Exibir os números pares
					.forEach(e -> System.out.println(e)); //FOREACH é uma operação final, depois dele não pode-se fazer nada
				
   //Método map
				lista.stream() //método utilizado para a transformação de dados
					.map(e -> e * 2) //multiplicar todos os itens por 2
					.forEach(e -> System.out.println(e)); //FOREACH é uma operação final, depois dele não se pode fazer nada
	
	//SEMPRE LEMBRAR QUE A LISTA ORIGINAL NÃO É ALTERADA, EXISTE A IMUTABILIDADE 
				//O CORRETO É EU ARMAZENAR ESSES STREAMS NUMA NOVA LISTA 
				//O IDEAL É FAZER OS FILTROS ANTES DAS TRANSFORMAÇÕES - ATÉ PARA O ENTENDIMENTO 
				//POR EXEMPLO, FAZER UM LIMIT() ANTES DE UM MAP()
			

				//OPERAÇÕES FINAIS
				//Método map
				Stream<Integer> map = lista.stream() //método utilizado para a transformação de dados
					.limit(3)
					.map(e -> e * 2);
				
				//2 MAPS ASSIM NÃO FUNCIONAM, PORQUE SÃO DUAS OPERAÇÕES FINAIS
					map.forEach(e -> System.out.println(e)); //FOREACH é uma operação final, depois dele não se pode fazer nada
					map.forEach(e -> System.out.println(e)); //FOREACH é uma operação final, depois dele não se pode fazer nada
					
	//Método count
			long count = lista.stream()
					.filter(e -> e % 2 == 0)
					.map(e -> e * 2)
					.count(); // conta quantos elementos sobraram nesse stream
			
			System.out.println("Quantos elementos estão no stream de count: " + count);
			
	//Método min
				Optional<Integer> min = lista.stream() //Optional evitar de fazer comparações de diferente de null
					.filter(e -> e % 2 == 0)
					.min(Comparator.naturalOrder()); //pego o menor valor do Stream, nesse caso está utilizando um comparator já 
				//implementado
				
				//min.get() retorna o valor integer que eu quero
				System.out.println("Menor valor contido nesse stream: " + min.get());
	
	//Método max
				Optional<Integer> max = lista.stream() 
					.filter(e -> e % 2 == 0)
					.max(Comparator.naturalOrder()); //pego o maior valor do Stream, nesse caso está utilizando um comparator já 
				//implementado
				
				//max.get() retorna o valor integer que eu quero
				System.out.println("Maior valor contido nesse stream: " + max.get());
				
				
	//Método collect - toList
			List<Integer> novaLista = lista.stream() 
					.filter(e -> e % 2 == 0)
					.map(e -> e * 3)
					.collect(Collectors.toList()); // Esse Colletor transforma o resultado do stream numa lista 
			novaLista.forEach(n -> System.out.println(n));
			
	//Método collect - groupBy
			Map<Boolean, List<Integer>> mapa = lista.stream() 
					.map(e -> e * 3)
					.collect(Collectors.groupingBy(e -> e % 2 == 0)); // Esse Colletor cria um map de acordo com um critério que eu 
																//informo, no caso criei um map que armazena juntos os numeros pares
														//se for verdadeiro e os impares se for falso
									
			System.out.println(mapa);
			//A saida será a seguinte {false=[3, 15, 27, 3, 21, 27, 27], true=[24, 12, 18, 18]}
			
			
		//Método collect - groupBy
			Map<Integer, List<Integer>> mapa2 = lista.stream() 
					.collect(Collectors.groupingBy(e -> e % 3)); // Esse Colletor cria um map de acordo com um critério que eu 
																//informo, no caso criei um map que armazena juntos os numeros de
														//acordo com o resto da sua divisão por 3
									
			System.out.println(mapa2);
			//A saida será a seguinte {0=[9, 6, 6, 9, 9], 1=[1, 1, 4, 7] 2=[5, 8]} os com resto 0, os com resto 1 e os com resto 2
		
		//Método collect - joining
				String collect = lista.stream() 
						.map(e -> String.valueOf(e))
						.collect(Collectors.joining()); //Utilizado para agrupar string , junta tudo numa só string
									
			System.out.println("String de todos os números concatenados: " + collect);
			//15891476699
			
	//Método collect - joining - COM DELIMITADOR
			String collectVirgula = lista.stream() 
					.map(e -> String.valueOf(e))
					.collect(Collectors.joining(",")); //Utilizado para agrupar string , junta tudo numa só string, separados por ,
								
		System.out.println("String de todos os números concatenados: " + collectVirgula);
			//1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9
		
		//STREAM PODE SER MULTI THREAD -- OPERANDO EM MAIS DE UM NÚCLEO DO PROCESSADOR
		
		//stream = loops implicitos
		//for - while - do..while = loops explicitos
		
	}
}
