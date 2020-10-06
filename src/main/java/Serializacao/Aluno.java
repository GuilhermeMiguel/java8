package Serializacao;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


@SuppressWarnings("serial")
public class Aluno implements Serializable {
	
	/*
	 		A interface Serializable é somente uma flag, dentro dela não tem nem metodos, nem atributos
	 	
	 	flag no sentido que informa que aquela classe vai ser serializada
	 	 
	*/
    private Long id;
    private String nome;
    
    /*
     		Com essa palavra reservada transient, estou informando que o atributo sera ignorado na serializacao
    */
    
    private transient String password; 
    private static String nomeEscola = "Fatec Zl :)";
    private transient Matricula matricula;

    
    public Aluno(Long id, String nome, String password) {
    
    	/*
    	  	A serialização não chama o construtor
    	*/
    	
    	System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    
    
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
  
    
    /*
      		
      		Se eu precisar muito de um atributo de outra classe, mas ela por algum motivo não pode implementar serializable 
      	
      	Eu torno ele transient, se eu não implementar os metodos abaixo, ele simplesmente sera ignorado, se implementar ele pegara seus valores
      	
      	posso fazer da seguinte forma:
      	
    */
    
    
    /*
      	Esses metodos sao especiais, pois seriam como uma especie de override de metodos da Serializable, mas como ela nao tem nada, não são
    */
    
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(matricula.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            matricula = new Matricula(ois.readUTF());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
  
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }
    
    public Matricula getMatricula() {
		return matricula;
	}
    
    public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
}
