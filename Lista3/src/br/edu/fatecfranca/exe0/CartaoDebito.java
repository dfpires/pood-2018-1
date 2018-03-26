package br.edu.fatecfranca.exe0;
public class CartaoDebito {
    private int numero, cv;
    private String validade, bandeira, nome;
    // associação
    private ContaCorrente conta;

    public CartaoDebito() {
    }

    public CartaoDebito(int numero, int cv, String validade, 
            String bandeira, String nome, ContaCorrente conta) {
        this.numero = numero;
        this.cv = cv;
        this.validade = validade;
        this.bandeira = bandeira;
        this.nome = nome;
        this.conta = conta; // agregação - independência
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "CartaoDebito{" + "numero=" + numero + 
                ", cv=" + cv + ", validade=" + validade + 
                ", bandeira=" + bandeira + ", nome=" + nome + 
                ", conta=" + conta + '}';
    }
    
    
}
