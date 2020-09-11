package Classes_Abstratas;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		
		/*	
		 	Não posso mais instanciar o tipo funcionario, pois se tornou uma classe abstrata
		 		Funcionario func = new Funcionario();
		 */

		Gerente Marcio = new Gerente("Marcio", "01234-02", 5000);
		
		Marcio.calculaSalario();
		
		System.out.println(Marcio);
		
		
		
		System.out.println("----------------------------------------------");
		
		
		Vendedor Joana = new Vendedor("Joana", "06898-02", 1800, 15000);
		
		Joana.calculaSalario();
		
		System.out.println(Joana);
		
	}

}
