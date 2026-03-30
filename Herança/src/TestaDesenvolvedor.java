import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bonus " + camaleao.calcularBonus());
    }

    public static void main(String[] args){
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);


        Pleno pl1 = new Pleno("Beltrano", "Java", 6000, 5);
        exibir(pl1);

        Senior sr1 = new Senior("Ciclano", "Java", 8000, 2000);
        exibir(sr1);

        ArrayList<Desenvolvedor> empresa = new ArrayList<Desenvolvedor>();
            empresa.add(jr1);
            empresa.add(pl1);
            empresa.add(sr1);
    }
}
