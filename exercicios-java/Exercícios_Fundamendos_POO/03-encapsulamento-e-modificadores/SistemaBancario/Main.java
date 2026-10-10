public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("3551", "Carlos");

        System.out.println("Dados da conta:");
        conta1.exibirResumo();

        System.out.println("\nDepositando R$ 500,00");
        conta1.depositar(500);

        System.out.println("Dados atualizados da conta:");
        conta1.exibirResumo();

        System.out.println("\nSacando R$ 300,00");
        conta1.sacar(300);

        System.out.println("Dados atualizados da conta:");
        conta1.exibirResumo();

        System.out.println("\nTendando sacar um valor maior que o saldo:");
        conta1.sacar(500);

        System.out.println("\nTentando sacar um valor negativo:");
        conta1.sacar(-5);

        System.out.println("\nTentando depositar um valor negativo:");
        conta1.depositar(-10);

        System.out.println("\nDados não foram alterados:");
        conta1.exibirResumo();

    }
}