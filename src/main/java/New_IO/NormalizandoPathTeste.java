package New_IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizandoPathTeste {

	public static void main(String[] args) {
		 String diretorioProjeto = "JavaOnline\\home\\william\\dev";
	        String arquivoTxt = "..\\..\\arquivo.txt";
	        Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
	        System.out.println(p1);
	        
	        //Dando cd ..  no terminal ele volta uma pasta -- o normalize faz esse controle, analisa a minha string e monta o caminho final
	        System.out.println(p1.normalize());
	        
	        // o ponto (.) indica que esta na mesma pasta
	        Path p2 = Paths.get("a/./b/./c");
	        
	        System.out.println(p2);
	        System.out.println(p2.normalize());

	}

}
