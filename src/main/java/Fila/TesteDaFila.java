package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

	public static void main(String[] args) {
		Fila fila = new Fila();

		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");
		
		System.out.println(fila);
		
		String x1 = fila.remove();
		System.out.println(x1);
		
		String verificaVazio = fila.vazio() == true ? "A lista esta vazia" : "A lista contem registros";
		
		System.out.println(verificaVazio);
		
		
		//IMPLEMENTAÇÃO DO JAVA DA FILA
		
		//Queue é uma interface
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Mauricio");
		String saiu = filaDoJava.poll();
		
		System.out.println(saiu);
		
		System.out.println("Pega esse elemento" + filaDoJava.peek()); //Pega o elemento mas nao tira da fila
	}

}
