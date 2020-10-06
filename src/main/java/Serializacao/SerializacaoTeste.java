package Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoTeste {

	public static void main(String[] args) {
		gravadorObjeto();
		leitorObjeto();
	}

	/*
	 	Gravando objeto serializado
	*/
	
	private static void gravadorObjeto() {
		
		Aluno aluno = new Aluno(1L, "Guilherme Miguel", "123456");
		
		aluno.setMatricula(new Matricula("Engenharia Terceiro Ano"));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
	
		/*
		 	 Como a classe foi serializada, o arquivo vai ser escrito de forma serializada
		 */
			oos.writeObject(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void leitorObjeto() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
			
			/*
			  	Fazendo cast do arquivo serializado para Aluno (o metodo readObject retorna um objct)
			*/
			
			Aluno aluno = (Aluno) ois.readObject();
			System.out.println(aluno);
		} 
		
		/*
		 	
		 	Posso capturar duas exceptions de uma vez
		 	
		*/
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
