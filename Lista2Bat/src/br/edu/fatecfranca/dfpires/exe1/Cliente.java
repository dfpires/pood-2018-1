package br.edu.fatecfranca.dfpires.exe1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;
    public Cliente(){
        this.nome = "sem nome";
        this.nroConta = "000000-0";
        this.nroAgencia = "0000-0";
        this.saldo = 0;
    }
    public Cliente(String nroConta, String nroAgencia, 
            String nome, float saldo){
        this.trataNome(nome);
        this.trataNroConta(nroConta);
        this.trataNroAgencia(nroAgencia);
        this.saldo = saldo;
    }
    private void trataNome(String nome){
        if (nome.length() <= 30){
             this.nome = nome;
        }
        else {
            System.out.println("Nome inválido");
        }
    }
    private void trataNroConta(String nroConta){
        if ((nroConta.length() == 8) && (nroConta.charAt(6) == '-')){
             this.nroConta = nroConta;
        }
        else {
            System.out.println("Número de conta inválido");
        }
    }
    private void trataNroAgencia(String nroAgencia){
        if ((nroConta.length() == 6) && (nroConta.charAt(4) == '-')){
             this.nroAgencia = nroAgencia;
        }
        else {
            System.out.println("Número da agência inválido");
        }
    }
    public void setNome(String nome){
        this.trataNome(nome);
    }
    public void setNroAgencia(String nroAgencia){
        this.trataNroAgencia(nroAgencia);
    }
    public void setNroConta(String nroConta){
        this.trataNroConta(nroConta);
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public String getNome(){
        return this.nome;
    }
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public String paraString(){
        return  "Nome: " + this.nome + 
                "Nro da Agência: " + this.nroAgencia + 
                "Nro da Conta: " + this.nroConta + 
                "Saldo: " + this.saldo;
    }
    
    public void depositar(float x){
        this.saldo = this.saldo + x;
    }
    public void sacar(float x){
        this.saldo = this.saldo - x;
    }
    
    
}
