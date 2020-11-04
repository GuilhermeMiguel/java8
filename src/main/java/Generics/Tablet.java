package Generics;

public class Tablet {
	private String nome;

    public Tablet(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tablet{" +
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
