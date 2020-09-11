package Interfaces;

public interface Transportavel {

	
	/*
	 	Niveis de acesso
	 	
	 	private > default (package) > protected > public
	 	
	 	
	 	Se numa super class o metodo foi definido como menos protegido (restritivo), nunca podera ser sobrescrito como mais protegido (restritivo)
	 	
	 	Agora o contrario eu posso, se ele for escrito como mais restrito, nas outras classes eu posso diminuir a restricao
	 	
	 	 
	 	PORÉM EM INTERFACE DEVE SER SEMPRE PUBLICO, NA INTERFACE E NAS CLASSES QUE A IMPLEMENTAM
	 */
	
	/* public abstract */ void calculaFrete();
	
	void calculaImposto();
}
