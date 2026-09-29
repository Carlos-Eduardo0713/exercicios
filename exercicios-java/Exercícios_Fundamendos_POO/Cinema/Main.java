public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme("It a coisa", "Terror", 150, 16);
        Cliente cliente1 = new Cliente("Carlos", 19, 30);
        Sessao sessao1 = new Sessao(filme1, 2, "21:00", 25, 100);
        Ingresso ingresso1 = new Ingresso(cliente1, sessao1);
        Ingresso ingresso2 = new Ingresso(cliente1, sessao1);

        System.out.printf("Dados antes da compra:\n");
        filme1.exibirDados();
        System.out.printf("Preço do ingresso: R$ %.2f\n", sessao1.precoDeIngresso);
        sessao1.vagasDisponiveis();
        System.out.printf("Saldo do cliente: R$ %.2f\n", cliente1.saldo);
        System.out.println("Idade do cliente: " + cliente1.idade + " anos");
        System.out.println("Ingresso comprado? " + ingresso1.compraConfirmada);

        System.out.println();
        ingresso1.confirmarCompra();


        System.out.println("\nDados após a compra:");
        filme1.exibirDados();
        System.out.printf("Preço do ingresso: R$ %.2f\n", sessao1.precoDeIngresso);
        sessao1.vagasDisponiveis();
        System.out.printf("Saldo do cliente: R$ %.2f\n", cliente1.saldo);
        System.out.println("Idade do cliente: " + cliente1.idade + " anos");
        System.out.println("Ingresso comprado? " + ingresso1.compraConfirmada);
        System.out.println("\nComprovante:");
        ingresso1.comprovante();


        System.out.println("\nTentando comprar um ingresso por falta de saldo:");
        ingresso2.confirmarCompra();

        System.out.println("\nTentando comprar um ingresso sem vagas disponíveis:");
        sessao1.lugaresDisponiveis = 0;
        cliente1.adicionarSaldo(25);
        ingresso2.confirmarCompra();

        System.out.println("\nTentando comprar um ingresso sem idade mínima adequada:");
        cliente1.idade = 10;
        sessao1.lugaresDisponiveis = 99;
        ingresso2.confirmarCompra();

        System.out.println("\nTendando repetir a compra de um mesmo ingresso:");
        cliente1.idade = 19;
        ingresso1.confirmarCompra();

        System.out.println("\nDados não foram alterados:");
        filme1.exibirDados();
        System.out.printf("Preço do ingresso: R$ %.2f\n", sessao1.precoDeIngresso);
        sessao1.vagasDisponiveis();
        System.out.printf("Saldo do cliente: R$ %.2f\n", cliente1.saldo);
        System.out.println("Idade do cliente: " + cliente1.idade + " anos");
        System.out.println("Ingresso comprado? " + ingresso1.compraConfirmada);


    }
}
