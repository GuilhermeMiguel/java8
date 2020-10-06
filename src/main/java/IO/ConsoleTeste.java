package IO;

import java.io.Console;

public class ConsoleTeste {

	public static void main(String[] args) {
		
		/*
		  		Essa classe console faz leitura atraves de terminal - cmd   -- exevutando no eclipse nao da certo
		  	Posso executá-la através de JavaC
		  	
		  	
		  	Aula de apoio ------>        https://www.youtube.com/watch?v=URfifIDhQ_k&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=103
		
			Para executar javac eu faço:
			
			1-) Vou ate a pasta em que o arquivo .java se encontra -- pode ate ser um arquivo no notepad
			2-) abro o terminal naquela pasta 
			3-) Digito javac NomeArquivo.java
			4-) Depois digito java NomeArquivo (sem o .java)
			
		*/
		
		//Se volta null é porque executa somente no terminal 
		System.out.println("Executa somente no console? "+ System.console());
		
		Console c = System.console();
		
		char[] pw = c.readPassword("%s", "pw: "); //Lendo a senha -- para senha devo utilizar esse metodo
		
		for (char pass : pw) {
			c.format("%c ", pass);
		}
		
		c.format("\n");
		
		String texto;
		
		while (true) {
			texto = c.readLine("%s", "Digite: "); 
			
			c.format("esse texto %s foi digitado", texto); //no metodo format do java eu simplesmente substituo a %s por uma string ou algum outro tipo de variavel
		}
	}
	
}
