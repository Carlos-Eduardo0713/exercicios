public class Cliente {

    private String nome;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        saldo = 0;
    }

    public Cliente() {}

    public boolean temSaldo(double valor) {
        return (saldo >= valor);
    }

    public void descontarSaldo(double valor) {
        if (saldo > valor) {
            saldo -= valor;
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        else {
            System.out.println("Digite um valor positivo!");
        }
    }

    public void exibirDados() {
        System.out.printf("Cliente: %s | CPF: %s | Saldo: R$ %.2f\n", nome, cpf, saldo);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

}
