package br.edu.fatecfranca.daniel.exe1;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade"));
        obj1.nome = "Marcos";
        obj1.numero = 123;
        obj1.p1 = 4;
        obj1.p2 = 7.5f;
        JOptionPane.showMessageDialog(null, obj1.dadosAluno() + " Média: " + 
                obj1.notaFinal() + " " + obj1.passou());
        
        Aluno obj2 = new Aluno("Bruno", 7, 9.5f, 456, 21);
        JOptionPane.showMessageDialog(null, obj2.dadosAluno() + " Média: " + 
                obj2.notaFinal() + " " + obj2.passou());
        
    }
}
