package Thread;

public class SincronismoTeste implements Runnable {
    private Conta conta = new Conta();

	public static void main(String[] args) {
		
		/*
		  	Instanciando minha propria classe que implementa Runnable
		*/
		
		SincronismoTeste sincronismoTeste = new SincronismoTeste();
	    Thread jose = new Thread(sincronismoTeste, "Jose");
	    Thread maria = new Thread(sincronismoTeste, "Maria");
	    
	    jose.start();
	    maria.start();
	}
	
	
	
	
	private void saque(int valor) {
        /*
         		Apenas uma thread pode executar o codigo por vez -- atomicidade, é um codigo que nao pode ser dividido

        		*O sincronismo acontece por locks --- meio que chaves dos objetos dizendo que eles podem executar ou não 
        	mesmo se eu der um sleep numa thread ele nao deixa de ter o lock, se for dele, o codigo vai ficar parado sem fazer nada mesmo 

        	*Eu posso sincrinizar um bloco especifico de codigo, como no exemplo abaixo:     Ou um metodo
        	
        	
        	*Aqui eu sincronizo o dado conta, por exemplo se for uma conta compartilhada, ambos nao podem fazer saques em threads diferentes -- pode acontecer algum erro  
        	
         */
		
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar");
                conta.saque(valor);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }
	
	
	
	/*
	  		Metodos estaticos trabalham com o lock da classe
	  		
	  		Metodos nao estaticos trabalham com o lock da instancia 
	  		
	  		Em sincronismo de threads não é recomendavel que se acesse atributos estaticos por metodos não estaticos e vice versa
	*/
	
	
	
	
	
	/*
	 	É possível colocar sincronismo em metodos estaticos, é como se estivesse sendo realizado um lock para a classe inteira
	 	
	*/
	
    public static void imprime() {
        synchronized (SincronismoTeste.class){
            System.out.println("classe literal");
        }
    }
    
    
    public static synchronized void imprime(String classe) {
        System.out.println("classe literal");
    }
    
        
    /*
     	Para fazer o método saque funcionar com threads eu preciso chamar ele dentro do run 
    */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Saldo Negativo!!!");
            }
        }
    }
}



class Conta {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        saldo = saldo - valor;
    }
}
