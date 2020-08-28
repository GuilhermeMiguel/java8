package Heranca;

public class HerancaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gina");
		Endereco end = new Endereco();
		p.setCpf("12345");

		end.setRua("Rua 25");
		end.setBairro("Bairro 1");
		
		p.setEndereco(end);
		
		p.imprime();
		
		
		//Funcionario extende pessoa, então ele tem todos os seus campos, mais aqueles que eu desejar adicionar 
		System.out.println("--------------------------------------------------------------");
		

		Funcionario f = new Funcionario("Augusto");
		
		f.setCpf("9888999");
		f.setSalario(150000);
		f.setEndereco(end);
		
		f.imprime();
	}
}
