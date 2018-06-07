/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.exe1;

/**
 *
 * @author Daniel.Pires
 */
public class Pessoa {
    protected int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }
    public Pessoa() {
        this.idade = 0;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + '}';
    }
    
}
