package Conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDoConjunto {

	public static void main(String[] args) {
		//CONJUNTOS SAO ESTRUTURAS DE DADOS QUE NAO ACEITAM ELEMENTOS REPETIDOS
		
//		LinkedList<String> conjunto = new LinkedList<String>();
//
//		conjunto.add("Mauricio");
//		
//		//O contem consome muito tempo, pois ele precisa percorrer a lista inteira
//		if(!conjunto.contains("Mauricio")) {
//			conjunto.add("Mauricio");
//		}
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		
		conjunto.adiciona("Marcelo");
		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);
		
		
		conjunto.remove("Marcelo");
		System.out.println(conjunto);
		
		
		//O set É O CONJUNTO DO JAVA
		System.out.println("----------------------------------------------------------------");
		Set<String> conjuntoDoJava = new HashSet<String>();
		conjuntoDoJava.add("Mauricio");
		conjuntoDoJava.add("Paulo");
		conjuntoDoJava.add("Paulo"); // Ele não adiciona esse item
		
		System.out.println(conjuntoDoJava);
		
		String x = "Guilherme";
		System.out.println(x.hashCode());
		
		//O set do Java utiliza o hascode para fazer o espalhamento dos elementos, para ficar mais facil saber se ele esta la ou nao
		//É um tipo de classificação, como se os valores dos elementos estivessem separados por determinadas caracteristicas
	}

}
