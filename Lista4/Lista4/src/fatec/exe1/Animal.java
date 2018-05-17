package fatec.exe1;
public class Animal {
    // protected significa public para as filhas e private
    // para as demais
    protected String nome;

    public Animal() { this.nome = "não definido";   }

    public Animal(String nome) { this.nome = nome;  }

    public String getNome() {return nome;  }

    public void setNome(String nome) { this.nome = nome;  }

    @Override
    public String toString() { return "Animal{" + "nome=" + nome + '}';
    }
    
    public String fala(){ return "Eu não falo"; }
    
}
