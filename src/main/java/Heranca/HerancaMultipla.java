package Heranca;

import Interfaces.IConsultar1;

public class HerancaMultipla extends Consultar1 implements IConsultar1{

	
	/*
		Quando é realizada a heranca, tudo que for herdado nem aparece aqui, posso fazer com que essa classe nem implemente nada e passe em frente
		
		Lembrando que Herança Multipla não é permitida
	*/
	
	@Override
	public String consultar(String nomeInterface) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calcularSoma(int... valores) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
