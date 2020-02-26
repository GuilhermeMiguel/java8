package Fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	//FILA O PRIMEIRO A ENTRAR É O PRIMEIRO A SAIR 
	 private List<String> alunos = new LinkedList<String>();
	 
	 public void adiciona(String aluno) {
		 alunos.add(aluno);
	 }
	 
	 public String remove() {
		 return alunos.remove(0); //numa fila sempre se remove o primeiro elemento
	 }
	 
	 public boolean vazio() {
		 return alunos.isEmpty();
	 }
	 
	 @Override
	public String toString() {
		return alunos.toString();
	}
}
