package fatec.exe4;
public class Testa {
    public static void polimorfico(Produto camaleao){
        // cameleao ora executa toString() da Radio, ora da Tv
        System.out.println(camaleao.toString()); //polimorfismo
    }
    public static void main(String[] args) {
        Radio radio = new Radio("FM", 96.5f, 123, 456);
        polimorfico(radio);
        Tv tv = new Tv(39, 789, 185);
        polimorfico(tv);
    }
    
}
