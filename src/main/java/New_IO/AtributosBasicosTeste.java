package New_IO;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTeste {

	public static void main(String[] args) {

		try {
		
		//	--------------------------------------------------------------------
			//Setando ultima data de modificação
			Date primeiroDeDezemebro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
			
			File file = new File("pasta\\arquivo.txt");
			
			file.createNewFile();
			
			file.setLastModified(primeiroDeDezemebro.getTime());
			
			System.out.println("Ultima modificação: " + file.lastModified());

			file.delete();
			
			
			
		//	--------------------------------------------------------------------
			//Setando ultima data de modificação com classes Path e Files
			Path path = Paths.get("pasta\\arquivo_path.txt");
			
			Files.createFile(path);
			
			FileTime fileTime = FileTime.fromMillis(primeiroDeDezemebro.getTime());
			
			Files.setLastModifiedTime(path, fileTime);
			
			System.out.println("Ultima modificação: " + Files.getLastModifiedTime(path));
			
			Files.deleteIfExists(path);

		
		//	--------------------------------------------------------------------
			//Verificando atributos do arquivo
			path = Paths.get("src\\main\\java\\Heranca\\Pessoa.java");
			System.out.println("Pode ser lido? " + Files.isReadable(path));
			System.out.println("Pode ser escrito? " + Files.isWritable(path));
			System.out.println("Pode ser executado? " + Files.isExecutable(path));
		
			System.out.println("-------------------------------------------------");
			
			
			// BasicFileAttributes, PosixFileAttributes, DosFileAttributes
			BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
			
			System.out.println("\nArquivo " + path.getFileName() + " atributos :");
			
			System.out.println("Criação: " + atributosBasicos.creationTime());
			
			System.out.println("Ultimo Acesso: " + atributosBasicos.lastAccessTime());
			
			System.out.println("Ultima Modificação: " + atributosBasicos.lastModifiedTime());
			
			System.out.println("É uma pasta ? " + atributosBasicos.isDirectory());
			
			System.out.println("É um link (simbolico?) ? " + atributosBasicos.isSymbolicLink());
			
			System.out.println("É um arquivo normal ? " + atributosBasicos.isRegularFile());
			
			System.out.println("-------------------------------");


			// BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView,
			
			// FileOwnerAttributeView, AclFileAttributeView
			
			FileTime lastModified = atributosBasicos.lastModifiedTime();
			
			FileTime created = atributosBasicos.creationTime();
			
			FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
			
			BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
			
			//setando todos os times, criação, ultimo acesso e ultima modificação
			basicView.setTimes(lastModified, lastAcess, created);
			
			atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
			
			System.out.println("Criação: " + atributosBasicos.creationTime());
			
			System.out.println("Ultimo Acesso: " + atributosBasicos.lastAccessTime());
			
			System.out.println("Ultima Modificação: " + atributosBasicos.lastModifiedTime());
		}
		catch(Exception ex) {
			
		}
	}

}
