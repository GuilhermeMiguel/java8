package Lista_Ligada_Duplamente_Ligada;

public class ListaLigadaTeste {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("Paula");
		System.out.println(lista);
		lista.adicionaNoComeco("Guilherme");
		System.out.println(lista);
		
		lista.adicionaNoFim("Marcelo");
		System.out.println(lista);
		
		lista.adicionaNoMeio(2, "Gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		
		lista.RemoveDoFim();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.adicionaNoComeco("Jose");
		lista.adicionaNoComeco("Joao");
		
		System.out.println(lista);
		
		lista.RemoveDoFim();
		
		System.out.println(lista);
		
		System.out.println("------------------contem--------------------");
		
		System.out.println(lista.contem("Gabriel"));
		System.out.println(lista.contem("Danilo"));
	}

}
