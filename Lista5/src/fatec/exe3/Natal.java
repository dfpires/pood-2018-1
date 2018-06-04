
package fatec.exe3;


public class Natal extends CartaoWeb{

    public Natal() {
    }

    public Natal(String destinatario) {
        super(destinatario);
    }
            
    @Override
    public void showMessage() {
         System.out.println("Cartão Web de natal para " + this.destinatario);
    }
}
