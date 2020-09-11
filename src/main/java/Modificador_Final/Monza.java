package Modificador_Final;

public class Monza extends Carro {

	//Se a classe Carro tivesse o modificador Final eu nao poderia extendela
	
	
	/*
	  	public void imprime() {}
			Não posso sobrescrever o método imprime, pois ele é final
	*/
	
	//Mas ele pode receber uma sobrecarga
	public void imprime(String nome) {
		System.out.println(nome);
	}
}
