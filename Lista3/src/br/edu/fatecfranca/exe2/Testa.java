package br.edu.fatecfranca.exe2;
public class Testa {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("Eduardo", 10);
        Passageiro p2 = new Passageiro("Edigleison", 12);
        Passageiro p3 = new Passageiro("Alexandre", 14);
        Passageiro p4 = new Passageiro("Gabriela", 16);
        
        Onibus o1 = new Onibus();
        o1.setNumero(236);
        o1.adicionaPassageiro(p1);
        o1.adicionaPassageiro(p2);
        
        Onibus o2 = new Onibus();
        o2.setNumero(632);
        o2.adicionaPassageiro(p3);
        o2.adicionaPassageiro(p4);
        
        Rodoviaria rodo = new Rodoviaria();
        rodo.setNome("Rodo de Franca City");
        rodo.setCidade("Franca");
        rodo.adicionaOnibus(o1);
        rodo.adicionaOnibus(o2);
        
      //  System.out.println(rodo.toString());
        
        //System.out.println(o1.toString());
     
       // o1.removePassageiro(p2);
       // System.out.println(o1.toString());
        
       // System.out.println(o1.consultaPassageiro(p4));
       // System.out.println(o1.consultaPassageiro(p2));
        
        Passageiro p5 = new Passageiro("Leonardo", 18);
       // o1.atualizaPassageiro(p2, p5);
      //  System.out.println(o1.toString());
        rodo.adicionaPassageiro(p5, o2);
         System.out.println(rodo.toString());
    }
}
