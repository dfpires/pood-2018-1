package br.edu.fatecfranca.exe0;
public class Testa {
    public static void main(String[] args) {
            ContaCorrente cc1 = new ContaCorrente();
            cc1.setSaldo(10);
            System.out.println(cc1.getSaldo());
            ContaCorrente cc2 = new ContaCorrente("123-4", "234-5", 3000);
        CartaoDebito cd1 = new CartaoDebito(1111, 987, "03/2022", "Visa", "André", cc2);
        CartaoDebito cd2 = new CartaoDebito();
            cd2.setNumero(2222);
            cd2.setBandeira("Mastercard");
            cd2.setCv(765);
            cd2.setNome("Leonardo");
            cd2.setValidade("04/2024");
            cd2.setConta(cc1);
 
            cd2.getConta().getSaldo();
            
            System.out.println("Cartão de débito 1 " + cd1.toString());
            System.out.println("Cartão de débito 2 " + cd2.toString());
    }
 }
