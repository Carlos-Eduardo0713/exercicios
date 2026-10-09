public class Cliente {

    public String nome;
    public int idade;
    public double saldo;

    public Cliente(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito concluído!");
        }
        else {
            System.out.println("Depósito inválido!");
        }
    }

    public void descontarSaldo(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Desconto concluído!");
        }
        else {
            System.out.println("Desconto inválido");
        }
    }

}
