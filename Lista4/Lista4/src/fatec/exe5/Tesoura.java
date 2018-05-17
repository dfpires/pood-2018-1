
package fatec.exe5;

public class Tesoura extends Recurso{
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }
    @Override
    public String compara(Recurso recurso){
         // polimorfismo: objeto recurso é polimórfico
        // recurso é camaleão
        // recurso vai executar o quemSouEu() da pedra, do papel
        // ou da tesoura
        switch(recurso.quemSouEu()){
            case "Papel": return "Tesoura ganha Papel";
            case "Pedra": return "Tesoura perde Pedra";
            case "Tesoura": return "Tesoura empata Tesoura";
            default: return "Não é possível comparar";
        }
    }
}
