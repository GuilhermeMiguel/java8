package EstudoJava8;

import java.util.Arrays;
import java.util.List;

public class DebugStream {
	
	public static void main(String[] args) {
		
		//DEBUG DE FUNÇÕES LAMBDA 
		List<Integer> lista = Arrays.asList(1, 2, 5, 8, 9);
		
		lista.stream()
			.map((n) -> new StringBuilder().append(n).append("s").append("a"))
			.forEach(System.out::println); 

		
		//Para melhor visualizar fazer a expressão lambda em blocos
		lista.stream()
			.map((n) -> {
				StringBuilder builder = new StringBuilder();
				builder.append(n);
				builder.append("s");
				builder.append("a");	
				return builder;
			})
			.forEach(System.out::println); 
	
		//Separar as operações da função lambda em um outro metodo
		lista.stream()
			.map((n) -> converteParaStringBuilder(n))
			.forEach(System.out::println); 
		
		
		//Método peek
				lista.stream()
					.peek(n -> System.out.println(n + "DEBUG!!")) //método mais para a ideia de log ou debug
					.map((n) -> converteParaStringBuilder(n))
					.peek(n -> System.out.println(n + "outro peek!!")) //posso colocar mais de um método peek
					.forEach(System.out::println); 
	}
	
	private static StringBuilder converteParaStringBuilder(Integer n) {
		StringBuilder builder = new StringBuilder();
			builder.append(n);
			builder.append("s");
			builder.append("a");	
			return builder;
	}
}
