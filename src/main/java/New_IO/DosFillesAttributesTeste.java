package New_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFillesAttributesTeste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path path = Paths.get("pasta\\teste.txt");
		
		try {

			//Files.createFile(path);
			
			//Setando hidden -- escondido
			Files.setAttribute(path, "dos:hidden", true);
			
			//Setando somente leitura
			Files.setAttribute(path, "dos:readonly", true);
			
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println("Está hidden ? Escondido ? " + dos.isHidden());
			
			System.out.println("É somente leitura ? " + dos.isReadOnly());
			
			//Com DosFile
			DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
			
			//setando como false
//			dosView.setHidden(false);
//			
//			dosView.setReadOnly(false);
			
			dos = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println("Está hidden ? Escondido ? " + dos.isHidden());
			
			System.out.println("É somente leitura ? " + dos.isReadOnly());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
