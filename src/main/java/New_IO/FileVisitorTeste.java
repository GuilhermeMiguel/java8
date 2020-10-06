package New_IO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class AcharTodosOsBkp extends SimpleFileVisitor<Path> {

	// Extend a classe para fazer um override no metodo visitFile

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if (file.getFileName().toString().endsWith(".bkp")) { // encontrando os arquivos bkp
			System.out.println(file.getFileName());
		}
		return FileVisitResult.CONTINUE; // Ele procura dentro do diretorio e depois vai retornando nas pastas
	}
}

public class FileVisitorTeste {

	public static void main(String[] args) {
		try {
			Files.walkFileTree(Paths.get("pasta"), new AcharTodosOsBkp()); //Posso informar só o diretorio inicial que ele vai percorrendo
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



/*
 	OUTROS METODOS DO SIMPLEFILEVISITOR
 	
 	 Aula de apoio --> https://www.youtube.com/watch?v=FDFPtMpe1qo&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=112
 */


class PrintDirs extends SimpleFileVisitor<Path> {
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre: " + dir);
//        if(dir.getFileName().toString().equals("subsubpasta")){
//            return FileVisitResult.SKIP_SIBLINGS;
//        }
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println("file " + file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		System.out.println("post: " + dir);
		return FileVisitResult.CONTINUE;
	}
}
