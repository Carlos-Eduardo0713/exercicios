public class Cliente {

    String nome;
    String cpf;
    double saldo;

    public boolean temSaldo(double valor) {
        return (saldo >= valor);
    }

    public void descontarSaldo(double valor) {
        saldo -= valor;
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

}
