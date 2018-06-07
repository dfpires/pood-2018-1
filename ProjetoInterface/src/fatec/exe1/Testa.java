
package fatec.exe1;


public class Testa {

    
    public static void main(String[] args) {
       Cidadao camaleao;
       
       camaleao = new PessoaBrasil("1234-2", "56465-45", 20);
       
       System.out.println(camaleao.tiraIdentidade());
       
        camaleao = new PessoaEUA(33333, 15);
       
        System.out.println(camaleao.tiraIdentidade());
       
    
    }
    
}
