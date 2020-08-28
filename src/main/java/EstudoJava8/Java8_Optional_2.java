package EstudoJava8;

import java.util.Optional;

public class Java8_Optional_2 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		Optional<String> empty = Optional.of("Hellow");
	
		//Verifica se o optional de string esta preenchido, se estiver retorna true
		System.out.println("Metodo isPresent -------> " + empty.isPresent());
		
		
		
		//==================================================================================================
		
		Optional<String> empty2 = Optional.ofNullable(null);
		
		//orElse -> Se a minha string retornada for nula ele continua com outra 
		String orElse = empty2
				.map(String::toUpperCase) //aplicando um reference method para deixar a string em CAIXA ALTA
				.orElse("World");
		
		System.out.println("Metodo orElse -------> " + orElse);
	
				//Se fosse com validações comuns faria o seguinte
					String hello = null;
					
					if(hello != null) {
						System.out.println(hello.toUpperCase());
					} else {
						System.out.println("World");
					}
					
		
		
		//==================================================================================================
		
		String orElseGet = empty2
				.map(String::toUpperCase)
				.orElseGet(() -> {
					//Faço as validações necessárias
					return "World";
				});
		
		System.out.println("Metodo orElseGet -------> " + orElseGet);
				
		
		
		//==================================================================================================	
		
		try {
			String orElseThrow = empty2
					.map(String::toUpperCase)
					.orElseThrow(IllegalStateException::new);
			
			System.out.println("Metodo orElseThrow -------> " + orElseThrow);	
		} catch (Exception ex) {
			System.out.println(ex+ " capurada");
		}
		
		//==================================================================================================	
		
		//Simplificando
		empty2.ifPresent(x -> System.out.println(x));
		
		empty2.ifPresentOrElse (x -> {
			System.out.println(x);	
		}, () -> {
			System.out.println("world");
		});
		
		
		//Mais simples ainda 
		empty2.ifPresentOrElse(System.out::println, () -> System.out.println("World"));
		
		
		//==================================================================================================
		
		
		//Passando o email ele cai no map e faz o lowerCase
		//Não passando o email ele cai no orElse 
		Pessoa pessoa = new Pessoa("Guilherme", null);
		System.out.println(pessoa.getEmail().map(String::toLowerCase).orElse("Email não informado"));
		
		
		
	}
}


class Pessoa {
	private final String name;
	private final String email;
	
	public Pessoa(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	//Volta um Optional
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}