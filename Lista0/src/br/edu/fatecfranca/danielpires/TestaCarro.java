package br.edu.fatecfranca.danielpires;

import javax.swing.JOptionPane;

public class TestaCarro {
    public static void main(String[] args) {
        // criando 3 objetos
        Carro obj1 = new Carro();
        Carro obj2 = new Carro();
        Carro obj3 = new Carro();
        
        Carro obj4 = new Carro(50, true);
         JOptionPane.showMessageDialog(null, "Obj4 " + obj4.paraString());
        
        // ligando os carros
        obj1.ligar();
        obj2.ligar();
        obj3.ligar();
        // acelerando os carros
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog("Acelerar obj1 de quanto?"));
        obj1.acelerar(input);
        input = Integer.parseInt(JOptionPane.showInputDialog("Acelerar obj2 de quanto?"));
        obj2.acelerar(input);
        input = Integer.parseInt(JOptionPane.showInputDialog("Acelerar obj3 de quanto?"));
        obj3.acelerar(input);
        // desaceler o carro
        input = Integer.parseInt(JOptionPane.showInputDialog("Frear obj1 de quanto?"));
        obj1.frear(input);
        input = Integer.parseInt(JOptionPane.showInputDialog("Frear obj2 de quanto?"));
        obj2.frear(input);
        input = Integer.parseInt(JOptionPane.showInputDialog("Frear obj3 de quanto?"));
        obj3.frear(input);
        
        JOptionPane.showMessageDialog(null, "Obj1 " + obj1.paraString());
        JOptionPane.showMessageDialog(null, "Obj2 " + obj2.paraString());
        JOptionPane.showMessageDialog(null, "Obj3 " + obj3.paraString());
    
    }   
}
