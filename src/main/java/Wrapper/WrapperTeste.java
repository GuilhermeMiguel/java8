package Wrapper;

public class WrapperTeste {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 	TIPOS PRIMITIVOS SÃO :
		*/
		
		// Numéricos
		
			byte bytePrimitivo = 1;
			short shortPrimitivo = 1;
			int intPrimitivo = 10;
			long longPrimitivo = 10;
			float floatPrimitivo = 10;
			double doublePrimitivo = 10;
			
		// Textuais
			
			char charPrimitivo = 'A';
		
		//Verdadeiro ou falso
			
			boolean booleanPrimitivo = true;
			
			
			/*
			 	Wrappers são classes que encapsulam um tipo primitivo, dando mais funcionalidades a eles -- são classes utilitarias que facilitam muito o desenvolvimento
			 	
			 	Herança e polimorfismo funcionam aqui
			*/
			
			
			
			Byte byteWrapper = 1;
			Short shortWrapper = 1;
			Integer intWrapper = 10;
			Long longWrapper = 10L;
			Float floatWrapper= 10F;
			Double doubleWrapper = 10D;
			
		// Textuais
			
			Character charWrapper = 'A';
		
		//Verdadeiro ou falso
			
			Boolean booleanWrapper = true;
			
			
		//	AutoBoxing   -- > Pegar um tipo primitivo e colocar num Wrapper 
			Long autoBoxing = 10L;
			
			
		// unboxing -- > Pegar um Wrapper e colocar dentro de um tipo primitivo
			int unboxing = intWrapper;
			
			
			
		@SuppressWarnings("deprecation")
		Integer inteiro = new Integer("10"); //Eu posso instanciar a classe e até mesmo passar uma string
		
		System.out.println(inteiro);
	}
}
