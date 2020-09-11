package Classes_Abstratas;

public abstract class Funcionario extends Pessoa {

	//CLASSES ABSTRATAS NUNCA PODEM SER INSTANCIADAS, MAS DEVEM SER EXTENDIDAS
	
	
	protected String clt;
	protected double salario;
	
	
		
	public Funcionario() {
		
	}


	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}


	/*
	   		Para gerente e vendedor os salarios sao calculados de forma diferente
	   	então preciso que cada classe calcule de forma diferente
	   	
	   		Para calcular de forma diferente eu faço com que o metodo na classe funcionario seja abstract, 
	   	assim ele não tem implementação e obriga as classes filhas a implementar ele
	 */
	
	
	//Se eu tiver um método abstrato aquela classe se torna abstrata
	public abstract void calculaSalario();
	
	
	
	@Override
	public void imprime() {
		
	}
	
	
	public String getClt() {
		return clt;
	}
	
	public void setClt(String clt) {
		this.clt = clt;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}


	//Um metodo concreto sera utilizado nas classes filhas da mesma forma
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}		
	
	
}
