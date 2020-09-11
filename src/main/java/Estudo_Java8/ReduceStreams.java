package Estudo_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class ReduceStreams {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String s = "Inscreva-se no canal e compartilhe esse video";
		String[] split = s.split(" ");
		
		List<String> listaString = Arrays.asList(split);
		
		
		//REDUCE - A função do reduce é pegar todos os elementos do stream, agrupá-los de alguma forma
	//e transformá-los em um único elemento, como no caso abaixo que é uma soma:
		
		//A função usada no reduce deve ser uma função associativa 
			//Ou seja, para o java somar a lista inteira ou somar agrupando por 2 tem que ser a mesma coisa
		//Exemplo: (1 + 2) + (3 + 4) + (5 + 6) = 1 + 2 + 3 + 4 + 5 + 6
		
			//A subtração ´eum exemplo de função que não é associativa 
		
	//Precisa ser associativo para que se eu executar o meu stream em paralelo o resultado precisa ser o mesmo 
	
		//Reduce - soma
		System.out.println("\n---Reduce Soma---");
		Optional<Integer> reduceSoma = lista.stream()
			.reduce((n1, n2) -> n1 + n2);
		
		System.out.println(reduceSoma.get());
		
		
		//Reduce - Multiplicacao
		System.out.println("\n---Reduce Multiplicação---");
		Optional<Integer> reduceMultiplicacao = lista.stream()
				.reduce((n1, n2) -> n1 * n2);
		
		System.out.println(reduceMultiplicacao.get());
		
		
		//Reduce - concatenação
		System.out.println("\n---Reduce Concatenação---");
		Optional<String> reduceConcatenacao = listaString.stream()
				.reduce((s1, s2) -> s1.concat(s2)); //junta todas as palavras
		
		System.out.println(reduceConcatenacao.get());
		
		
		//Reduce - soma
		System.out.println("\n---Reduce Soma---");
		Integer reduceSoma2 = lista.stream()
			.reduce(0, (n1, n2) -> n1 + n2); //0 é valor de identidade, eu chamo esse valor e qualquer outro
			//e o resultado tem que ser esse outro valor, na soma é 0
			//Valor de identidade é o n1 todos os outros valores vão ser o n2 
		
		System.out.println(reduceSoma2);
		
		
		//Reduce - Multiplicacao
		System.out.println("\n---Reduce Multiplicação---");
		Integer reduceMultiplicacao2 = lista.stream()
				.reduce(1, (n1, n2) -> n1 * n2); //Na multiplicação o valor de identidade é 1
		
		System.out.println(reduceMultiplicacao2);
		
		
		//Reduce - concatenação
		System.out.println("\n---Reduce Concatenação---");
		String reduceConcatenacao2 = listaString.stream()
				.reduce("", (s1, s2) -> s1.concat(s2)); //Em string é uma string vazia
		
		System.out.println(reduceConcatenacao2);
		
		//reduce - menor valor
		System.out.println("\n---Reduce Menor Valor---");
		double menorValor = DoubleStream.of(1.5, 2.9, 6.7)
				.reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));
		
		System.out.println(menorValor);
		
		//Reduce - soma
		System.out.println("\n---Reduce Soma---");
		Integer reduceSoma3 = lista.stream()
			.reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2); //Importante ver que o terceiro argumento
												//é a combinação que pode ser igual ao segundo argumento
		//função de combinação, quando o stream está sendo executado em paralelo, posteriormente ele executa
	//um agrupamento e depois uma combinação -- no caso da soma a combinação tem que ser igual a soma normal
		
		System.out.println(reduceSoma3);
		
		
		//Reduce - map + combinar
		System.out.println("\n---Reduce Map + Combinar---");
		String reduce = lista.stream()
				.reduce(
						"",
						(n1, n2) -> n1.toString().concat(n2.toString()),
						(n1, n2) -> n1.concat(n2)
						);
		System.out.println(reduce);
		
		//REDUCE É PARA SE TRABALHAR COM OBJETOS IMUTAVEIS @_@ (º_º)
			//O COLLECT É PARA SE TRABALHAR COM OBJETOS MUTAVEIS
	}
}
