package fatec.exe1;
public class Testa {
    public static void main(String[] args) {
      Animal animal = new Animal("pantera");
      System.out.println("\n " + animal.fala() + "\n " + animal.toString());
      
      Passaro passaro = new Passaro("tucano");
      System.out.println("\n " + passaro.fala() + "\n " + passaro.toString());
      
      Mamifero mamifero = new Mamifero("veloz");
      System.out.println("\n " + mamifero.fala() + "\n " + mamifero.toString());
      
      BemTeVi bemTeVi = new BemTeVi("rapidinho"); 
      System.out.println("\n " + bemTeVi.fala() + "\n " + bemTeVi.toString());
      
      Papagaio papagaio = new Papagaio("Tite", "da o pé louro"); 
      System.out.println("\n " + papagaio.fala() + "\n " + papagaio.toString());
      
      Cachorro cachorro = new Cachorro("nervozinho", true);
      System.out.println("\n " + cachorro.fala() + "\n " + cachorro.toString());
      
      Vaca vaca = new Vaca("leiteira");
      System.out.println("\n " + vaca.fala() + "\n " + vaca.toString());                                
                      
    }
    
}
