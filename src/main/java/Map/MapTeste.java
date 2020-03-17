package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
	public static void main(String[] args) {
		//Quando tem map no nome não se garante a ordem em que estão os elementos
		
		System.out.println("\nHashMap - não mantém a ordem de inserção:");
		Map<String, String> map = new HashMap<>();
//		var teste = new HashMap<String, String>();
		
		//Nao se pode ter chaves duplicadas
		
		map.put("teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "você");
		map.put("vc", "você2");
		map.put("Meza", "Mesa");
		
		//No map um elemento duplicado (chave duplicada) vai ser substituido -- na verdade ele pega o ultimo inserido
//		for (String key : map.values()) {
//			System.out.println(key);
//		}
//		
		
		for (Map.Entry<String, String> percorreMap : map.entrySet()) {
				System.out.println(percorreMap.getKey() + " " +percorreMap.getValue());
		}
		

		System.out.println("\nLinkedHashMap - mantém a ordem de inserção:");
		//Para manter a ordem de inserção no map, pode-se utilizar o LinkedHashMap<>()
		Map<String, String> linkedMap = new LinkedHashMap<>();
		
		linkedMap.put("teklado", "teclado");
		linkedMap.put("mouze", "mouse");
		linkedMap.put("vc", "você");
		linkedMap.put("vc", "você2");
		linkedMap.put("Meza", "Mesa");
		
		for (Map.Entry<String, String> percorreMap : linkedMap.entrySet()) {
			System.out.println(percorreMap.getKey() + " " +percorreMap.getValue());
		}
	}
}
