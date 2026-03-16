public class TestaArCondicionado {

    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado("Samsung", "Turbo max", 22, false);
        ar1.setTemperatura(29);
        ar1.ativarModoTurbo();
        System.out.println(ar1);

    }
}
