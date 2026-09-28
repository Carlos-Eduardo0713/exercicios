public class Tutor {

    public String nome;
    public String telefone;
    public double saldo;

    public Tutor(String nome, String telefone, double saldo) {
        this.nome = nome;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public boolean pagar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void exibirDados() {
        System.out.printf("Tutor: %s  |  Telefone: %s  |  Saldo: R$ %.2f\n"
            , nome, telefone, saldo);
    }


}
