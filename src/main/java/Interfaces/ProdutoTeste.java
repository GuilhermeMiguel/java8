package Interfaces;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p = new Produto("Notebook",3000, 4);
		
		p.calculaImposto();
		p.calculaFrete();
		
		System.out.println(p);
	}
}
