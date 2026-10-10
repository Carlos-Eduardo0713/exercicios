public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito efetuado!");
        }
        else {
            System.out.println("Deposite um valor positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque efetuado!");
        }
        else if (valor <= 0) {
            System.out.println("Tente sacar um valor positivo!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirResumo() {
        System.out.printf("Conta %s, titular: %s, Saldo: R$ %.2f\n",
                numeroConta, titular, saldo);
    }

}
