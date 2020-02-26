package Pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	//PILHA O PRIMEIRO A ENTRAR É O ÚLTIMO A SAIR 
	//O ÚLTIMO QUE ENTROU É SEMPRE O PRÓXIMO A SAIR 
	
	private List<String> nomes  = new LinkedList<String>();
	
	public void push(String nome) {
		nomes.add(nome);
	}
	
	//Remove o ultimo que havia sido inserido 
	public String pop() {
		return nomes.remove(nomes.size() - 1); //Size - 1 da o ultimo indice da lista
	}
	
	public boolean vazio() {
		return nomes.isEmpty(); // ou nomes.size() == 0
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
}
