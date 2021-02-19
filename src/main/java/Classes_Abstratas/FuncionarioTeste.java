package Classes_Abstratas;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		
		/*	
		 	Não posso mais instanciar o tipo funcionario, pois se tornou uma classe abstrata
		 		Funcionario func = new Funcionario();
		 		
		 		Classes abstratas nao podem ser instanciadas, somente extendidas
		 	
		 		Elas funcionam como interfaces, PORÉM, podem ter implementação de metodos sem nenhum problema 
		 	
		 	metodos esses que serão herdados posteriormente
		 	
		 */

		Gerente Marcio = new Gerente("Marcio", "01234-02", 5000);
		
		Marcio.calculaSalario();
		
		System.out.println(Marcio);
		
		
		System.out.println("Esse toString() esta na classe abstrata Funcionario: " + Marcio.toString());
		
		System.out.println("----------------------------------------------");
		
		
		Vendedor Joana = new Vendedor("Joana", "06898-02", 1800, 15000);
		
		Joana.calculaSalario();
		
		System.out.println(Joana);
		
	}

}
