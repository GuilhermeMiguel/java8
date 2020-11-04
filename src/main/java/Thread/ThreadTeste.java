package Thread;

public class ThreadTeste {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread que esta sendo executada -- metodo main: " +Thread.currentThread().getName());
		
		
		ThreadExemplo t1 = new ThreadExemplo('A'); //Posso utilizar aspas simples quando se trata de um caracter
		
		ThreadExemplo t2 = new ThreadExemplo('B');
		
		//Chamando normalmente o metodo run, tudo será executado somente numa thread -- na main
		//t1.run();
		
		
		System.out.println("\n\n----------------------------------------------------------------------------- ");
		
		/*
		 
		 		Para que o codigo seja executado em parelelo ele precisa ser chamado com o metodo start
		  	
		  	As threads não tem ordem para serem executas, nem quando serao encerradas, é tudo realizado automaticamente pela JVM
		  	
		  	Executando dessa forma veremos que as letras "A" e "B" vão se misturar
		*/
			
		
		
		//Runnable
		Thread t3 = new Thread(new ThreadExemploRunnable('C'), "T3");
		Thread t4 = new Thread(new ThreadExemploRunnable('D'), "T4");
		
		
		//Setando Prioridade -- vai de 1 a 10 
		t4.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		
		
		/*
		  		JOIN
		  		Faz com que a thread manin só chame outra thread após uma outra ter sido encerrada
		  		
		*/
		
		t1.join();
		
		t2.start();
				
		t3.start();
		
		t4.start();
		
		
		
		/* 	
		 	Esse código pode ser executado em qualquer ponto, pois todo o código está rodando sobre uma thread
					Thread.sleep(2000);
		*/
	}
}


	/*
	
			Thread Daemon x User
		 
		* A JVM só termina a execução quando todas as threads user estão finalizadas
		* Já com as threads daemon, a JVM pode parar mesmo se elas estiverem sendo executadas -- Exemplo de daemon: Garbage Collector
	
	
	*/

class ThreadExemplo extends Thread {
    private char c;

    public ThreadExemplo(char c) {
        this.c = c;
    }
    
    
    /*
      	
      	Para um código ser executado em paralelo, tem que ser dentro do metodo run
      
    */

    @Override
    public void run() {
        System.out.println("\nThread que esta sendo executada -- metodo run/start classe ThreadExemplo: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0 && i !=0 ) {
                System.out.println();
            }
        }
    }

}


//MELHOR FORMA DE IMPLEMENTAR UMA THREAD

class ThreadExemploRunnable implements Runnable {
    private char c;

    public ThreadExemploRunnable(char c) {
        this.c = c;
    }
    
    
    /*
      	
      	Para um código ser executado em paralelo, tem que ser dentro do metodo run
      
    */

    @Override
    public void run() {
        System.out.println("\nThread que esta sendo executada -- metodo run/start classe ThreadExemploRunnable: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0 && i !=0 ) {
                System.out.println();
            }
            
            
            /*
              	YIELD
              	Faz com que a thread atual pare de executar e permite que outras threads com a mesma prioridade sejam executadas
            */
            
            
            if(!Thread.currentThread().getName().equals("T4"))
            	Thread.yield();
            
            
            /*
                SLEEP
             	Faz a thread parar por 2 segundos, não podemos afirmar quando ao certo ela vai parar, mas ela sempre para por 2 segundos
                        
            
	            try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			*/
        }
    }
}


/*
 
 			CONCEITOS SOBRE THREADS
 
 		* O Scheduler que define quando uma thread começa e quando ela termina
 		* Quando o método run termina a execução, a thread está morta
 				# Uma thread não pode ser startada mais de uma vez, gera uma exception, mesmo se ela for encerrada
 				
 				
 				
 		ESTADOS DE UMA THREAD:
 		
 			* NEW: Quando a thread é criada, e está pronta para iniciar -- start();

			* RUNNABLE : Quando volta de algum estado, ou quando está rodando -- foi dado o start(), 
		mesmo que tenha sido dado o start numa thread, não quer dizer que ela esta rodando, pode ser que o scheduller não tenha sido chamado,
		alguns consideram que ela esta rodando quando esta no estado Running;

			* BLOCKED:
				1-) Uma thread é considerada no estado BLOCKED quando está esperando dados.
				2-) Uma thread também é considerada BLOCKED quando está aguardando a Lock de outra thread.
			
			* WAITING: Uma thread que está esperando indefinidamente por outra thread para executar uma determinada ação está neste estado;

			* TIMED_WAITING: Uma thread que está esperando por outro thread para executar uma ação, mas há um tempo limite de espera;

 			* TERMINATED: Uma thread que terminou a execução, mas ainda existe (não existe o estado DEAD).
 		
 
 */
 

