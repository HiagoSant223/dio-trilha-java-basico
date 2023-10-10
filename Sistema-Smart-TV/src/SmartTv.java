public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }
}