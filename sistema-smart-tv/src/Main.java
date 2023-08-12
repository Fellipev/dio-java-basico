public class Main {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv(12, 30);

        System.out.println(tv.toString());

        System.out.println("\nVou ligar a Tv\n");
        tv.setLigada(true);
        tv.mudarVolume(100);
        tv.mudarCanal(300);
        System.out.println(tv.toString());


        /* Codigos para gerar minhas 2 exceptions personalizadas
        tv.mudarVolume(-1);
        tv.mudarCanal(301);
        */

    }
}
