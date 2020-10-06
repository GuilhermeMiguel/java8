package Resource_Bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {

	public static void main(String[] args) {
		
		/*
				Para o metodo deve-se passar a base do bundle, o que vem antes do primeiro underline/underscore
			e um locale, caso não seka nada de idioma so passo a string base
		*/
		
		
//		System.out.println(Locale.getDefault()); -- Encontrar o local em que o sistema se encontra
		
		
//		Caso o Resource Bundle não encontre nada, ele gera erro em tempo de execução 
		
		
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));

		
		
		rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		
		/*
		 		Posso pegar mensagem comuns sem especificar locale
		 	Porém se no arquivo pr_BR eu tiver uma mensagem : message.comum
		 	Ela que vai ser exibida no lugar da que não especifica pais
		 	
		 	É COMO SE FOSSE UMA HERANÇA, POS TEM O ARQUIVO GERAL E OS ESPECIFICOS
		 	
		 */
		
		System.out.println("Mensagem comum para todos os arquivos: " + rb.getString("message.commom"));
		
		
		
		/*
		  	Caminho que o java procura 
		  	
		  	//Locale locale = new Locale("fr", "CA"); Frances do Canada
		  	//ResourceBunde.getBundle("messages", locale);
		  	 
		  	  Caminho:
		  	  1-) O que eu passei:
		  	  	messages_fr_CA.properties
		  	  
		  	  2-) Caso nao encontre vai so para a lingua 
		  	  	messages_fr.properties
		  	  	
		  	 3-) Caso nao encontre vai para o locale do sistema
		  	 	messages_en_US.properties
		  	 	
		  	 4-) Caso nao encontre vai para a lingua do sistema
		  	 	messages_fr_CA.properties
		  	 	
		  	 5-) Caso nao encontre vai para o arquivo base
		  	 	messages.properties
		  	 
		  	 6-) Caso nao encontre é lancada uma exceção 
		  	 
		*/

	}

}
