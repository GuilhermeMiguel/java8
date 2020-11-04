package Equals_HashCode;

public class Motocicleta {

	private String nome;
	private String placa;

	public Motocicleta(String nome, String placa) {
		this.nome = nome;
		this.placa = placa;
	}

	
	/*
	  	Metodo equals compara os hashcodes que o java gera
	*/
	
	
	@Override
    public int hashCode() {
        return placa != null ? placa.hashCode() : 1;
    }
	
	/*
	 		A comparação de classes também funciona com a comparação do endereço em memória 
	 	
	 	posso sobreescrever o equals e fazer as comparações dos campos que eu desejo
	 	
	*/
	
	
	@Override
	public boolean equals(Object obj) {
		
		//se eu passar null retorna falso
		if(obj == null) return false; 
		
		/*
		  		this é a classe que chamou o metodo e obj a que se recebe por parametro
		  	
		  	this -> carro1.equals(obj -> carro2)
		*/		
		if(this == obj) return true;
		
		//Se não forem da mesma classe retorna-se falso 
		if(this.getClass() != obj.getClass()) return false;
		
		Motocicleta moto = (Motocicleta) obj;
		
		/*
		  	Da maneira abaixo estou comparando o objeto todo 
		  		Nesse caso poderia comparar somente placa, pois deve ser unica
		*/
		
		return placa != null && placa.equals(moto.getPlaca()) 
				&& nome != null && nome.equals(moto.getNome());
	}
	
	
	/*
	 	O METODO EQUALS DEVE SER:
	  		* Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    		* Simetrico para xe y diferentes de null, se x.equals(y) == true logo y.equals(x) tem que ser true
    		* Transitividade para x, y, z diferentes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) também tem que ser true
    		* Consistente x.equals(y) deve sempre retornar o mesmo valor
     		* para x diferente de null x.equals(null) tem que retornar false;
	*/

	
	
	/* 
	 	PARA HASHCODE
     		* Se x.equals(y) == true y.hashCode() == x.hashCode();
     		* y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar true
     		* x.equals(y) == false
     		* y.hashCode() != x.hashCode() x.equals(y) deverá ser false
     */

	
	
	
	@Override
	public String toString() {
		return "Motocicleta{" + "nome='" + nome + '\'' + ", placa='" + placa + '\'' + '}';
	}

	public String getNome() {
		return nome;
	}

	public String getPlaca() {
		return placa;
	}
}
