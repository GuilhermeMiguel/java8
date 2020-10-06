package New_IO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste {

	public static void main(String[] args) {
		
		Path dir = Paths.get("pasta/subpasta/subsubpasta");
		
		System.out.println("Arquivos dentro de subsubpasta: ");
		
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
        	Integer i = 0;
            for(Path path : stream){
                System.out.println( (i + 1) + " - " + path.getFileName());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
