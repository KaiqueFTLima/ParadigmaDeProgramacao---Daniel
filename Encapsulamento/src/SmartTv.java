public class SmartTv {

    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv() {
    }

    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca); // para não perder o encapsulamento
        this.setModelo(modelo); // para não perder o encapsulamento
        this.setVolume(volume); // para não perder o encapsulamento
        this.conectadaInternet = false;
    }

    // setter do volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume inválido");
        }
    }

    // getter do volume
    public int getVolume() {
        return this.volume;
    }

    // getter da marca
    public String getMarca() {
        return marca;
    }

    // setter da marca
    public void setMarca(String marca) {
        if (marca.length() < 30) {
            this.marca = marca;
        } else {
            System.out.println("Marca invalida");
        }
    }

    // getter modelo
    public String getModelo() {
        return modelo;
    }

    // setter modelo
    public void setModelo(String modelo) {
        // todo modelo tem que iniciar com a letra maiuscula
        if (Character.isUpperCase(modelo.charAt(0))) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo invalido");
        }
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public boolean isConectadaInternet() {
        return this.conectadaInternet;
    }

    //abrir Youtube
    public void abrirYoutube() {
        //verifica se tem internet
        if (this.verificaInternet()) {
            System.out.println("Abrindo Youtube");
        } else {
            System.out.println("Youtube não pode ser aberto, estamos sem internet");
        }
    }

    // aumentar o volume em x
    public void aumentarVolume(int x) {
        this.setVolume(this.volume + x);
    }


    // diminuir o volume em x
    public void diminuirVolume(int x) {
        this.setVolume(this.volume - x);
    }


    private boolean verificaInternet() {
        System.out.println("Buscando sinal de Wi-Fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP no roteador");
        //50% de chance de conectar e 50% de chance de não conectar
        int randomico = (int) (Math.random() * 10);
        if (randomico < 5) {
            System.out.println("Conectou na internet");
            return true;
        } else {
            System.out.println("Problema na conexão");
            return false;
        }
    }
}
