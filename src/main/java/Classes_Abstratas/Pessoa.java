package Classes_Abstratas;

public abstract class Pessoa {

	protected String nome;

	/*
	 		A classe funcionario também é abstrata, então ela não é obrigada a implementar esse metodo imprime, 
		as classes Vendedor e Gerente que sao concretas precisam. 
	*/
	
	public abstract void imprime();
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
