package Heranca;

public class HerancaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Endereco end = new Endereco();
		p.setNome("Gina");
		p.setCpf("12345");

		end.setRua("Rua 25");
		end.setBairro("Bairro 1");
		
		p.setEndereco(end);
		
		p.imprime();
		
		
		System.out.println("--------------------------------------------------------------");
		Funcionario f = new Funcionario();
		
		f.setNome("Augusto");
		f.setCpf("9888999");
		f.setSalario(150000);
		f.setEndereco(end);
		
		f.imprime();
	}
}
