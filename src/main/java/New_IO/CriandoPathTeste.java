package New_IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTeste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		//So analisa o path
        Path p1 = Paths.get("C:\\Users\\global.guilherme\\Documents\\Guilherme\\GIT\\Java\\java8\\src\\main\\resources\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\global.guilherme\\Documents\\Guilherme\\GIT\\Java\\java8\\src\\main\\resources", "Arquivo.txt");
        Path p3 = Paths.get("C:", "\\Users\\global.guilherme\\Documents\\Guilherme\\GIT\\Java\\java8\\src\\main\\resources", "Arquivo.txt");
        Path p4 = Paths.get("C:", "Users", "global.guilherme", "Documents", "Guilherme", "GIT", "Java", "java8", "src", "main", "resources", "Arquivo.txt");
       
        
        System.out.println(p1.isAbsolute());
        System.out.println(p2.getClass());
        System.out.println(p3.getParent().getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.toAbsolutePath());
        
        
               
        //Conversao path to file, file to path        
        File file = p4.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta\\");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        try {
            if (Files.notExists(path1)) //se nao existe aquele diretorio cria um 
                Files.createDirectory(path1);
            if (Files.notExists(path2.getParent())) //se nao existe o diretorio pai daquele voce cria o diretorio pai
                Files.createDirectories(path2.getParent());
            	Files.createDirectories(path2); //cria o proprio diretorio
            if (Files.notExists(arquivo)) //se o arquivo o nao existe se cria o arquivo, mas os diretorios precisam estar criados
                Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get(arquivo.toString());
        Path target = Paths.get(path2.toString() + "\\arquivoCopiado.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
