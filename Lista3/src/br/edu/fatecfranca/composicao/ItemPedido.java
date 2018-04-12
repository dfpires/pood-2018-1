package br.edu.fatecfranca.composicao;
public class ItemPedido {
    private String descricao;
    private float valor;
    private String tipo;

    public ItemPedido() {
    }

    public ItemPedido(String descricao, float valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "descricao=" + descricao + ", valor=" + valor + ", tipo=" + tipo + '}';
    }
    
}
