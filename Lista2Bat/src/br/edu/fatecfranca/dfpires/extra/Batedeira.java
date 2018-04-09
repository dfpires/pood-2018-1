package br.edu.fatecfranca.dfpires.extra;
public class Batedeira {
    private int status; // 0 ou 1
    private int velocidade; // 0, 5, 10, 15, 20
    private static String marca;
    // construtores
     // método de instância
    public Batedeira(){
        this.status = 0;
        this.velocidade = 0;
    }
     // método de instância
    public Batedeira(int status, int velocidade){
        this.trataStatus(status);
        this.trataVelocidade(velocidade);
    }
     // método de instância
    private void trataStatus(int status){
        switch(status){
            case 0: this.status = 0;
                    break;
            case 1: this.status = 1;
                    break;        
            default: System.out.println("Status não existe");        
        }
    }
     // método de instância
    public void setStatus(int status){
        trataStatus(status);
    }
     // método de instância
    private void trataVelocidade(int velocidade){
        switch(velocidade){
            case 0: this.velocidade = 0;
                    break;
            case 5: this.velocidade = 5;
                    break;        
            case 10: this.velocidade = 10;
                    break;               
            case 15: this.velocidade = 15;
                    break;        
            case 20: this.velocidade = 20;
                    break;                
            default: System.out.println("Velocidade não existe");        
        }
    }
     // método de instância
    public void setVelocidade(int velocidade){
        trataVelocidade(velocidade);
    }
     // método de instância
    public void aumentaVel(int x){
        this.trataVelocidade(this.velocidade + x);
    }
 // método de instância
    public int getStatus() {
        return this.status;
    }
 // método de instância
    public int getVelocidade() {
        return this.velocidade;
    }
    // método de instância
    public void desligar(){
        if (this.velocidade == 0)
            this.status = 0;
        else System.out.println("Não pode ser desligada");
    }
    public static Batedeira menor(Batedeira b1, Batedeira b2){
        if (b1.velocidade < b2.velocidade){
            return b1;
        }
        else return b2;
    }

    @Override
    public String toString() {
        return "Batedeira{" + "status=" + status + ", velocidade=" + 
                velocidade + " marca = " + Batedeira.marca + '}';
    }

    public static String getMarca() {
        return Batedeira.marca;
    }

    public static void setMarca(String marca) {
        Batedeira.marca = marca;
    }
    
    
}
