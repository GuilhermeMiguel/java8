package Pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		//PILHA O PRIMEIRO A ENTRAR É O ÚLTIMO A SAIR 
		//O ÚLTIMO QUE ENTROU É SEMPRE O PRÓXIMO A SAIR 
		
		
//		pilha.push("Mauricio");
//		
//		System.out.println(pilha);
//		
//		pilha.push("Guilherme");
//		
//		System.out.println(pilha);
//		
//		String r1 = pilha.pop();
//		System.out.println(r1);
//		
//		String verificaVazio = pilha.vazio() == true ? "A pilha esta vazia" : "A pilha contem elementos";
//		System.out.println(verificaVazio);
//		String r2 = pilha.pop();
//		System.out.println(r2);
//		
//		System.out.println(pilha);
//		verificaVazio = pilha.vazio() == true ? "A pilha esta vazia" : "A pilha contem elementos";
//		System.out.println(verificaVazio);
//		
//		
//		System.out.println("------------------------------------------------------------------------------");
//		System.out.println("IMPLEMENTAÇÃO DA PILHA PELO JAVA -- STACK");
//		
		
		//Stack é a implementação de pilha pelo Java
		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio");
		stack.push("Marcelo");
		stack.pop();
		
		stack.push("Guilherme");
		stack.push("Paulo");
		stack.pop();
		
		stack.push("João");
		System.out.println(stack);
		
//		System.out.println(stack.pop());
//		
		//Te fala qual é o elemento que esta no topo da pilha, mas não retira ele 
//		String peek = stack.peek();
//		System.out.println("Método peek: " + peek);
	}

}
