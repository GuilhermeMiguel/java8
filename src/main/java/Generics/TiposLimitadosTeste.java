package Generics;

public class TiposLimitadosTeste {

	public static void main(String[] args) {

		//Se eu passar algo diferente de um numero da erro de compilação
			// MetodosComNumeros<String> num = new MetodosComNumeros<>(10);
		
		MetodosComNumeros<Integer> num = new MetodosComNumeros<>(10);
		
		System.out.println("Número ao quadrado: " + num.aoQuadrado());
	}

}


//Com esse extends se garante o recebimento de apenas numeros 
class MetodosComNumeros<T extends Number> {
	
	T obj;
	
	public MetodosComNumeros(T obj) {
		this.obj = obj;
	}
	
	
	double aoQuadrado() {
		/*
		  		Se a classe não informar de quais classes ela é filha esse metodo da errado, 
		  	
		  	pois ele não tem certeza de que aquilo que ele esta recebendo são realmente numeros, podem ser strings, por exemplo.
		  	 
		*/
		
		return obj.intValue() * obj.doubleValue();
	}
}
