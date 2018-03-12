package br.edu.fatecfranca.nome.exe3;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;
    // construtores
    public Produto(){
        this.id = 0;
        this.qtde = 0;
        this.preco = 0;
        this.descricao = "sem descrição";
    }
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
        this.descricao = descricao;
    }
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    public void vender(int x){
        this.qtde = this.qtde - x;
    }
    public void subir(float x){
        this.preco = this.preco + x;
    }
    public void descer(float x){
        this.preco = this.preco - x;
    }
    public String mostra(){
        return "Id: " + this.id + " Qtde: " + this.qtde +
                " Preço: " + this.preco + " Descrição: " + 
                this.descricao;
    }
}
