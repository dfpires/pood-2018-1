
package fatec.exe3;

import java.util.ArrayList;

public class Testa {
    
    public static void main(String[] args) {
    
        ArrayList<CartaoWeb> cartoes = new ArrayList();
        cartoes.add(new DiaNamorados("José"));
        cartoes.add(new Natal("Pedro"));
        cartoes.add(new Aniversario("João"));
        
        for(CartaoWeb ponteiro: cartoes){
            ponteiro.showMessage();
        }
    }
    
}
