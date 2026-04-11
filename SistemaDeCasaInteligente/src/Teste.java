public class Teste {
    public static void main(String[] args) {

        // Teste Fechadura
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");

        fechadura.validarAcesso("1111"); // errado
        fechadura.validarAcesso("1234"); // correto
        fechadura.desligar(); // tranca novamente

        System.out.println("-------------------");

        // Teste Termostato
        TermostatoSmart termostato = new TermostatoSmart();

        termostato.lerTemperatura(); // desligado
        termostato.ligar();
        termostato.lerTemperatura(); // funcionando
        termostato.desligar();
    }
}