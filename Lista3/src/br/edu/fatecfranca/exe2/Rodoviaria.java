package br.edu.fatecfranca.exe2;
import java.util.ArrayList;

public class Rodoviaria {
    private String nome, cidade;
    private ArrayList<Onibus> onibus;

    public Rodoviaria() {
        this.nome = "sem valor";
        this.cidade = "sem valor";
        this.onibus = new ArrayList(); // aloca espaço na memória
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> onibus) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = onibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        String saida = "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", onibus="; 
        for(Onibus aux: this.onibus){
            saida = saida + aux.toString() + "\n";
        }
        return saida;
    }
    
     public void adicionaOnibus(Onibus onibus){
        this.onibus.add(onibus);
    }
    
    public boolean removeOnibus(Onibus onibus){
        return this.onibus.remove(onibus);
    }
    
    public boolean consultaOnibus(Onibus onibus){
        return this.onibus.contains(onibus);
    }
    
    public boolean atualizaOnibus(Onibus atual, Onibus novo){
        // encontra posição do atual
        int pos = this.onibus.indexOf(atual);
        if (pos != -1){
            this.onibus.set(pos, novo);
            return true;
        }
        else return false;
    }
    
    public void adicionaPassageiro(Passageiro passageiro, Onibus onibus){
        if (this.consultaOnibus(onibus)){
            onibus.adicionaPassageiro(passageiro);
        }
        else System.out.println("Ônibus não existe");
    }
}
