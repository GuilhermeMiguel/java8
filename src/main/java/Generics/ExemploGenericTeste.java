package Generics;

import java.util.ArrayList;
import java.util.List;

import Generics.Smartphone;
import Generics.Tablet;

public class ExemploGenericTeste {

	public static void main(String[] args) {
	
		List<Smartphone> smartphonesDisponiveis = new ArrayList<>();
		smartphonesDisponiveis.add(new Smartphone("Galaxy A50"));
		smartphonesDisponiveis.add(new Smartphone("iPhone X"));
        
        ObjetosAlugaveis<Smartphone> smartphoneAlugavel = new ObjetosAlugaveis<>(smartphonesDisponiveis);
        
        Smartphone smart = smartphoneAlugavel.getObjetoDisponivel();
        System.out.println("-------------------------");
        System.out.println("Usando o smartphone " + smart.getNome() +  "  por um mes");
        System.out.println("------------------------");
        smartphoneAlugavel.devolverObjeto(smart);
        System.out.println("------------------------");
        
        
        
        
        
        
        List<Tablet> tabletsDisponiveis = new ArrayList<>();
        tabletsDisponiveis.add(new Tablet("Galaxy Tab A"));
        tabletsDisponiveis.add(new Tablet("iPad"));
        
        ObjetosAlugaveis<Tablet> tabletAlugavel = new ObjetosAlugaveis<>(tabletsDisponiveis);
        
        Tablet tablet = tabletAlugavel.getObjetoDisponivel();
        System.out.println("-------------------------");
        System.out.println("Usando o tablet " + tablet.getNome() +  "  por um mes");
        System.out.println("------------------------");
        
        //Dessa forma esta errado, mesmo sendo generics, pois estou com a instancia de um tablet querendo passar um smartphone
        		//tabletAlugavel.devolverObjeto(smart);
        
        tabletAlugavel.devolverObjeto(tablet);
        System.out.println("------------------------");
	}

}



class ObjetosAlugaveis<T> {
    
	private List<T> objetosDiponiveis;
    
    
    public ObjetosAlugaveis(List<T> objetosDiponiveis) {
        this.objetosDiponiveis = objetosDiponiveis;
    }
    
    //Alugar
    public T getObjetoDisponivel() {
        T t = objetosDiponiveis.remove(0);
       
        /*
          	Aqui eu não posso pegar informações detalhadas do objeto, como o nome, pois eu não sei de qual tipo ele é ainda, mas posso utiliza o toString para imprimir 
        */
        
        System.out.println("Alugando objeto: " + t);
        System.out.println("------------------------------");
        System.out.println("Objetos disponiveis: " + objetosDiponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDiponiveis.add(t);
        System.out.println("---------------------------------");
        System.out.println("Objetos disponiveis: " + objetosDiponiveis);
    }
}
