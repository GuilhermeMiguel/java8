package Data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataHoraJava8 {

	public static void main(String[] args) {
		
		//PARAR DE USAR DATE E CALENDAR
		
		//LocalDate - representa uma data: 06/08/1990 -- simplesmente uma data sem dados desnecessários
		LocalDate ldNow = LocalDate.now();
		System.out.println("Data atual: " + ldNow);
		
		LocalDate dataCriada = LocalDate.of(1990, Month.AUGUST, 10);
		System.out.println(dataCriada);
		
		System.out.println("Métodos com operações: " + dataCriada.plusYears(20));
		
		System.out.println("Métodos com operações: " + dataCriada.plusYears(20).minusMonths(5).minusYears(4));
		
		System.out.println(dataCriada + "Imutavel, para utilizar o valor eu preciso armazenar numa varável");
		
		//LocalTime - representa uma hora: 11:40:00 -- simplesmente uma hora
		LocalTime ltNow = LocalTime.now();
		System.out.println("\nHora atual: " + ltNow);
		
		LocalTime horaCriada = LocalTime.of(11, 10, 01, 100000);
		System.out.println(horaCriada);
		
		//LocalDateTime - representa data + hora: 06/08/1990 11:40:00 -- Aqui não se tem relação de fuso horário
			//Porém, se for ser utilizado num sistema grande talvez seja interessante a utilização do fuso-horário
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println("\nData e hora atual: " + ldtNow);
		LocalDateTime localDateTimeCriado = LocalDateTime.of(dataCriada, horaCriada);
		
		//Instant - representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970 00:00:00)
				//Também pode representar uma data normal 06/08/1990 11:40:00 mas no marco GMT/UTC -- que é o marco 0
		Instant intNow = Instant.now();
		System.out.println("\nInstant: " + intNow);
		
		Instant instCriado = Instant.ofEpochMilli(50000000000L); //O L no final indica que é um long
		System.out.println(instCriado);
		
		//Instant eu posso somar dias somente, pois meses e anos as quantidades mudam, ou seja, 
	//os milessegundos ficariam errados 
		
		//ZonedDateTime -- LocalDateTime com TimeZone (fuso horário)
		//06/08/1990 11:40:0 GTM-3 (America/Sao Paulo)
		ZonedDateTime zdNow = ZonedDateTime.now();
		System.out.println("\nZonedDateTime: " + zdNow);
		
		ZonedDateTime zdt = ZonedDateTime.of(localDateTimeCriado, ZoneId.systemDefault());
		
		System.out.println(zdt);
		//nenhuma dessas classes tem contrutor, meio que não se instancia como acontece normalmente, então utiliza-se 
	//os métodos
		
	}
}
