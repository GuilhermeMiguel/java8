package Polimorfismo;

import java.util.LinkedList;
import java.util.List;

public class PolimorfismoInterfaceTeste {

	public static void main(String[] args) {

		
		/*	 			 	
		 
		 	LIST É UM CASO DE POLIMORFISMO
		 	
		 	List diz o que as classes devem fazer (add, addAll, contains), mas nao como devem fazer
		 	
		 	
		 	
		 	
		 	
		 	
		 	O Polimorfismo com interface pode ser exemplificado com lists:
		 	
		 	
		 		Seja LinkedList ou seja ArrayList ambos implementao a inreface, ou seja, quando eu declaro um atributo List
		 	
		 	não importa se estou dando um new em LinkedList ou ArrayList, teoricamente vai funcionar, mesmo que por baixo dos panos seja diferente
		 	
		 	|
		 	|
		 	`----->
		*/
		List<String> lista = new LinkedList<>();

		//List<String> lista = new ArrayList<>();  Poderia ser um ArrayList que continuaria funcionando
				
		lista.add("nome1");
		lista.add("nome2");
		lista.add("nome3");
		lista.add("nome4");
		
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		
	}
}
