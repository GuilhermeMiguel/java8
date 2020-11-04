package Generics;

public class Smartphone {

	private String nome; 
	
	public Smartphone(String nome) {
		this.nome = nome;
	}
	
	@Override
    public String toString() {
        return "Smartphone{" +
                "nome='" + nome + '\'' +
                '}';
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
