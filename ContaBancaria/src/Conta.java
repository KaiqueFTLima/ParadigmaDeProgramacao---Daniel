public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public double saldo;
    public boolean status;

    public Conta() {
    }

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    void depositar(double valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Deposito de " + valor);
        } else {
            System.out.println("Conta inativa. Não é possível depositar.");
        }
    }

    void sacar(double valor) {
        if (!this.status) {
            System.out.println("Conta inativa.");
        } else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        }
    }

    void encerrarConta() {
        if (!this.status) {
            System.out.println("Conta já está encerrada.");
        } else if (this.saldo != 0) {
            System.out.println("Há dinheiro em conta, saque todo o valor para encerrar!");
        } else {
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta +
                ", Agência: " + agencia +
                ", Cliente: " + nomeCliente +
                ", Saldo Atual: R$ " + saldo +
                ", Status: " + (status ? "Ativa" : "Encerrada");
    }
}
