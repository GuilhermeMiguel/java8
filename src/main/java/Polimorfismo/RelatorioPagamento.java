package Polimorfismo;

public class RelatorioPagamento {

/*
 	
 	Com Polimorfismo eu posso fazer com que uma variavel de referencia da classe pai aponte para metodos da classe filha	
 		
 		Funcionario f = recebe uma variavel do tipo Gerente; 
 		

 	Dessa forma Eu posso fazer menos sobrecargas de metodos, escrevendo menos codigo	
 		
 		
 		
	 public void relatorioPagamentoGerente(Gerente gerente) {
	 
		System.out.println("Gerando relatorio de pagamento para a gerencia");
		gerente.calcularPagamento();
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salário desse mês: " + gerente.getSalario());
	}




	public void relatorioPagamentoVendedor(Vendedor vendedor) {
		System.out.println("Gerando relatorio de pagamento para os vendedores");
		vendedor.calcularPagamento();
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Salário desse mês: " + vendedor.getSalario());
	}
	
	
	
	
*/

	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		
		System.out.println("Gerando relatorio de pagamento");
		
		
		
		/*
		 
		  		Aqui se a variavel funcionario for da classe Gerente ---> Ele chama o metodo da classe Gerente
			Já se a variavel funcionario for da classe Vendedor ---> Ele chama o metodo da classe Vendedor
			
			
				LEMBRANDO !!!!! --- Esse metodo calcularPagamento existe como metodo abstrato também na classe Funcionario 
			e que essas duas classes Gerente e Vendedor a extendem
		 
		 */
		
		funcionario.calcularPagamento();
		
		System.out.println("Nome: " + funcionario.getNome());
		
		System.out.println("Salário desse mês: " + funcionario.getSalario());
		
		
		
		/*
		  		Se eu quiser pegar um atributo especifico de alguma das duas classes posso fazer um CAST
		 	
		 	Posso verificar de qual tipo esse atributo é com o instanceof
		*/
		
		
		if (funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("Participacao nos lucros: " + g.getPnl());
		}
		
		
		if (funcionario instanceof Vendedor) {
			System.out.println("Total vendas: " + ((Vendedor) funcionario).getTotalVendas());
		}

	}
}
