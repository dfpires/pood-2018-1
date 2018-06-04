
package fatec.exe1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TestaProva {

    
    public static void main(String[] args) {
        // cria ArrayList
         ArrayList<Funcionario> funcionarios = new ArrayList();
         // cria funcionarios e os adiciona ao ArrayList
         Gerente gerente = new Gerente("Pedro", "123", 3000);
         funcionarios.add(gerente);
         Assistente assistente = new Assistente("Paulo", "456", 2000);
         funcionarios.add(assistente);
         Vendedor vendedor = new Vendedor("José", "456", 2000, 10);
         funcionarios.add(vendedor);
         // gera a folha
         float folha = 0;
        for(Funcionario ponteiro: funcionarios){
            folha = folha + ponteiro.calculaSalario(); // polimorfismo
        }
        JOptionPane.showMessageDialog(null, folha);
            
    }
    
}
