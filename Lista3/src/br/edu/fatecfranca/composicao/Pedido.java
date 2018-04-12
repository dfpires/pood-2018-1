package br.edu.fatecfranca.composicao;

import java.util.ArrayList;

public class Pedido {
    private int codigo;
    private float valorTotal;
    private String data;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList();
    }

    public Pedido(int codigo, float valorTotal, String data) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.data = data;
        itens = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        float aux = 0;
        for (ItemPedido item: this.itens) {
            aux = aux + item.getValor(); 
        }
        this.valorTotal = aux;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", valorTotal=" + valorTotal + ", data=" + data + ", itens=" + itens + '}';
    }
    public void adicionaItemPedido(String descricao, float valor, String tipo){
        this.itens.add(new ItemPedido(descricao, valor, tipo));
    }
}
