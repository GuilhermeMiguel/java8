package EstudoJava8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCreator {

	public static void main(String[] args) throws IOException {

		//Collection
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.stream().forEach(System.out::println);
		
		//Arrays
		Integer[] intArray = new Integer[] {1, 2, 3, 4};
		Arrays.stream(intArray).forEach(System.out::println);
		
		//Stream.of
		Stream
			.of("Se", "inscreva", "no", "canal", "!") //O .of eu posso passar qualquer tipo de objeto que ele vai transformar
				//em um stream
			.forEach(System.out::println);
		
		//IntStream.range -- Cria numeros nesse intervalo, excluindo o ultimo
			IntStream.range(0, 5).forEach(System.out::println); 
			
		//IntStream.rangeClosed (inclui o ultimo numero) -- Cria numeros nesse intervalo, excluindo o ultimo
			IntStream.rangeClosed(15, 20).forEach(System.out::println);
			
		//Stream.iterate
			Stream.iterate(5, n -> n * 2)
				.limit(10)
				.forEach(System.out::println); // 5 * 2 ; 10 * 2; 20 * 2; Ele vai pegando os resultados e aplicando a expressão lambda
			
		//BufferedReader - lines  --- ler arquivos -- MÉTODO MUITO LEGAL
			System.out.println("---- ARQUIVO ----");
			File file = new File("C:\\Users\\global.guilherme\\Documents\\Guilherme\\streams.txt");
			FileReader in = new FileReader(file);
			try (BufferedReader br = new BufferedReader(in)){
				br.lines()  //Retorna um stream de string com as linhas que ele leu do arquivo
				.forEach(System.out::println);  
			};
		
		//Files - não trabalha com o conteudo dos arquivos, mas sim os arquivos que estão num diretorio
			System.out.println("---- ARQUIVOS NO PATH DO ECLIPSE ----");
			Path p = Paths.get("");
			Files.list(p).forEach(System.out::println);  
			
		//Random -- Cria um stream com números inteiros aleatórios
			new Random().ints()
			.limit(10)
			.forEach(System.out::println);  
			
		//Pattern - Trabalhar com regex
			String s = "Deixe um curtir no video!";
			Pattern pa = Pattern.compile(" ");
			pa.splitAsStream(s).forEach(System.out::println);			
	}
}
