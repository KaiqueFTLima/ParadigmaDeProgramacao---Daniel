public class Junior extends Desenvolvedor {

    private String mentor;

    public Junior(){
        super(); // chama o construtor da super classe
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override // anulaçao de método
    public void codar(){
        System.out.println("Junior desenvolvendo codigo com mentoria de " + this.mentor);
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }
}
