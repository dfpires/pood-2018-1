
package fatec.exe1;

/**
 *
 * @author Daniel.Pires
 */
public class PessoaBrasil extends Pessoa implements Cidadao, Contribuinte{

    private String rg;
    private String cpf;

    public PessoaBrasil(String rg, String cpf, int idade) {
        super(idade);
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaBrasil() {
        super();
    }
    
    @Override
    public String vota() {
        if (this.idade >= 16){
            return "Brasileiro votando ";
        }
        else{
                return "Brasileiro não vota ";
        }
    }

    @Override
    public String tiraIdentidade() {
        return "Brasileiro tirando RG e CPF no PoupaTempo " + this.rg + " " + this.cpf;
    }

    @Override
    public String pagaIr() {
        if (this.idade >= 18){
            return "Brasileiro pagando 27.5% de IR ";
        }
        else {
            return "Não pode pagar IR";
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
}
