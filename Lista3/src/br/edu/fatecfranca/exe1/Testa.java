package br.edu.fatecfranca.exe1;
public class Testa {
    public static void main(String[] args) {
        // maneira 1
        Voo v1 = new Voo("SP", "42-x");
        Reserva r1 = new Reserva(972, v1);
        Passageiro p1 = new Passageiro("Edigleison", r1);
        
        // maneira 2
        Voo v2 = new Voo();
        v2.setDestino("SP");
        v2.setNumero("42-x");
        
        Reserva r2 = new Reserva();
        r2.setCodigo(972);
        r2.setVoo(v2); // atenção
        
        Passageiro p2 = new Passageiro();
        p2.setNome("Edigleison");
        p2.setReserva(r2); // atenção
        
        System.out.println(p2.toString());
        
        // maneira 3
        Voo v3 = new Voo("SP", "42-x");
        Reserva r3 = new Reserva();
        r3.setCodigo(972);
        Passageiro p3 = new Passageiro();
        p3.setNome("Edigleison");
        p3.setReserva(r3); // atenção
        p3.setVoo(v3); // atenção
        
        System.out.println(p3.toString());
    }
    
    
}
