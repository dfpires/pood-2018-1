/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.nome.exe3;

/**
 *
 * @author Daniel.Pires
 */
public class TestaProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.id = 11;
        prod1.qtde = 5;
        prod1.descricao = "Chuteira";
        prod1.preco = 70;
        
        Produto prod2 = new Produto(22,10,"Bola de Basquete",50);
        
        // brincando com os produtos
        prod1.comprar(30);
        prod1.vender(4);
        
        prod2.subir(3);
        prod2.descer(4);
        
        prod1.subir(2);
        prod1.descer(4);
        
        prod2.comprar(5);
        prod2.vender(4);
        
        System.out.println(prod1.mostra());
        System.out.println(prod2.mostra());
        
    }
    
}
