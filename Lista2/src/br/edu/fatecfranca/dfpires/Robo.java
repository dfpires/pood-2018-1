package br.edu.fatecfranca.dfpires;
public class Robo {
    private String movimento; // frente, trás, direita, esquerda, parado
    private int vel; // 0, 1, 2, 3
    
    public Robo(){
        this.movimento = "parado";
        this.vel = 0;
    }
    public Robo(String movimento, int vel){
        trataMovimento(movimento);
        trataVel(vel);
    }
    public void movimentarFrente(){
        this.movimento = "frente";
    }
    public void movimentarTraz(){
        this.movimento = "traz";
    }
    public void movimentarDireita(){
        this.movimento = "direita";
    }
    public void movimentarEsquerda(){
        this.movimento = "esquerda";
    }
    private void trataMovimento(String movimento){
        switch(movimento) {
            case "frente": this.movimento = movimento;
                        break;
            case "traz": this.movimento = movimento;
                        break; 
            case "direita": this.movimento = movimento;
                        break;
            case "esquerda": this.movimento = movimento;
                        break;            
            case "parado": this.movimento = movimento;
                        break;                        
            default: System.out.println("Movimento não permitido ");// não é alterada;
        }
    }
    public void setMovimento(String movimento){
        this.trataMovimento(movimento);
    }
    public String getMovimento(){
        return this.movimento;
    }
    public int getVel(){
        return this.vel;
    }
    private void trataVel(int vel){
         switch(vel) {
            case 0: this.vel = vel;
                        break;
            case 1: this.vel = vel;
                        break; 
            case 2: this.vel = vel;
                        break;
            case 3: this.vel = vel;
                        break;            
            default: System.out.println("Velocidade não permitido ");// não é alterada;
        }
    }
    public void setVel(int vel){
        trataVel(vel);
    }
}
