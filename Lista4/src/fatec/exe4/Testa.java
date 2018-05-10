package fatec.exe4;
public class Testa {
    public static void polimorfico(Produto produto){
        System.out.println(produto.toString());
    }
    public static void main(String[] args) {
        Radio radio = new Radio("FM", 96.5f, 123, 456);
        polimorfico(radio);
        Tv tv = new Tv(39, 789, 185);
        polimorfico(tv);
    }
    
}
