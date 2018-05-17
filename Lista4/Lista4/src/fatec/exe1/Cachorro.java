package fatec.exe1;
public class Cachorro extends Mamifero{
    private boolean lateMuito;
    public Cachorro() {
        super();
        this.lateMuito = false;
    }
    public Cachorro(String nome, boolean lateMuito) {
        super(nome);
        this.lateMuito = lateMuito;
    }
    public boolean isLateMuito() {
        return lateMuito;
    }
    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }
    @Override
    public String toString() {
        String aux = "";
        aux = this.lateMuito ? "Late Muito": "Não late muito";
        return super.toString() + "lateMuito=" + aux + '}';
    }
    @Override
    public String fala(){
        return this.lateMuito ? "AU, AU" : "au, au";
    }
}
