package Data_hora;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DataHoraJava8_Formatado {

	public static void main(String[] args) {

		//Antes para formatar datas havia DateFormat e SimpleDateFormat
		
		//Agora há a DateTimeFormatter
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
//		DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
//		DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;
		
		
		DateTimeFormatter formatterDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		DateTimeFormatter formatterTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println("Exibe da mesma forma: " +isoDateTime.format(ldt));

		System.out.println("Exibe da forma reduzida: " +formatterDate.format(ldt));

		System.out.println("Exibe da forma reduzida: " +formatterTime.format(ldt));
		
		//Format Style - short, long, full -- Para long e full preciso de ZonedDateTime, para ele pegar 
	//as informações precisas daquele local
		//     Posso setar um local:		
		//     Locale.setDefault(Locale.US);
		
		//PARA FAZER O MEU PROPRIO FORMATO EU PRECISO VERIFICAR SE A DATA QUE ESTOU MANIPULANDO TEM TODOS
	//OS PARAMETROS QUE EU PRCISO, COMO DATA E A HORA 
		DateTimeFormatter meuFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		
		System.out.println("Meu formato: " + meuFormatter.format(ldt));
		
		//Aqui primeiro eu chamo a data e posteriormente a formatação
		System.out.println("Meu formato mudando a maneira como a função é chamada: " + ldt.format(meuFormatter));
		
		//FORMATAR STRING EM DATA
		
		//Ele te devolve um tipo generico pois ele ainda não sabe o que vai te devolver
		TemporalAccessor parse = meuFormatter.parse("17-01-2020 11-33-52");
		
		//Convertendo o tipo generico em LocalDateTime
		LocalDateTime from = LocalDateTime.from(parse);
		
		System.out.println("O parse inteiro não é muito legal " +parse);
		System.out.println("String convertida em Data: " +from);
		
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH-mm-ss");
		TemporalAccessor parse2 = formatterHora.parse("08-11-34");
		
		LocalTime from2 = LocalTime.from(parse2);
		System.out.println("Conversão de string para hora" +from2);
		
		boolean ja = true;
	}

}
