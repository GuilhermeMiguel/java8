package New_IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTeste {

	public static void main(String[] args) {
		try {

			//UTILIZADO NO LINUX -- POR ISSO GERA EXCEPTION 
			
			Path path = Paths.get("src\\main\\java\\Heranca\\Pessoa.java");
		
			PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
			
			System.out.println("Permissões : " + posix.permissions());
			
			System.out.println("Alterando as permissoes");
			
			//Alterando as permissões
			
			/*
				É um padrão de permissões dos arquivos
			 		
			 		Primeiro para o Grupo (rw-    Leitura e escrita)
			 		Depois para o Proprietario (rw-    Leitura e escrita)
			 		Por fim, para Outros (rw-    Leitura e escrita) 
			 		
			 		rw-rw-rw-
			*/
			
			Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
			
			Files.setPosixFilePermissions(path, permissions);
			
			posix = Files.readAttributes(path, PosixFileAttributes.class);
			
			
			System.out.println("Novas permissões : " + posix.permissions());
			
		} catch (Exception ex) {
			System.out.println("Caiu no catch -- precisa estar no linux");
		}
	}

}
