package fatec.exe0;
public class Testa {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNome("Alexandre");
        cc.setNro(123);
        cc.setSaldo(100);
        
        Especial es = new Especial();
        es.setNome("André");
        es.setNro(456);
        es.setSaldo(5000);
        es.setLimite(1000);
        
        if (es.saque(50) == true){
            System.out.println("Saque com sucesso");
        }
        else System.out.println("Saque com sucesso");
        
        Poupanca po = new Poupanca();
        po.setNome("Mateus");
        po.setNro(987);
        po.setSaldo(8000);
        po.setJuros(0.45f);
        
        System.out.println(cc.toString());
        System.out.println(es.toString());
        System.out.println(po.toString());
        
    }
}
