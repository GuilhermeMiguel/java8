package EstudoJava8;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Java8_Optional {
	public static void main(String[] args) {
		
		String s = "Teste";
		String s1 = "1";
		
		
		Optional<Integer> numero = converteEmNumero(s1); //Esse é um objeto que pode ou não conter um número inteiro
		
		
		//Método isPresent
		System.out.println(numero.isPresent()); //Verifica se existe valor ou não e retorna true or false
		
		
		//Método isPresent se passando como parametro uma expressão lambda
		numero.ifPresent(n -> System.out.println(n)); //Se existir valor ele executa esse código (a expressao lambda) e imprime o valor
		// |
		//  `---> É um If implicito
		
		
		//Método get
		System.out.println(numero.get()); //Pega o valor do optional, porém se for passado uma string com frase/letras, lança uma exceção
				
		
		//Método orElse
		Integer num = converteEmNumero(s).orElse(2); //Aqui se ele não consegue pegar o valor do número ele substitui por um valor
		//padrão que no caso é o 2
		
		System.out.println(num);
		
		
		//Método orElseGet
		Integer num2 = converteEmNumero(s)
				.orElseGet(() -> {return operacaoPesada();}); //Nesse caso ele retorn aigual a operação anterior, porém 
		//se a minha condição de existir um número na string for atendida, dessa forma eu tenho um ganho muito grande de performance
		
		System.out.println(num2);
		
		//orElseThrow
		Integer num3 = converteEmNumero(s)
				.orElseThrow(); //Esse código lança um exceção se o optional estiver vazio, como parâmetro posso passar  uma
		//lambda Exression para ele fazer um condicional e ser mais rapido
		
		System.out.println(num3);
		
		//Utilizando stream
		Stream.of(1, 2, 3)
				.findFirst()
				.ifPresent(System.out::println);
	}
	
	private static Integer operacaoPesada() {
		return null;
	}

	public static Optional<Integer> converteEmNumero(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
			
		} catch (Exception e) {
			return Optional.empty();
		}
				
	}
	
	//NÃO UTILIZAR OPTIONAL PARA RECEBER COMO ARGUMENTO, SE FOR NECESSÁRIO RECEBER VALOR OU VAZIO, EU FAÇO UMA SOBRECARGA DE MÉTODO
//QUE NÃO RECEBE PARAMETROS
	
	//Optional com tipo primitivo
	public static OptionalInt converteEmNumeroInt(String numeroStr) {
		try {
			int integer = Integer.parseInt(numeroStr);
			return OptionalInt.of(integer);
			
		} catch (Exception e) {
			return OptionalInt.empty();
		}
				
	}
}

