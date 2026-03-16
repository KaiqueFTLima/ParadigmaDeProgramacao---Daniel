import java.util.Date;

public class TestaTodoParte {

    public static void main(String[] args){

        // cria um objeto da classe Cliente independente
        // cria o objeto-parte
        Cliente s0 = new Cliente();
        Cliente s1 = new Cliente(123, "kaique ", "214.412.543-54 ", "djksajdklas ");


        Pedido p0 = new Pedido();
        Pedido p1 = new Pedido(12, new Date(), s1);

        System.out.println(p1);
    }
}
