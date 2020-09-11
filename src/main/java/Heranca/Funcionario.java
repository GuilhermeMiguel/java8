package Heranca;


public class Funcionario extends Pessoa{

	//A classe funcionario é mais especializada que a classe Pessoa 
	
	private double salario;

	
	public Funcionario(String nome) {
		//Super assim como o this devem ser a primeira linha de execução dentro de um metodo

		//Não posso ter super e this dentro de um construtor, por ambos devem ser a primeira linha 
		
		super(nome); //Aqui eu estou passando o argumento para a clase pai, pois la eu também tenho um construtor que recebe o nome 
		
	}
	
/*	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
*/
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void imprime() {
		
		//SUPER -- chama o metodo da classe que ele esta extendendo
		super.imprime();  
		
		System.out.println(this.salario);
		this.imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento(){
		System.out.println("Eu " +super.nome+ " recebi o pagamento de " +this.salario);

	}
	
}
