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
		lista.removeIf(n -> n % 2 == 0); //Remove os pares
		lista.forEach(n -> System.out.println(n));
		
		//ReplaceAll
		lista.replaceAll(n -> n * 2);
		lista.forEach(n -> System.out.println(n));
		
		
		HashMap<Integer, String> map = new HashMap<>(); 
		map.put(0, "Se");
		map.put(1, "inscreva");
		map.put(2, "no");
		map.put(3, "canal");
		
		//Recebe um BiConsumer, a chave e o valor
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
		
		//compute -- operacao realizada em algum momento no map
		map.compute(1, (k, v) -> v + " agora"); //valor pegar a chave de valor 1 e adicionar o " agora" ao seu valor
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
		//se a chave não existir ele retorna null agora
		
		//merge
		map.merge(1, "!", (v1, v2) -> v1 + v2);
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
		//se a chave não existir ele cria uma nova chave com o !
		
		
		//replaceAll
		map.replaceAll((k, v) -> v + "!");
		map.forEach((k, v) -> System.out.println(k + " " + v)); 
	}
}
