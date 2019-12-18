package EstudoJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		
		//List
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		//forEach
		lista.forEach(n -> System.out.println(n));
		
		//RemoveIf
		System.out.println("\n---RemovIf - Retira elementos dada a condição---");
		lista.removeIf(n -> n % 2 == 0); //Remove os pares
		lista.forEach(n -> System.out.println(n));
		
		//ReplaceAll
		System.out.println("\n---ReplaceAll - Substitui elementos dada a condição---");
		lista.replaceAll(n -> n * 2);
		lista.forEach(n -> System.out.println(n));
		
		
		HashMap<Integer, String> map = new HashMap<>(); 
		map.put(0, "Se");
		map.put(1, "inscreva");
		map.put(2, "no");
		map.put(3, "canal");
		
		//Recebe um BiConsumer, a chave e o valor
		System.out.println("\n---BiConsumer - Trabalha com chave e valor---");
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
		
		//compute -- operacao realizada em algum momento no map
		System.out.println("\n---compute - se a chave não existir ele retorna null agora---");
		map.compute(1, (k, v) -> v + " agora"); //valor pegar a chave de valor 1 e adicionar o " agora" ao seu valor
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
		//se a chave não existir ele retorna null agora
		
		
		//merge
		System.out.println("\n---merge - se a chave não existir ele cria uma nova chave com o valor definido---");
		map.merge(1, "!", (v1, v2) -> v1 + v2);
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
		//se a chave não existir ele cria uma nova chave com o !
		
		
		//replaceAll
		map.replaceAll((k, v) -> v + "!");
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
	}
}
