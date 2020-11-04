package Generics;

import java.util.ArrayList;
import java.util.List;

public class PqGenericsTeste {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("String");
        lista.add("Integer");
        lista.add(20);
        lista.add(20.0);

        /*
        		Antigamente no java 4 utilizava-se listas sem determinação de tipos.
        	
        	Dessa maneira, é complicado trabalhar com uma collection que tem diversos tipos de dados.
        	
        	Pois, deve-se ficar realizando instace of, verificando diversas vezes os tipos e mesmo assim é ruim.
        	
        	
        		Para resolver esse erro, foi inventado o type erasure <>, passando o tipo entre chaves, foi feito dessa forma para 
        	manter a retrocompatibilidade, ou seja, para não fazer os códigos antigos pararem de funcionar.
        	
        */
        
        // Um exemplo classico de generics e type erasure
        List<String> listaString = new ArrayList<>();
        lista.add("Motocicleta");
        lista.add("Carro");
        lista.add("Smartphone");
	}

}
