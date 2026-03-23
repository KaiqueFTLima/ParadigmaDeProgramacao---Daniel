public class Placar {

    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Metodo para registrar pontos (com validação de time e tipo)
    public void registrarPonto(String time, int tipo) {

        if (periodoQuarto > 4) {
            System.out.println("O jogo já terminou!");
            return;
        }

        if (tipo != 1 && tipo != 2 && tipo != 3) {
            System.out.println("Tipo de ponto inválido!");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        }
        else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        }
        else {
            System.out.println("Time inválido! Use 'casa' ou 'visitante'.");
        }
    }

    // Metodo para avançar o tempo de jogo
    public void proximoQuarto() {

        if (periodoQuarto < 4) {
            periodoQuarto++;
            System.out.println("Iniciando o " + periodoQuarto + "º quarto.");
        }
        else if (periodoQuarto == 4) {
            periodoQuarto++;
            System.out.println("O jogo terminou!");
        }
        else {
            System.out.println("O jogo já está finalizado.");
        }
    }

    @Override
    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] "
                + nomeTimeVisitante + " - Período: "
                + (periodoQuarto > 4 ? "Finalizado" : periodoQuarto);
    }
}