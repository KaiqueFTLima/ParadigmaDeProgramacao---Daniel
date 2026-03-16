public class Cliente {

    private int id;
    private String nome, cpf, endereço;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String endereço) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "id= " + id +
                "nome= " + nome +
                "cpf= " + cpf+
                "endereço= " + endereço;
    }
}
