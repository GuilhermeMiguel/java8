package IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {

	public static void main(String[] args) {

		
		/*
		 		Informação interessante
		 	Quando eu não uso try / catch, posso fazer o meu metodo lançar exception na sua assinatura, é um ou outro
		 	
		*/
		
		
		 File file = new File("Arquivo.txt");
	     
		 	try {
		 			//Aqui cria e informa se foi criado
		 			System.out.println("Criar novo arquivo ? " + file.createNewFile());
		 			
		 			boolean exists = file.exists();
		 			
		 			System.out.println("O arquivo existe? " + exists);
	            
		 			System.out.println("Permite leitura ? " + file.canRead());
	            
		 			System.out.println("path: " + file.getPath());
	            
		 			System.out.println("path absoluto: " + file.getAbsolutePath());
	            
		 			System.out.println("É diretorio? " + file.isDirectory());
	            
		 			System.out.println("É oculto/hidden? " + file.isHidden());
	            
		 			
		 			System.out.println("Ultima vez que foi modificado: " + new Date(file.lastModified()));
	            
		 			if(exists){
		 				//Aqui deleta e informa se foi deletado
	                	System.out.println("Deletado? " +file.delete());
	            	}
		 			
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
	}

}
