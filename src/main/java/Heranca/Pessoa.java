package Heranca;

public class Pessoa {

	//Protected acessado somente dentro do pacote ou fora do pacote por 
		//classes filhas - subclasses
	
	
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	
	//Quando eu tenho construtor na classe pai, eu preciso ter construtor na classe filha
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.endereco.getRua());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
