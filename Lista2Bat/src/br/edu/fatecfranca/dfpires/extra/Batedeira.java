package br.edu.fatecfranca.dfpires.extra;
public class Batedeira {
    private int status; // 0 ou 1
    private int velocidade; // 0, 5, 10, 15, 20
    // construtores
    public Batedeira(){
        this.status = 0;
        this.velocidade = 0;
    }
    public Batedeira(int status, int velocidade){
        this.trataStatus(status);
        this.trataVelocidade(velocidade);
    }
    private void trataStatus(int status){
        switch(status){
            case 0: this.status = 0;
                    break;
            case 1: this.status = 1;
                    break;        
            default: System.out.println("Status não existe");        
        }
    }
    public void setStatus(int status){
        trataStatus(status);
    }
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
    public void setVelocidade(int velocidade){
        trataVelocidade(velocidade);
    }
    
    public void aumentaVel(int x){
        this.trataVelocidade(this.velocidade + x);
    }
}
