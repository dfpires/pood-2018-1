package fatec.exe3;
public class DiaNamorados extends CartaoWeb{
    public DiaNamorados() {
        super();
    }
    public DiaNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Cartão Web de dia dos namorados para " + this.destinatario);
    }
    
}
