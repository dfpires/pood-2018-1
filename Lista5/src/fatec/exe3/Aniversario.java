
package fatec.exe3;

public class Aniversario extends CartaoWeb{

    public Aniversario() {
    }

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
         System.out.println("Cartão Web de aniversário para " + this.destinatario);
    }
    
    
}
