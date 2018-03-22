package br.edu.fatecfranca;
import br.edu.fatecfranca.dfpires.exe1.Cliente;
public class TestaCliente {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        cli1.setNome("Alexandre");
        cli1.setNroAgencia("3458-9");
        cli1.setNroConta("234984-3");
        cli1.setSaldo(300);
        Cliente cli2 = new Cliente("234566-7", "4565-4", "Marcos", 1000);
        cli2.depositar(11);
        cli2.sacar(333);
        cli1.depositar(44);
        cli1.sacar(55);
        
        System.out.println(cli1.paraString());
        System.out.println(cli2.paraString());
        
    }
    
}
