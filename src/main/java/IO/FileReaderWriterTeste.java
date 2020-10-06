package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTeste {

	public static void main(String[] args) {

		  File file = new File("Arquivo.txt");
	      
		  /*
		    		NO JAVA EU TAMBÉM POSSO UM ESPECIE DE USING IGUAL AO DO .NET
		    	
		    	É o Try with resources
		    	Eu faço a instancia dos objetos que precise e não preciso me preocupar com o close (igual no exemplo comentado logo abaixo)
		    	Funciona para classes que implementam a interface Closeable
		  */
		  
		  try (FileWriter fw = new FileWriter(file);
	             FileReader fr = new FileReader(file)) {
	      
			  	fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha");
	            fw.flush(); //Para jogar tudo dentro do arquivo

	            char[] in = new char[500]; //Criando um array de char para ler o arquivo
	            
	            int size = fr.read(in);
	            
	            System.out.println("Tamanho do arquivo: " + size + "\n----------------------------------------------\nConteúdo:");
	            
	            for (char c : in) {
	            	
	            	/*
	            	 		Percorrendo o array de char e printando o texto
	            	 	 
	            	 	 Não é algo muito performatico
	            	 */
	            	
	            	System.out.print(c); 
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		  
		  
		  
		//Exemplo sem o try with resources:
		  
//	        try {
//	            FileWriter fw = new FileWriter(file);
//	            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 3");
//	            fw.flush();
//	            fw.close();
	//
//	            FileReader fr = new FileReader(file);
//	            char[] in = new char[500];
//	            int size = fr.read(in);
//	            System.out.println("tamanho "+size);
//	            for(char c: in){
//	                System.out.print(c);
//	            }
//	            fr.close();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
	}

}
