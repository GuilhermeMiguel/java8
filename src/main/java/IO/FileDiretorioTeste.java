package IO;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {

	public static void main(String[] args) throws IOException {

		/*
		 	Como nao estou fazendo try/catch, eu lanço exception no proprio metodo, mas é má pratica pois não estou tratando a exception
		 	
		*/
			
	      File diretorio = new File("folder"); 
	      
	      boolean mkdir = diretorio.mkdir(); //Criando uma pasta com o metodo mkdir -- parecido com o linux 
	      
	      //Retorna se o diretorio foi criado
	      System.out.println("Diretorio Criado: " + mkdir); 
	      
	      //Criando um arquivo dentro do diretorio que acabei de criar, posso passar seu path ou a instancia do objeto
	      File arquivo = new File(diretorio, "arquivo.txt");	      	      
	      boolean newFile = arquivo.createNewFile();	      
	      System.out.println("Arquivo criado: " + newFile);
	      
	      
	      //Renomeando arquivo
	      File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
	      boolean renamed = arquivo.renameTo(arquivoNovoNome);
	      System.out.println("Arquivo Renomeado? " + renamed);
	      
	      //Renomeando diretorio
	      File diretorioRenomeado = new File("folder2");
	      boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
	      System.out.println("Diretorio Renomeado? " + diretorioRenamed);
		
	      
	      
	      buscarArquivos();
	}
	
		public static void buscarArquivos() {
	       
			System.out.println("\n===========================================================\nArquivo na pasta:\n");
			//Busca arquivos de uma pasta no path absoluto			
			File file = new File("C:\\");
	        
			String[] list = file.list();
	        
			for (String arquivo : list) {
	            System.out.println(arquivo);
	        }
	    }

}
