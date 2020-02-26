package EstudoJava8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteImpressaoDatas {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();

		int dia = dataAtual.getDayOfMonth();
		int mes = dataAtual.getMonthValue();
		int ano = dataAtual.getYear();

		
		List<Integer> listaAnos = new ArrayList<>(Arrays.asList(ano - 4, ano -3, ano -2, ano -1, ano));

		
		if (dia >= 15 && mes == 12) {
			listaAnos.add(ano + 1);

			listaAnos.removeIf(n -> n == (ano - 4));

			listaAnos.removeIf(n -> n == (ano - 4));

		}

		
		listaAnos.forEach(System.out::println);
	}

}
