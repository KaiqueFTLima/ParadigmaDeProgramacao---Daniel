
public class TestaSmartTv {

    public static void main(String[] args) {
        // cria uma instancia de smartTV
        SmartTv s1 = new SmartTv("LG", "QLED de 50 polegadas", 0);
        //s1.setVolume(-40);
        //s1.setVolume(130);
        //s1.setVolume(50);

        s1.aumentarVolume(30);
        System.out.println("Volume de s1 " + s1.getVolume());
        //s1.abrirYoutube();


        SmartTv s2 = new SmartTv("Samsung", "QLED de 45 polegadas", 0);
        //s2.abrirYoutube();
        s2.aumentarVolume(50);
        System.out.println("Volume de s2 " + s2.getVolume());

        SmartTv s3 = new SmartTv("Phillips", "Q 55 polegadas", 0);
        //s3.abrirYoutube();
        s3.aumentarVolume(10);
        System.out.println("Volume de s3 " + s3.getVolume());

    }
}
