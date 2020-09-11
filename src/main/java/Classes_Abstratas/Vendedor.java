package Classes_Abstratas;

public class Vendedor extends Funcionario {
	
	private double totalVendas;
	
	
	
	
	
	
	public Vendedor() {
				
	}

	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);	
		this.totalVendas = totalVendas;
	}

	//Como esse método é abstract na classe Funcionario eu sou obrigado a implementa-lo
	@Override
	public void calculaSalario() {
		this.salario = 	salario + (totalVendas * 0.05);	
	}

	//Metodo que vem de pessoa -- se ele estiver na classe funcionario não sou obrigado a implementa-lo aqui, caso contrario sim
	@Override
	public void imprime() {
		
	}
	

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

}
