public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " +smartTv.ligado);
        System.out.println("Canal atual? " +smartTv.canal);
        System.out.println("Volume atual? " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status ==> TV está ligada? " +smartTv.ligado);

        smartTv.desligar();
        System.out.println("Novo status ==> TV está ligada? " +smartTv.ligado);

        smartTv.aumentarCanal();
        System.out.println("Novo status ==> Canal atual? " +smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Novo status ==> Volume atual? " +smartTv.volume);
    }
}
