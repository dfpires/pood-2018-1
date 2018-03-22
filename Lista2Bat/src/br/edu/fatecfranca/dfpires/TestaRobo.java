
package br.edu.fatecfranca.dfpires;

import java.util.Scanner;

public class TestaRobo {

     public static void main(String[] args) {
       Robo obj = new Robo();
       
       obj.setMovimento("diagonal");
       
       System.out.println("Movimento do robo " + obj.getMovimento());
       System.out.println("Velocidade do robo " + obj.getVel());
       
       Robo obj2 = new Robo("diagonal", 12);
       System.out.println("Movimento do robo " + obj2.getMovimento());
       System.out.println("Velocidade do robo " + obj2.getVel());
       
       // obj.movimento = "frente";
       obj.setMovimento("frente");
       Scanner in = new Scanner(System.in);
       System.out.println("Informe movimento");
       obj.setMovimento(in.next());
       obj.movimentarFrente();
       obj.setVel(3);
       System.out.println("Movimento do robo " + obj.getMovimento());
       System.out.println("Velocidade do robo " + obj.getVel());
       
       System.out.println("Informe velocidade");
       obj.setVel(in.nextInt());
        System.out.println("Velocidade do robo " + obj.getVel());
    }
    
}
