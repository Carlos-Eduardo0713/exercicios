public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Honda", "Civic", 2006, 50000);
        Cliente cliente1 = new Cliente("Carlos", "123.456.789-10", 60000);
        Vendedor vendedor1 = new Vendedor("Ricardo", 5);
        Venda venda1 = new Venda(carro1, cliente1, vendedor1);

        System.out.println("Resumo da venda antes do desconto:");
        venda1.exibirResumo();

        carro1.aplicarDesconto(10);
        System.out.println("Resumo da venda depois do desconto:");
        venda1.exibirResumo();

        venda1.finalizar();
        System.out.println("Resumo da venda depois de finalizada");
        venda1.exibirResumo();

        System.out.println("Tentando finalizar novamente: " + venda1.finalizar());
        venda1.exibirResumo();

    }
}