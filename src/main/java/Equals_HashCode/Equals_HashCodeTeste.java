package Equals_HashCode;

public class Equals_HashCodeTeste {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String nome1 = "Guilherme Miguel";
		String nome2 = "Guilherme Miguel";
		String nome3 = new String("Guilherme Miguel");
		
		/*
				Comparação de strings 
			Quando se compara com == esta se fazendo uma comparação com o endereço de memória 
			
			String nome1 = "Guilherme";
			String nome2 = "Guilherme";
			
				Ambos apontam para o mesmo endereço de memoria 
			Se for comparado com == dará true			
			
			porém quando eu faço um new String eu gero uma nova (novo endereço de memória), então mesmo com o conteudo igual, da false para ==
		*/
		
		
		System.out.println("Comparação " +nome1+ " e " +nome2+ " com == : " + (nome1 == nome2) );
		
		System.out.println("Comparação " +nome1+ " e " +nome3+ " (new string) com == :" + (nome1 == nome2) );

		System.out.println("Comparação " +nome1+ " e " +nome3+ " (new string) com equals : " + nome1.equals(nome2) );

		
		
		Integer int1 = 5;
		Integer int2 = new Integer(5);
				
		System.out.println("Comparação " +int1+ " e " +int2+ " (new Integer) com == : " + (int1 == int2));
		
		System.out.println("Comparação " +int1+ " e " +int2+ " (new Integer) com equals : " + int1.equals(int2) );

		Motocicleta m1 = new Motocicleta("Bis", "ABC-1234");
		Motocicleta m2 = new Motocicleta("Bis", "ABC-1234");
		
		System.out.println("Comparando classes: " + m1.equals(m2));
	}

}
