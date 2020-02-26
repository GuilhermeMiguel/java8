package EstudoJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Classe {

	public static void main(String[] args) {

		List<Integer> teste = new ArrayList<>(Arrays.asList(2016, 2010, 2011, 2012, 2013, 2010, 2011));
		
		teste.stream().filter(n-> n % 2 != 0).filter(n-> n /2 < 1500).forEach(System.out::println);
		
		System.out.println(teste.contains(2010));
		System.out.println(teste.isEmpty());
		System.out.println(teste.size());
		System.out.println(teste.lastIndexOf(2012));
		
		teste.stream().distinct().forEach(System.out::println);
		System.out.println("(------)-----------(========)");
		teste.stream().sorted().forEach(System.out::println);
		
		
		System.out.println(teste.stream().count());
		
		
		Set<Integer> loja = new HashSet<>(teste);
		
		System.out.println("teste com set  -- ele retira as repetições");
		
		loja.stream().forEach(System.out::println);
		
		
		System.out.println(loja.contains(2015));
		
		System.out.println(loja);
	}

}
