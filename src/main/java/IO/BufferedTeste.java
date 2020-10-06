package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTeste {

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");

		/*
		  		BufferedWriter e BufferedReader são melhores formas (classes) para se escrever e ler um arquivo
		*/
		
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        		BufferedReader br = new BufferedReader(new FileReader(file))) {
        
        	bw.write("Escrevendo uma mensagem no arquivo");
            
        	bw.newLine(); //As vezes \n pode não funcionar em todos os sistemas operacionais, por isso o metodo newLine() -- ele pula uma linha
            
        	bw.write("E pulando uma linha");
            
        	bw.flush(); // Joga tudo dentro do arquivo 
            
        	String s;
            
            while ((s = br.readLine()) != null) { //Enquanto ele le uma linha, continua printando -- le uma linha por vez, não caracter por caracter
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        //Exemplo sem o try with resources:
        
//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Escrevendo uma mensagem no arquivo");
//            bw.newLine();
//            bw.write("E pulando uma linha 3");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//            br.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
	}

}
