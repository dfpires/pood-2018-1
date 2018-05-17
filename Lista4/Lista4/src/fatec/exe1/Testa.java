package fatec.exe1;
public class Testa {
    public static void polimorfismo(Animal animal){
        // objeto animal é um camaleão, é polimórfico
             System.out.println("\n " + animal.fala() + "\n " + animal.toString());   
    }
    public static void main(String[] args) {
      Animal animal = new Animal("pantera");
      polimorfismo(animal);
       
      Passaro passaro = new Passaro("tucano");
      polimorfismo(passaro);
      
      Mamifero mamifero = new Mamifero("veloz");
      polimorfismo(mamifero);
      
      BemTeVi bemTeVi = new BemTeVi("rapidinho"); 
      polimorfismo(bemTeVi);
      
      Papagaio papagaio = new Papagaio("Tite", "da o pé louro"); 
      polimorfismo(papagaio);
      
      Cachorro cachorro = new Cachorro("nervozinho", true);
      polimorfismo(cachorro);
      
      Vaca vaca = new Vaca("leiteira");
      polimorfismo(vaca);
                      
    }
    
}
