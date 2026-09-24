public class Cliente {

    public String nome;
    public String cpf;
    public double saldo;
    public int carrosComprados;

    public Cliente(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        carrosComprados = 0;
    }

    public boolean pagar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void exibirDados() {
        System.out.printf("Cliente: %s | CPF: %s | Saldo: R$ %.2f | Carros comprados: %d\n"
                , nome, cpf, saldo, carrosComprados);
    }

}
