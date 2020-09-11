package Estudo_Java8;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		// API De Datas

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2025, Month.JUNE, 5);

		Period periodo = Period.between(hoje, olimpiadasRio);
		
		System.out.println("Esse é o período:" + periodo);

		// Os objetos da api de datas sao imutaveis, as alterações que eu faço não são
		// aplicadas as variaveis que eu estou
		// operando, porém sim a novas variaveis em que eu preciso salvar esses valores

		LocalDate novasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(novasOlimpiadas);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = novasOlimpiadas.format(formatador);

		System.out.println(valorFormatado);

		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();

		System.out.println(agora);

		System.out.println(agora.format(formatadorHoras));

		LocalTime intervalo = LocalTime.of(15, 30);

		System.out.println(intervalo);

		// Tem muitas e muitas implementações de métodos estaticos que estão
		// implementadas nessa API de datas, com muitas possibilidades
		// de como se lidar com datas
		
	}
}
