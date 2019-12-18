package EstudoJava8;

import java.util.Arrays;
import java.util.List;

public class DebugStream {
	
	public static void main(String[] args) {
		
		//DEBUG DE FUNÇÕES LAMBDA 
		List<Integer> lista = Arrays.asList(1, 2, 5, 8, 9);
		
		System.out.println("\n---Trabalha com stream e stringbuilder---");
		lista.stream()
			.map((n) -> new StringBuilder().append(n).append("s").append("a"))
			.forEach(System.out::println); 

		
		//Para melhor visualizar fazer a expressão lambda em blocos
		System.out.println("\n---Para realizar a visualização do stream em blocos---");
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
		System.out.println("\n---Separação da função lambda em outro método para melhor visualização---");
		lista.stream()
			.map((n) -> converteParaStringBuilder(n))
			.forEach(System.out::println); 
		
		
		//Método peek
		System.out.println("\n---Método peek que lança uma mensagem para que se possa visualizar melhor os resultados---");
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
