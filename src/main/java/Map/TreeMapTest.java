package Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		//Para utilizar o TreeMap a classe que representa a chave deve implementar a interface Comparable
		
		NavigableMap<String, String> map = new TreeMap<>();
		
		map.put("A", "Letra A");
		map.put("D", "Letra D");
		map.put("B", "Letra B");
		map.put("C", "Letra C");
		
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Se a classe key nao implementa Comparable, lanca essa exceção - java.lang.ClassCastException
		
		//No codigo abaixo acontece isso 
		
//		NavigableMap<Consumidor, String> map2 = new TreeMap<>();
//		Consumidor consumidor = new Consumidor("Guilherme" , "123");
//		Consumidor consumidor2 = new Consumidor("DevDojo" , "321");
//		
//		map2.put(consumidor2, "a");
//		map2.put(consumidor2, "b");
//		
//		for (Map.Entry<Consumidor, String> entry : map2.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		
		//headMap traz os valores que possuem a chave menor que a passada para o metodo 
		System.out.println(map.headMap("C"));

		//Colocando o parametro true ele acrescenta o valor referente aquela chave també,
		System.out.println(map.headMap("C", true));
		
		
	}

}
