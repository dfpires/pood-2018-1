package br.edu.fatecfranca.danielpires;
public class Carro {
    // declaração das variáveis
    public int velAtual;
    public boolean statusMotor;
    // declaração dos métodos
    // this representa o objeto que chama o método
    // construtores
    public Carro(){ // valores padrão - default
        this.velAtual = 0;
        this.statusMotor = false;
    }
    public Carro(int velAtual, boolean statusMotor){
        this.velAtual = velAtual;
        this.statusMotor = statusMotor;
    }
    // liga o carro
    public void ligar(){
        this.statusMotor = true;
        this.velAtual = 0;
    }
    // deliga o carro
    public void desligar(){
        this.statusMotor = false;
        this.velAtual = 0;
    }
    // acelerar o carro
    public void acelerar(int x){
        if (this.statusMotor){
            this.velAtual = this.velAtual + x;
        }
    }
    // frear o carro
    public void frear(int x){
        if (this.statusMotor){
            this.velAtual = this.velAtual - x;
        }
    }
    // converte para String o objeto
    public String paraString(){
        String aux = (this.statusMotor) ? "ligado" : "desligado";
        return " Velocidade atual " + this.velAtual + " Motor " + aux;
    }
}
