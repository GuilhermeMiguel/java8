package Interfaces;

public class Implementando2Interfaces implements IConsultar1, IConsultar2 {

	/*
	  	Ambas as interfaces tem o mesmo metodo 
	*/
	@Override
	public String consultar(String nomeInterface) {
		return "Valor retornado pela interface " + nomeInterface ;
	}

	@Override
	public Double calcularMedia(Double... valores) {
		Double somaValores = 0.0;

		Double media = 0.0;
		for(Double valor : valores) 
			somaValores += valor;
		
		media = somaValores / valores.length;
		
		return media;
	}

	@Override
	public int calcularSoma(int... valores) {
		int somaValores = 0;
		
		for(int valor : valores)
			somaValores += valor;
		
		return somaValores;
	}

	

}