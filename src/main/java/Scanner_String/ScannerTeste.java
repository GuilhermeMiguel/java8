package Scanner_String;

import java.util.Scanner;

public class ScannerTeste {

	public static void main(String[] args) {

		/*
		 		Funciona mais ou menos como um split
		 	
		 	Pode-se passar string, um arquivo 
		*/
		
		Scanner scanner = new Scanner("1 true 100 oi");
		Integer item = 0;
		while(scanner.hasNext()) {
			item += 1;
			System.out.println("Item " + item + ": " + scanner.next());
		}
		
		//Scanner é bom ser fechado
		scanner.close();
		
		System.out.println("\n==========================================\n");
		
		Scanner scanner2 = new Scanner("1 true 100 oi");
		
		while(scanner2.hasNext()) {
			if(scanner2.hasNextInt()) {
				int i = scanner2.nextInt();
				System.out.println("Int: " + i);
			} 
			else if(scanner2.hasNextBoolean()) {
				boolean b = scanner2.nextBoolean();
				System.out.println("Boolean: " + b);
			}
			else {
				System.out.println("Item que não caiu nas validações: " + scanner2.next());
			}
		}
		
		scanner2.close();
		
		
	}

}
