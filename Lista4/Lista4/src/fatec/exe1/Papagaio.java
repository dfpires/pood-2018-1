package fatec.exe1;
public class Papagaio extends Passaro{
    private String vocabulario;
    public Papagaio() {
        super();
        this.vocabulario = "não definido";
    }
    public Papagaio(String vocabulario, String nome) {
        super(nome);
        this.vocabulario = vocabulario;
    }
    public String getVocabulario() {    return vocabulario; }
    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
    @Override
    public String fala() {
        return vocabulario;
    }
    @Override
    public String toString() { 
        return super.toString() + this.vocabulario;
    }
}
