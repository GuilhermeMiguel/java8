package Generics;

public class GenericsTeste {

	public static void main(String[] args) {

		//Só se pode passar classes, Wrappers, não se pode passar tipos primitivos
		ClasseGenerica<Integer> obj1 = new ClasseGenerica<>(10);
		
		ClasseGenerica<Double> obj2 = new ClasseGenerica<>(20.0);
	
		obj1.imprimeTipos();

		obj2.imprimeTipos();
		
		
		
		//--------------------------------------------------
		
		//Pode-se passar quantos tipos genericos que se quiser
		SegundaClasseGenerica<Integer, Double> objDoisTipos = new SegundaClasseGenerica<>(15, 25.5);
		
		objDoisTipos.imprimeTipos();
		
	}

}


//Geralmente utiliza-se a letra T
class ClasseGenerica<T> {
	
	T obj;
	
	public ClasseGenerica(T obj) {
		this.obj = obj;
	}
	
	public void imprimeTipos() {
		System.out.println("Tipo da classe : " + obj.getClass().getName());
	}
}



class SegundaClasseGenerica<T, V> {
	
	T obj1;
	V obj2;
	
	public SegundaClasseGenerica(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void imprimeTipos() {
		System.out.println("Tipo das classes : " + obj1.getClass().getName() + " + " + obj2.getClass().getName());
	}
}