package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsTeste {

	/*
	 * Um stream é um fluxo constante de dados -- Por exemplo, quando se da um play
	 * numa musica ou video você vai executando conforme vai recebendo
	 */
	public static void main(String[] args) {
		gravadorComum();
		gravadorMaisPerformatico();
		leitorComum();
		leitorMaisPerformatico();
	}

	private static void gravadorComum() {
		byte[] dados = { 65, 66, 67, 68, 69, 70 };
		try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) {
			gravador.write(dados);
			
			gravador.flush();
			/* O flush deveria ser especifico para classes buffer, olhar como ele funciona numa classe Stream comum */
			
			System.out.println("Dados gravados com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void gravadorMaisPerformatico() {
		
		//Utiliza buffer
		
		byte[] dados = { 65, 66, 67, 68, 69, 70 };
		
		//try with resources
		try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"),
				4098)) //Estou passando o tamanho do buffer, por padrão ele tem 8196 (no metodo foi passado metade)
		{
			gravadorBuffer.write(dados);
			
			gravadorBuffer.flush();
			
			/* O flush cospe os dados, caso seja cancelado, ele garante que os bytes que estavam no tunel de conexão sejam cuspidos */
			
			System.out.println("Dados gravados com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void leitorComum() {
		try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
			int leitura;
			
			/* 		Atribui-se a uma variavel, pois se eu utiliza-se o metodo duas vezes,
			 	na condição e na propria leitura, eu esteria pulando valores,
			 		por exemplo:
			 		1 2 3 4 5 6
			 			Na condicional leitor.read() ele chamaria 1 na atribuição ele ja chamaria o 2
			 */
			while ((leitura = leitor.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println(" " + b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void leitorMaisPerformatico() {
		
		//try with resources
		try (BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("pasta/stream.txt"),
				4098)) {
			int leitura;
			while ((leitura = leitorBuffer.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println(" " + b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
