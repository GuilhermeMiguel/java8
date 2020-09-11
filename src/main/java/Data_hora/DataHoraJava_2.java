package Data_hora;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DataHoraJava_2 {

	public static void main(String[] args) {

		//Period e Duration
		//A primeira se baseia em datas e a segunda em tempo
		
		Period of = Period.of(1, 5, 4);
		System.out.println(of);
		
		Period of2 = Period.ofWeeks(5); // Calcula a quantidade de dias
		System.out.println(of2);
		
		LocalDate dataCriada = LocalDate.of(1990, Month.AUGUST, 10);
		System.out.println(dataCriada);
		
		LocalDate dataCriada2 = LocalDate.of(1991, Month.NOVEMBER, 10);
		System.out.println(dataCriada2);
		
		Period between = Period.between(dataCriada, dataCriada2);
		
		System.out.println("Periodo entre essas datas: " + between);
	
	}

}
