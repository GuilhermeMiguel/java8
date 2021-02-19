package Heranca;

import java.time.LocalDate;

public class Consultar2 {

	public String consultarDataAtual() {
		var dataAtual = LocalDate.now();
		
		return "A Data atual é:" + dataAtual.getDayOfMonth() + "/" + dataAtual.getMonthValue() + "/" + dataAtual.getYear(); 
	}
}
