package New_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoArquivosTeste {

	public static void main(String[] args) {
		
		
		Path dirZip = Paths.get("pasta/subpasta");

		/*
		  		Esse é o path em que será salvo o arquivo.zip --- path relativo. Isso significa que
		 	dentro da pasta do meu projeto existe o diretório pasta/subpasta ex:
		 					
		 					C:\MeuProjetoJava\pasta\subpasta 
		 							
		 							Resultara em:
		  					
		  					C:\MeuProjetoJava\pasta\subpasta\arquivo.zip
		*/
		
		
		Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");

		/*
		 		Serão zipados todos os arquivos que estiverem no diretório:
		 		
		 		 	C:\MeuProjetoJava\pasta\subpasta\subsubpasta
		*/
		
		

		Path zipFile = dirZip.resolve("arquivo.zip");
		
		/*
		 			O resolve vai juntar o primeiro path "pasta/subpasta" com o "arquivo.zip" e
		 		
		 		utilizaremos a variável de referência zipFile para criar o arquivo.zip dentro
		 		
		 		do diretório pasta/subpasta.   Path dirZip = Paths.get("pasta/subpasta");
		*/
		
		
		
		
		try (
				ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));

				// Ao ser executado esse try with-resources o arquivo sera criado imediatamente 
				

				DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles))
			
				/* 
				 		Comos vamos zipar todos os arquivos do diretório dirFiles apenas iteramos
				 		
				 	sobre eles usando DirectoryStream -- Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
				*/
				
		
		{
			
			for (Path path : stream) {
				
				zip.putNextEntry(new ZipEntry(path.getFileName().toString()));

				/* 
				  		Adicionamos ao arquivo.zip uma entrada ZipEntry, que será o arquivo que será
				 	copiado para dentro do zip
				*/
				
				// Copiando os dados do arquivo para o arquivo dentro do zip:
				
				BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));
				byte[] buff = new byte[2048];
				int bytesRead;
				while ((bytesRead = bf.read(buff)) > 0) {
					zip.write(buff, 0, bytesRead);
				}
				zip.flush();
				zip.closeEntry();
				bf.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
