package Interfaces;

public class Implementando2InterfacesTeste {

	public static void main(String[] args) {
		
		/*	
		  	Como os metodos nao possuem corpo, é indiferente qual a interface esta chamando
		*/
		
		IConsultar1 consultar1 = new Implementando2Interfaces();
		
		System.out.println(consultar1.consultar("IConsultar1"));
		
		
		IConsultar2 consultar2 = new Implementando2Interfaces();
		
		System.out.println(consultar2.consultar("IConsultar2"));
		
		
		
		System.out.println("Variavel do tipo Interface IConsultar1, Calculando soma: " + consultar1.calcularSoma(5, 4, 3, 2, 1));

		System.out.println("Variavel do tipo Interface IConsultar2, Calculando media : " + consultar2.calcularMedia(5.0, 4.0, 3.0, 2.0, 1.0));
		
		
		
		/*
		  	Com a instancia de um objeto do tipo da classe, eu posso chamar os metodos definidos em ambas as interfaces
		*/
		
		var implementando2Interfaces = new Implementando2Interfaces();
		
		System.out.println(implementando2Interfaces.consultar("implementando2Interfaces"));
		
		System.out.println("Variavel do tipo Interface implementando2Interfaces, Calculando soma: " + implementando2Interfaces.calcularSoma(5, 4, 3, 2, 1));

		System.out.println("Variavel do tipo Interface implementando2Interfaces, Calculando media : " + implementando2Interfaces.calcularMedia(5.0, 4.0, 3.0, 2.0, 1.0));
		
	}
}
