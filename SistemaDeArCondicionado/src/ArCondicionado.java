public class ArCondicionado {

    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() < 3) {
            System.out.println("Marca Invalida");
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            this.setTemperatura(16);
        } else {
            System.out.println("Problema no modo turbo");
        }
    }

    private boolean verificarCompressor() {
        int randomico = (int) (Math.random() * 10);
        if (randomico > 2) {
            System.out.println("Modo Turbo");
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Temperatura: " + temperatura +
                ", Status: " + (ligado ? "Ligado" : "Desligado");
    }
}
