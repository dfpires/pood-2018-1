package br.edu.fatecfranca.exe2;
import java.util.ArrayList;
public class Onibus {
    private int numero;
    private ArrayList<Passageiro> passageiros;

    public Onibus() {
        passageiros = new ArrayList(); // aloca espaço na memória
    }

    public Onibus(int numero, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.passageiros = passageiros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiro(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        String saida = "Onibus{" + "numero=" + numero + ", passageiros=";
        // estrutura de repetição - varre o vetor passageiros
        for(Passageiro aux : passageiros){
            saida = saida + aux.toString() + "\n";
        }
        return saida;
    }
    
    public void adicionaPassageiro(Passageiro passageiro){
        this.passageiros.add(passageiro);
    }
    
    public boolean removePassageiro(Passageiro passageiro){
        return this.passageiros.remove(passageiro);
    }
    
    public boolean consultaPassageiro(Passageiro passageiro){
        return this.passageiros.contains(passageiro);
    }
    
    public boolean atualizaPassageiro(Passageiro atual, Passageiro novo){
        // encontra posição do atual
        int pos = this.passageiros.indexOf(atual);
        if (pos != -1){
            this.passageiros.set(pos, novo);
            return true;
        }
        else return false;
    }
}
