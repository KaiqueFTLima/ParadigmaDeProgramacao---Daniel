public class TestaCarro {

    public static void main(String[] args){
        //Instanciar objeto obj1
        Carro obj1 = new Carro("McLaren", "P1", 0, false);
        System.out.println(obj1.toString());
        obj1.LigarCarro();
        System.out.println(obj1.toString());
        obj1.Acelerar(100);
        obj1.Desacelerar(80);
        System.out.println(obj1.toString());

        obj1.DesligarCarro();
        System.out.println(obj1.toString());

        //Instanciar objeto obj2
        Carro obj2 = new Carro("Fiat", "Uno", 0, false);
        System.out.println(obj2.toString());
        obj2.LigarCarro();
        System.out.println(obj2.toString());
        obj2.Acelerar(100);
        obj2.Desacelerar(80);
        System.out.println(obj2 .toString());

        obj2.DesligarCarro();
        System.out.println(obj2.toString());
    }
}
