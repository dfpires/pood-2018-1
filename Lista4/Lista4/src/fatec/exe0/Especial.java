package fatec.exe0;
public class Especial extends ContaCorrente{
    private float limite;
    public Especial(){
        super();
        this.limite = 0;
    }
    public Especial(int nro, float saldo, String nome, float limite){
       super(nro, saldo, nome);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Especial{" + "limite=" + limite + '}' + 
                super.toString();
    }
    
    public boolean saque(float x){
        if (this.saldo - x + this.limite >= 0){
            this.saldo = this.saldo - x;
            return true;
        }
        else return false;
    }
}
