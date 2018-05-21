package fatec.exe5;
public class Papel extends Recurso{
    // anula o método herdado da superclass (Recurso)
    @Override
    public String quemSouEu(){
        return "Papel";
    }
    @Override
    public String compara(Recurso recurso){
        // polimorfismo: objeto recurso é polimórfico
        // recurso é camaleão
        // recurso vai executar o quemSouEu() da pedra, do papel
        // ou da tesoura
        switch(recurso.quemSouEu()){
            case "Papel": return "Papel empata Papel";
            case "Pedra": return "Papel ganha Pedra";
            case "Tesoura": return "Papel perde Tesoura";
            default: return "Não é possível comparar";
        }
    }
}