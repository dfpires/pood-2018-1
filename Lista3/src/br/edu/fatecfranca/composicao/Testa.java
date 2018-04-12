
package br.edu.fatecfranca.composicao;


public class Testa {

      public static void main(String[] args) {
        Pedido p = new Pedido();
        p.setCodigo(123);
        p.setData("12/04/2018");
        p.adicionaItemPedido("XBOX One", 1200, "console");
        p.adicionaItemPedido("PS4", 1600, "console");
        p.setValorTotal();
        System.out.println(p.toString());
    }
    
}
