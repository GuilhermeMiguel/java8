package Generics;

public class WildCardsTeste {

	public static void main(String[] args) {
		
		MetodosComWildCards<Integer> num1 = new MetodosComWildCards<>(22);
		
		MetodosComWildCards<Double> num2 = new MetodosComWildCards<>(35.5);
		
		MetodosComWildCards<Integer> num3 = new MetodosComWildCards<>(22);
		
		//String da erro, só aceita numero
		//MetodosComWildCards<String> num4 = new MetodosComWildCards<>("Teste");
		
		/*
		  		Se no metodo valorAbsoluto(MetodosComWildCards<?> num) eu recebesse T no lugar de ?
		  	daria erro, pois em memoria a classe estaria com um valor Integer e esperaria receber um Integer.
		  	
		  	Colocando o caracter coringa, da certo, não importa o tipo passado, desde que seja um numero.
		  	
		*/
		
		System.out.println("Os valores absolutos são iguais (para Integer e Double)? " + num1.valorAbsoluto(num2));

		
		System.out.println("Os valores absolutos são iguais (para Integer e Integer)? " + num1.valorAbsoluto(num3));
		
		
	}

}


//Com esse extends se garante o recebimento de apenas numeros 
class MetodosComWildCards<T extends Number> {
	
	T obj;
	
	public MetodosComWildCards(T obj) {
		this.obj = obj;
	}

	
	//Com o caracter coringa, não me importa qual é o tipo do objeto
	boolean valorAbsoluto(MetodosComWildCards<?> num) {
		
		//Comparando o valor absoluto dos dois numeros
		if(Math.abs(obj.doubleValue()) == Math.abs(num.obj.doubleValue()))
			return true; //Retornando true e false sem utilizar chaves
		return false;
	}
	
}
