package fatec.exe0;
public class ContaCorrente {
    // públicas para as filhas - Especial e Poupança
    // privada para o resto
    protected int nro;
    protected float saldo;
    protected String nome;

    // construtores
    public ContaCorrente() {
        this.nro = 0;
        this.saldo = 0;
        this.nome = "";
    }
    public ContaCorrente(int nro, float saldo, String nome) {
        this.nro = nro;
        this.saldo = saldo;
        this.nome = nome;
    }
    // getters e setters
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // toString
    @Override
    public String toString() {
        return "ContaCorrente{" + "nro=" + nro + 
                ", saldo=" + saldo + ", nome=" + nome + '}';
    }
}