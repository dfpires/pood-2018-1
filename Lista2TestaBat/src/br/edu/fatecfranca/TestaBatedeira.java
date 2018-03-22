
package br.edu.fatecfranca;

import br.edu.fatecfranca.dfpires.extra.Batedeira;

public class TestaBatedeira {

    public static void main(String[] args) {
        Batedeira obj = new Batedeira();
        
        obj.setStatus(0);
        obj.setVelocidade(0);
        
        obj.setStatus(1);
        obj.setVelocidade(10);
        
        obj.aumentaVel(3);
        
       // Batedeira obj2 = new Batedeira(6, 200);
    }
    
}
