public class TestaAcademico {
    public static void main(String[] args){

        Aluno al1 = new Aluno(1, 123, "Kaique");
        Aluno al2 = new Aluno(2, 1234, "Lesk");

        Disciplina dis1 = new Disciplina(1, "Programação Orientada a Objetos", "Daniel");

        dis1.matricularAluno(al1);
        dis1.matricularAluno(al2);

        dis1.criarAvaliacao(1, "Prova Semestral");

        Avaliacao prova = dis1.getAvaliacoes().get(0);

        prova.adicionarQuestao(1, "Explicar concenito de classes e objetos:", 2.0f);
        prova.adicionarQuestao(2, "O que é encapsulamento?", 3.0f);
        prova.adicionarQuestao(3, "Explique como instanciar um objeto:", 5.0f);

        System.out.println(dis1);

    }
}