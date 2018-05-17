package fatec.exe0;
public class Poupanca extends ContaCorrente{
    private float juros;
      public Poupanca(){
        super();
        this.juros = 0;
    }
    public Poupanca(int nro, float saldo, String nome, float juros){
       super(nro, saldo, nome);
       this.juros = juros;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "Poupanca{" + "juros=" + juros + '}' + 
                super.toString();
    }
    
    
}
