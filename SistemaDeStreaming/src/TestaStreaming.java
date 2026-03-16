public class TestaStreaming {

    public static void main(String[] args) {
        Streaming s1 = new Streaming("Kaique", "Familia");
        s1.assistirFilme("Vingadores");
        System.out.println(s1);
        s1.cancelarAssinatura();

        s1.assistirFilme("Interestelar");
        System.out.println(s1);
    }
}
