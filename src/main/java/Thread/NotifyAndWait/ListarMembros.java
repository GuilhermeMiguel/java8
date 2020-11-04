package Thread.NotifyAndWait;

import java.util.LinkedList;
import java.util.Queue;

public class ListarMembros {

	/*
	  	
	  	Criando fila para os emails 
	  	
	*/
	private final Queue<String> emails = new LinkedList<>();

	private boolean aberta = true;
	
	
	public int getEmailsPendentes() {
		synchronized (emails) {
            return this.emails.size();
        }
	}
	
	public boolean isAberta() {
        return aberta;
    }

	
	public String obterEmailMembro() {
		String email = null;
		
		try {
			synchronized (this.emails) {
				while(this.emails.size() == 0) {
					if(!aberta) return null;
					System.out.println("Lista Vazia, colocando a thread: " + Thread.currentThread().getName() + " em modo wait");
					
					/*
					  Colocando a thread em modo de espera
					*/
					this.emails.wait();
				}
				
				/*
				  	Se for adicionado algum email a lista o while para, então ele é retirado no metodo abaixo
				*/
				email = this.emails.poll();
			}
		} catch (InterruptedException e) {
            e.printStackTrace();
        }
        return email;
		
	}
	
	
	public void adicionarEmailMembro(String email) {
		synchronized (this.emails) {
			this.emails.add(email);
			System.out.println("Email adicionado na lista!");
			System.out.println("Notificando as Threads que estão em espera: "+ Thread.currentThread().getName());
			
			//Notificando todas as threads
			this.emails.notifyAll();
		}
	}
	
	
	public void fecharLista() {
        System.out.println("Notificando todas as threads e fechando a lista");
        aberta = false;
        synchronized (this.emails) {
            this.emails.notifyAll();
        }
    }

}
