public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    Drone(){
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.setEmVoo(emVoo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura >= 0 && altura <= 120) {
            this.altura = altura;
        }
        else {
            System.out.println("Altura invalida");
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar(){
        if (this.bateria >= 20) {
            if (testarMotores()) {
                this.emVoo = true;
                this.setAltura(2);
            }
        }
        else {
            System.out.println("Sem bateria");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10);
        if (randomico > 8) {
            System.out.println("Conectou na internet");
            return true;
        } else {
            System.out.println("Problema na conexão");
            return false;
        }
    }

    public void subir(float x) {

        if (emVoo) {
            setAltura(altura + x);
        } else {
            System.out.println("O drone precisa decolar primeiro.");
        }

    }

    public void descer(float x) {

        if (emVoo) {
            setAltura(altura - x);
        } else {
            System.out.println("O drone precisa decolar primeiro.");
        }

    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Altura: " + altura +
                "m, Bateria: " + bateria + "%" +
                ", Status: " + (emVoo ? "Em voo" : "No solo");
    }

}
