package String;

public class StringTeste {

	public static void main(String[] args) {

		String teste = "Essa é uma frase longa";
		
		System.out.println("--------------------------\nPrimeira Letra: " + teste.charAt(0));
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("def").insert(3, "###").reverse().delete(2, 4);
		
		System.out.println("\n----------------------\n String Builder: " + sb);
	}

}
