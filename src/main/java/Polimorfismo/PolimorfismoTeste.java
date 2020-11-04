package Polimorfismo;

public class PolimorfismoTeste {

	public static void main(String[] args) {
        
		Gerente g = new Gerente("Oswaldo", 5000, 2000);
        
		Vendedor v = new Vendedor("Yuri",2000,20000);
        
		RelatorioPagamento relatorio =  new RelatorioPagamento();
		
		
		//Eu não posso instanciar a classe do tipo Funcionario, somente estender 
			//Funcionario teste = new Funcionario();
	
			//posso fazer da seguinte forma
			Funcionario gerenteFuncionario = new Gerente("Oswaldo", 5000, 2000);
			
        //        relatorio.relatorioPagamentoGerente(g);
        //        System.out.println("---------------------------");
        //        relatorio.relatorioPagamentoVendedor(v);
        
		/*
		  		Chamada do metodo que recebe 
		  	
		  			Funcionario funcionario
		  	
		  	e pode passar Gerente gerente ou Vendedor vendedor		
		*/
        
		relatorio.relatorioPagamentoGenerico(g);
        
        System.out.println("---------------------------");
        
        relatorio.relatorioPagamentoGenerico(v);

    }
}
