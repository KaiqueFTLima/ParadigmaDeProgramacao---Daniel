import java.util.Objects;

public class Streaming {

    private String usuario;
    private String plano;
    private double mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    public Streaming() {
    }

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        if (Objects.equals(this.plano, "Básico")) {
            this.mensalidade = 25.90;
        } else if (Objects.equals(this.plano, "Premium")) {
            this.mensalidade = 45.90;
        } else if (Objects.equals(this.plano, "Familia")) {
            this.mensalidade = 60.90;
        }
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getUltimoFilmeAssistido() {
        return ultimoFilmeAssistido;
    }

    public void setUltimoFilmeAssistido(String ultimoFilmeAssistido) {
        this.ultimoFilmeAssistido = ultimoFilmeAssistido;
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa! Pague a fatura para assistir.");
        }
    }

    public void cancelarAssinatura() {
        if (this.ativo) {
            System.out.println("Conta desativada!");
            this.ativo = false;
        } else {
            System.out.println("Conta já está desativada");
        }
    }

    @Override
    public String toString() {
        return "Usuario = " + usuario +
                ", Plano = " + plano +
                ", Mensalidade = R$ " + mensalidade +
                ", Conta = " + (ativo ? "Ativo" : "Suspenso") +
                ", Ultimo Filme Assistido = " +
                (ultimoFilmeAssistido.isEmpty() ? "Nenhum" : ultimoFilmeAssistido);
    }
}
