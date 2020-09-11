package Polimorfismo;

public class PolimorfismoTeste {

	public static void main(String[] args) {
        
		Gerente g = new Gerente("Oswaldo", 5000, 2000);
        
		Vendedor v = new Vendedor("Yuri",2000,20000);
        
		RelatorioPagamento relatorio =  new RelatorioPagamento();

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
