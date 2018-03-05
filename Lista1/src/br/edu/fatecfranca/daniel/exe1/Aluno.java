package br.edu.fatecfranca.daniel.exe1;
public class Aluno {
    // variáveis
    public String nome;
    public float p1, p2;
    public int numero, idade;
    // construtores - inicializa objetos
    public Aluno(){
        this.nome = "";
        this.p1 = 0;
        this.p2 = 0;
        this.numero = 0;
        this.idade = 0;
    }
    public Aluno(String nome, float p1, float p2, int numero, int idade){
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.numero = numero;
        this.idade = idade;
    }
    // calcula e retorna nota final
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    // retorna os dados do aluno
    public String dadosAluno(){
        return "Nome: " + this.nome + " Número: " + this.numero + " Idade " + this.idade;
    }
    // verifica e retorna se aluno passou
    public String passou(){
        return notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }
}   
