package Collections;

import java.util.HashMap;
import java.util.Map;

public class UsoHashMap {

	public static void main(String[] args) {
	   Map<String, String> capitalCities = new HashMap<String,String>();

	   	//Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);

	    
	    //Para remover utilizando a chave
	    capitalCities.remove("England");
	    
	    
	    //Para limpar o map
	    capitalCities.clear();
	    
	    
	   capitalCities.put( "K1", new String( "V1" ));
	   capitalCities.put( "K2", new String( "V2" ));
	   capitalCities.put( "K3", new String( "V3" ));
	   capitalCities.put( "K4", new String( "V4" ));
	   capitalCities.put( "K5", new String( "V5" ));
        
       String keyToSearch = "K1";        
        
       //Contains Key     
       if ( capitalCities.containsKey( keyToSearch ) ) {
        System.out.println("Valor da Chave "+keyToSearch+
         " = "+capitalCities.get(keyToSearch));             
       }else{
              System.err.println("Chave não existe");
       }
	
	 /*
	  		* O método "keySet()" retorna um Set com todas as chaves do
	  	* nosso HashMap, e tendo o Set com todas as Chaves, 
	  	* podemos facilmente pegar os valores que desejamos
     */
       
       System.out.println("-------------------------------\n");
	    for (String key : capitalCities.keySet()) {
		        //Capturamos o valor a partir da chave
		        String value = capitalCities.get(key);
		        System.out.println(key + " = " + value);
	    }
	    
	    System.out.println("-------------------------------\n");
	    
	    System.out.println("Mapa: \n" + getMapa());
	    
	    HashMap<String, String> mapaEstados = getMapa(); 
	    for (String sigla : mapaEstados.keySet()) {  //keySet() -- retorna as chaves 
	    											//values() -- retorna os valores
	    											//entrySet() -- retorna as chaves e valores
	    	System.out.print(sigla + " ");
	    }
	    
	    System.out.println("-------------------------------\n");
	    //Exemplo de EntrySet
	    for (Map.Entry<String, String> entrada : mapaEstados.entrySet()) {
	        System.out.println(entrada); 
	   }
	   
	    System.out.println("-------------------------------\n");
	    //Retorna os valores separados com getKey() e getValue()
	    for (Map.Entry<String, String> entrada : mapaEstados.entrySet()) { 
	    	System.out.println(entrada.getKey()); 
	    	System.out.println(entrada.getValue());
	    }
	    
	    System.out.println("-------------------------------\n");
	    System.out.println("Estado encontrado passnado a chave: \n" + pegaEstadoPorExtenso("AC"));
	    
	    System.out.println("-------------------------------\n");
	    System.out.println("Com Java 8: \n");
	    System.out.println("As chaves:");
	    mapaEstados.keySet().stream().forEach(System.out::println); //Pegando as chaves
	    
	    System.out.println("\nOs valores:");
	    mapaEstados.values().stream().forEach(System.out::println);
	    
	    System.out.println("\nAs chaves e os valores:");
	    mapaEstados.forEach((sigla, estado) -> System.out.println(sigla + " " + estado)); //Pegando as chaves e os valores
	    
	}
		
	
	public static HashMap<String, String> getMapa() { 
		HashMap<String, String> map = new HashMap<>(); 
		map.put("AC", "Acre"); 
		map.put("AL", "Alagoas");
		map.put("AP", "Amapá"); 
		map.put("AM", "Amazonas");
		map.put("BA", "Bahia"); 
		map.put("CE", "Ceará"); 
		map.put("DF", "Distrito Federal"); 
		map.put("ES", "Espírito Santo"); 
		map.put("GO", "Goiás"); 
		//resto dos put() 
		
		//Retorna um objeto com a chave e o valor
		return map; 
	}
	
	public static String pegaEstadoPorExtenso(String sigla){ 
		HashMap<String, String> mapa = getMapa(); 
		return mapa.get(sigla);
	}
	
}
