package fatec.exe1;
public class Vendedor extends Funcionario{
    private float comissao;
    public Vendedor(){
        super();
        this.comissao = 0;
    }    
    public Vendedor(String nome, String matricula, float salarioBase, float comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    @Override
    public float calculaSalario() {
       return this.salarioBase + this.comissao*this.salarioBase/100; 
    }
    @Override
    public String toString() {
        return "Vendedor{" + "comissao=" + comissao + 
                super.toString() + '}';
    }
    
}
