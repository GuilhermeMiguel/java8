package Interfaces;

public interface Tributavel {

	
	/*
	 			INTERFACES SÃO CONTRATOS QUE AS CLASSES DEVEM IMPLEMENTAR
	 	
	 	Elas dizem o que as classes devem fazer, mas não como devem fazer 
	 	
	 	Sao completamente abstratas, ou seja, seus metodos nao tem corpo
	 	
	 	Devem ser adjetivos -> devem dar uma caracteristica ao objeto 
	 	
	 	No exemplo a classe Produto (representando um objeto) é tributavel e transportavel
	 	
	 	Ou então ter a letra I no inicio 
	 	
	 */
	
	
	/*
	 	Interfaces podem ter atributos, mas todos sao constantes
	 	
	 	São sempre public static final
	*/
	
	/* public static final */ double VALOR_IMPOSTO = 0.12;
	
	
	/*
	 		Em uma interface todos os metodos sao publicos e abstratos 
	 		
	 	Devem terminar sempre com ponto e virgula(;)
	*/	
		
		/* public abstract */ void calculaImposto();
}
