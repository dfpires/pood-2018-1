package fatec.exe4;
public class Produto {
    protected int serial, volume;
    protected String teste;
    public Produto() {
        this.serial = 0;
        this.volume = 0;
        this.teste = "não testado";
    }
    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        testaUnidade(teste);
    }
    public boolean testaUnidade(String teste){
        return false;
    }

    @Override
    public String toString() {
        return "Produto{" + "serial=" + serial + ", volume=" + volume + ", teste=" + teste + '}';
    }
    
    
}
