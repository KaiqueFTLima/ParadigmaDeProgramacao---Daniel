public class Pleno extends Desenvolvedor{

    private int projetosEntregues;

    public Pleno(){
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntregues){
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = projetosEntregues;
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetosEntregues=" + projetosEntregues +
                '}';
    }

    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo codigo e fazendo code Review");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.15f;
    }
}
