package Interfaces_Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//METODOS STATIC em INTERFACES
public class Java8InterfacesStatic {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 2, 5, 8, 9);
		Collections.shuffle(lista);
			//Quando deveriamos utilizar classes estaticas com construtor privado
		//para nao precisarmos instanciar
		
		System.out.println(lista);
	}
	
	//No java 8 eu tenho metodos estaticos dentro de interfaces, antes disso não
	interface Corredor {
		//os metodos sempre sao publicos 
		static double calcularVelocidade(double tempo, double distancia) {
			return distancia/tempo;
		}
		
		//Metodos sem implementação são abstratos
		void correr();
		
		}
	}

