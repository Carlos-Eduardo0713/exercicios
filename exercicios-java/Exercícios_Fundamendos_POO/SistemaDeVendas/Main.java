public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Computador";
        produto1.preco = 2500;
        produto1.quantidadeEstoque = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Celular";
        produto2.preco = 900;
        produto2.quantidadeEstoque = 5;

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Carlos";
        cliente1.cpf = "123.456.789-10";
        cliente1.saldo = 3500;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Ana";
        cliente2.cpf = "987.654.321.01";
        cliente2.saldo = 1621;

        Venda venda1 = new Venda();
        venda1.cliente = cliente1;
        venda1.produto = produto1;
        venda1.quantidade = 1;
        venda1.percentualDesconto = 10;

        Venda venda2 = new Venda();
        venda2.cliente = cliente2;
        venda2.produto = produto2;
        venda2.quantidade = 2;
        venda2.percentualDesconto = 15;

        System.out.println("Dados antes da venda1:");
        venda1.exibirResumo();
        System.out.println();
        venda1.finalizarVenda();
        System.out.println();
        System.out.println("Dados após venda1:");
        venda1.exibirResumo();

        System.out.println();

        System.out.println("Dados antes da venda2:");
        venda2.exibirResumo();
        System.out.println();
        venda2.finalizarVenda();
        System.out.println();
        System.out.println("Dados após venda2");
        venda2.exibirResumo();

        System.out.println("\nTentando uma venda sem estoque disponível:");
        Venda venda3 = new Venda();
        venda3.cliente = cliente1;
        venda3.produto = produto1;
        venda3.quantidade = 10;
        venda3.percentualDesconto = 10;
        venda3.finalizarVenda();

        System.out.println("\nTentando uma venda com quantidade menor que valor mínimo (1):");
        venda3.quantidade = 0;
        venda3.finalizarVenda();

        System.out.println("\nTentando uma venda sem saldo:");
        venda3.quantidade = 1;
        cliente1.saldo = 0;
        venda3.finalizarVenda();

        cliente1.saldo = 1250;      //retornando o valor que estava após a venda válida

        System.out.println("\nResumo final para provar que as vendas inválidas não alteraram nada:");
        cliente1.exibirDados();
        produto1.exibirDados();

    }
}
