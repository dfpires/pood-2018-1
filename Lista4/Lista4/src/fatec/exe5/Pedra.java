package fatec.exe5;
public class Pedra extends Recurso{
    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    @Override
    public String compara(Recurso recurso){
        // polimorfismo: objeto recurso é polimórfico
        // recurso é camaleão
        // recurso vai executar o quemSouEu() da pedra, do papel
        // ou da tesoura
        switch(recurso.quemSouEu()){
            case "Papel": return "Pedra perde Papel";
            case "Pedra": return "Pedra empata Pedra";
            case "Tesoura": return "Pedra ganha Tesoura";
            default: return "Não é possível comparar";
        }
    }
}
