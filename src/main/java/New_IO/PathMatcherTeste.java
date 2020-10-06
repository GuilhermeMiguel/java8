package New_IO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;



class FindAllTest extends SimpleFileVisitor<Path>{
    //Ele vai percorrer todos os diretorios procurando aquilo que eu passei
	
	
	
	//Faço um matcher -- Procurar tudo com .Java ou .Test
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Teste*}.{java,class}");
    
    //Depois faço a pesquisa com o metodo visitFile sobrescrito
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class PathMatcherTeste {

	public static void main(String[] args) {

		/*
		 * CLASSE UTILIZADA QUANDO SE PRECISA DE MAIS RECURSOS NO MOMENTO DE BUSCAR
		 * ARQUIVOS
		 * 
		 */

		try {
			Path path1 = Paths.get("pasta/subpasta/subsubpasta/file.bkp");
			Path path2 = Paths.get("file.bkp");
			Path path3 = Paths.get("guilherme");

			
			/*
			 * Esse glob: é um padrão --- sempre utilizado assim
			 * 
			 * 
			 * Esse * significa qualquer coisa, menos divisores de arquivos como barra / e
			 * contra barra \\
			 * 
			 * Lembrando que contra barra (\\) é so para o windows, o linux nao considera
			 * 
			 * O PathMacher verifica se existe, mas se eu não buscar pelo arquivo, ele so traz true ou false
			 * 
			 */

			PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp"); // Esta procurando um Path que
																							// termine com .bkp

			System.out.println(matcher.matches(path1));

			System.out.println(matcher.matches(path2));

			System.out.println("-------------------");
			
			verificaMatche(path1, "glob:*.bkp");
			
			
			//Dois asteriscos considera qualquer coisa seguida de .bkp
			verificaMatche(path1, "glob:**/*.bkp");
			
			
			verificaMatche(path1, "glob:*");
			verificaMatche(path1, "glob:**");
			
			System.out.println("-------------------\nVerificar se a extensao tem 3 caracteres");
			//Verificar se a extensao tem 3 caracteres
			verificaMatche(path1, "glob:*.???");
			verificaMatche(path1, "glob:**/*.???");
			verificaMatche(path1, "glob:**.???");
			
			System.out.println("-------------------\nProcurar por Guilherme ou por Miguel");
			//Procurar por Guilherme ou por miguel
			verificaMatche(path3, "glob:{guilherme*,miguel*}");
			verificaMatche(path3, "glob:{guilherme,miguel}*");
			verificaMatche(path3, "glob:{guilherme,miguel}");
			
			
			//Procurando arquivos **Teste .Java ou .Teste
			System.out.println("\n\n------------------------------------\nProcurando arquivos **Teste .Java ou .Teste");
			Files.walkFileTree(Paths.get("./"), new FindAllTest());

		} catch (IOException ex) {

		}
	}

	private static void verificaMatche(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(glob + ": " + matcher.matches(path));

	}

}
