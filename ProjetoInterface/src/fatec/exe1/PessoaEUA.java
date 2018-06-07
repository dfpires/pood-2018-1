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
public class PessoaEUA extends Pessoa implements Cidadao, Contribuinte{

 private int SSN;

    public PessoaEUA(int SSN, int idade) {
        super(idade);
        this.SSN = SSN;
    }

    public PessoaEUA() {
        super();
    }
 
    @Override
    public String vota() {
         if (this.idade >= 18){
            return "Americano votando ";
        }
        else{
                return "Americano não vota ";
        }
    }

    @Override
    public String tiraIdentidade() {
         return "Americano tirando SSN no Departamento de Cidadão " + this.SSN;
    }

    @Override
    public String pagaIr() {
         if (this.idade >= 21){
            return "Americano pagando 35% de IR ";
        }
        else {
            return "Não pode pagar IR";
        }
    }

   
    
}
