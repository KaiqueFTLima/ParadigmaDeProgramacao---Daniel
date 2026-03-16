public class Carro {
    // variaveis ou propriedades ou atributos

    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade;// float é um tipo de dado primitivo
    public boolean motor;//boolean é um tipo de dado primitivo

    // metodo construtor tem o mesmo nome da classe
    //construtor vazio padrão
    public Carro(){
    }

    //construtor com parametros
    public Carro(String marca, String modelo, float velocidade, boolean motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    //ligar carro
    public void LigarCarro() {
        if (!this.motor){
            this.motor = true;
            System.out.println("Motor ligado!");
        }
        else {
            System.out.println("Motor ja esta ligado!");
        }
    }

    //desligar carro
    public void DesligarCarro() {
        if (this.motor && this.velocidade >= 0){
            this.motor = false;
            System.out.println("Motor desligado!");
        }
        else{
            System.out.println("Motor ja esta desligado!");
        }
    }

    public void Acelerar(float x) {
        if (this.motor) {
            this.velocidade += x;
            System.out.println("Nova velocidade: " + this.velocidade);
        }
    }

    public void Desacelerar(float x) {
        if (this.motor && this.velocidade - x >= 0) {
            this.velocidade -= x;
            System.out.println("Nova velocidade: " + this.velocidade);
        }
    }

    //Metodo que converte o objeto em String
    public String toString(){
        //this representa o objeto que chama o metodo
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }
}
