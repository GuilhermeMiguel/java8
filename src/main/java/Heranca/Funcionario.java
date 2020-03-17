package Heranca;


public class Funcionario extends Pessoa{

	//A classe funcionario é mais especializada que a classe Pessoa 
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}
	
}
