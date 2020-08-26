package Heranca;


public class Funcionario extends Pessoa{

	//A classe funcionario é mais especializada que a classe Pessoa 
	private double salario;

	//No construtor da classe filha eu preciso passar o construtor para a classe pai
	public Funcionario(String nome) {
//		this(); posso chamar assim se eu tiver outro constutor de funcionario
	//mas ai meu super nao vai funcionar, nao posso ter os dois 
		
		super(nome); //Aqui eu estou passando o argumento para a clase pai
		//Super assim como o this -- devem ser a primeira linha de execução dentro de um metodo
	}
	
//	public Funcionario() {
//		// TODO Auto-generated constructor stub
//	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
		this.imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento(){
		System.out.println("Eu " +super.nome+ " recebi o pagamento de " +this.salario);

	}
	
}
