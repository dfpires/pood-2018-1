
package br.edu.fatecfranca.dfpires.extra;


public class Testa {

   
    public static void main(String[] args) {
       Batedeira b1 = new Batedeira(1, 5);
       Batedeira b2 = new Batedeira(1, 10);
       
       b1.aumentaVel(5); // chama método de instância
       Batedeira.setMarca("Wallita");
       b2.aumentaVel(5); // chama método de instância
       Batedeira b3 = Batedeira.menor(b1, b2); // chama método de classe
       
       System.out.println(b1.toString());
       System.out.println(b2.toString());
       System.out.println(b3.toString());
            
    }
    
}
