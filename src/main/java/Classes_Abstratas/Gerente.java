package Classes_Abstratas;

public class Gerente extends Funcionario{

	public Gerente() {
		
	}

	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);		
	}

	//Como esse método é abstract na classe Funcionario eu sou obrigado a implementa-lo
	@Override
	public void calculaSalario() {
		this.salario = 	salario + (salario * 0.2);	
	}

	//Metodo que vem de pessoa -- se ele estiver na classe funcionario não sou obrigado a implementa-lo aqui, caso contrario sim
	@Override
	public void imprime() {
		
	}

}
