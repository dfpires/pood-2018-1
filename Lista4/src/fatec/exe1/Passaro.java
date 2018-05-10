package fatec.exe1;
public class Passaro extends Animal{

    public Passaro() {
        super(); // chama construtor sem parâmetro
    }

    public Passaro(String nome) {
        super(nome);// chama construtor com parâmetro
    }
    
    @Override
    public String fala(){
        return "Piu, Piu";
    }
}
