package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {

	public static void main(String[] args) {
		Consumidor consumidor = new Consumidor("Guilherme" , "123");
		Consumidor consumidor2 = new Consumidor("DevDojo" , "321");
		Consumidor consumidor3 = new Consumidor("DevDojo222" , "321"); //Aqui, o nome é diferente, mas o cpf é igual,
																		//enão o map considera essa e a anterior iguais
		Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0);
		Produtos produto2 = new Produtos("321", "Picanha", 26.4);
		Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0);
		Produtos produto4 = new Produtos("879", "Samsung Galaxy", 1350.0);
		
		Map<Consumidor, List<Produtos>> map = new HashMap<>();
		
		List<Produtos> produtosCon1 = new ArrayList<>();
		produtosCon1.add(produto1);
		produtosCon1.add(produto2);
		
		List<Produtos> produtosCon2 = new ArrayList<>();
		produtosCon2.add(produto3);
		produtosCon2.add(produto4);
		
		map.put(consumidor, produtosCon1);
		map.put(consumidor2, produtosCon2);
		
		map.put(consumidor3, produtosCon1);
		
		for(Map.Entry<Consumidor, List<Produtos>> entry : map.entrySet()) {
			System.out.println(entry.getKey().getNome());
			//Como o value é lista, precisamos de outro for para imprimir o valor dela
			for(Produtos produto : entry.getValue()) {
				System.out.println(produto.getDescricao());
			}
		}
	}

}
