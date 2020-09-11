package Data_hora;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DataHoraJava_Escolha {

	public static void main(String[] args) {
		
		//LocalDateTime = Data + Hora 
		
		//Instant = Data + Hora + GMT -- Para trabalhar com milessegundo -- Representa um instante no tempo
		
		//ZonedDateTime = Data + Hora + Fuso Horário -- Localidade 
		
		
		
		Instant now = Instant.now();
		
		//Lança excessão pois instant aceita incremento de milsessegundos
		try {
			System.out.println(now.plus(5, ChronoUnit.MONTHS));	
		}
		catch(Exception e) {
			System.out.println("Caiu na exceção");
		}
		
		ZonedDateTime agora = ZonedDateTime.now();
		//Esta criando um zoned Date time apartir de um instant
		ZonedDateTime criacaoZDT = now.atZone(ZoneId.of("America/Sao_Paulo"));
		
		ZonedDateTime horaLA = 
				agora.withZoneSameInstant(ZoneId.of("America/Argentina/Buenos_Aires"));
		
		System.out.println(horaLA);
		
		//Ai transformando em data eu posso somar mes, dia, ano
		criacaoZDT.plusMonths(5);
		
		//LocalDateTime quando eu não me importo com o fuso horario -- porem devo levar em consideração 
		//o fusohorario do servidor que esteja rodando
		
		//Instant ele vai me dar a mesma data e hora indiferente do servidor que esteja
			//ele leva em conta o gmt
		
	}

}
