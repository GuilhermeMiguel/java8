package Recursividade;

public class RecursividadeTeste {

	/*	 
	 		
	 		Em Java não há muita vantagem na utilização de recursividade, já que a linguagem não permite gerenciamento de memoria como em C, a recursividade é
	 	mais adequada para estrutura de dados lista encadeada, arvore, paginação de arvore…
	 	
	 	
	 	
	 		Recursão deve ser utilizado com cautela. Se o problema for resolvido com um laço simples, melhor utilizar o laço. 
	 		
	 		A RECURSÃO FAZ MUITO USO DA MEMORIA HEAP e, dependendo do tamanho do problema, a possibilidade de estourar a pilha de execução é imensa.

			Entretanto, para problemas intrisicamente recursivos, aí não tem como fugir. 
		Por exemplo, resolver o problema da torre de hanói sem recursão é beeem complicado. Ou mesmo resolver funções do tipo:

							T(n) = T(n-1) + 3T(n-2) + 1;
							
							
							
	 */
	public static void main(String[] args) {
		int resultadoFatorial = calculaFatorialRecursivamente(5);
		System.out.println("Resultado calculo fatorial Recursivamente: " + resultadoFatorial);
		
		int resultadoFatorialNaoRecursivo = calculaFatorialNaoRecursivo(0);
		System.out.println("Resultado calculo fatorial não Recursivo: " + resultadoFatorialNaoRecursivo);
		
		
		int resultadoSomaParesNaoRecursivo = calculoSomaParesNaoRecursivo(10);
		System.out.println("Resultado calculo soma pares não Recursivo: " + resultadoSomaParesNaoRecursivo);
		
		int resultadoSomaParesRecursivamente = calculoSomaParesRecursivamente(10);
		System.out.println("Resultado calculo soma pares Recursivamente: " + resultadoSomaParesRecursivamente);
	}

	
	//Fatorial(5) =  5 * fatorial(4)
	//Fatorial(4) =  4 * fatorial(3)
	//Fatorial(3) =  3 * fatorial(2)
	//Fatorial(2) =  2 * fatorial(1)
	//Fatorial(1) =  1 * fatorial(0)
	//Fatorial(0) = 1
	
	private static int calculaFatorialRecursivamente(int num) {
		
		if(num == 0) 
			return 1;
		
		return num * calculaFatorialRecursivamente(num-1);
	}
	
	
	private static int calculaFatorialNaoRecursivo(int num) {
		int fat = 1;
		for(int i = 1; i <= num; i++) {
			fat *= i;
		}
		
		return fat;
	}
	
	
	
	private static int calculoSomaParesNaoRecursivo(int num) {
		int soma = 0;

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0)
				soma += i;
		}

		return soma;
	}
	
	private static int calculoSomaParesRecursivamente(int num) {
	   
		if(num == 0)
	      return 0;

	    if(num % 2 == 0)
	      return num + calculoSomaParesRecursivamente(num - 1);

	    return calculoSomaParesRecursivamente(num - 1);
	 }
	
	
	
	/*
			Falando de problemas reais (não exercícios para o entendimento do funcionamento) recursividade e loops tem objetivos totalmente diferente
	
				* O loop (for, while, etc) tem por objetivo percorrer alguma estrutura de dados (lista, pilha fila, etc…).
	
				* Recursividade significa um metodo por exemplo chamar ele mesmo a fim de resolver algo.
	
			Em exemplos de exercícios para estudos, o método de ordenação QuickSort se utiliza de recursividade e não tem como ser implementado utilizando um loop qualquer.
	
					====================================================	
								RECURSIVIDADE NÃO É LOOP. 
					====================================================
		
			Digamos que se tem um loop e no meio do bloco do seu loop se queira executar todo este mesmo bloco novamente,
		
		e depois continuar do mesmo ponto onde se parou para executar o bloco completo:
	
	
			for(.......){
			  //começo do codigo
		
			  //vamos imaginar que aqui se deve executar tudo que esta dentro deste bloco
			  //e depois continuar deste ponto
		
			  //fim do codigo
			}
			
			Não tem outra forma de se fazer isso sem ser com recursividade.
		
		Isso não tem que ser um loop, mas sim um metodo que ira ser chamado n vezes dependendo da necessidade
	*/
}
