package Conceitos_Uteis;

public class NumeroVariaveisDeParametros {

	public static void main(String[] args) {

		// Println
		System.out.println("A somatoria de 1, 2 e 3 é: " + soma(1, 2, 3));

		// Printf
		System.out.printf("A somatoria de 4, 7, 2, e 8 eh: %d%n", soma(4, 7, 2, 8));

		// Posso passar vazio também
		System.out.printf("A somatoria de nada eh: %d%n", soma());
	}

	// Dessa forma eu posso passar quantos valores eu quiser e posterioremtente eles
	// são transformados num array, existe isso também em outras linguagens
	private static int soma(int... numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; ++i) {
			resultado += numeros[i];
		}
		return resultado;
	}
}
