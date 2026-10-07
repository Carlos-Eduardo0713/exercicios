public class Main{
    public static void main(String[] args) {

            Produto produto1 = new Produto("Computador", 2500, 10);

            Produto produto2 = new Produto("Celular", 900, 5);

            Cliente cliente1 = new Cliente("Carlos", "123.456.789-10", 3500);

            Cliente cliente2 = new Cliente("Ana", "987.654.321.01", 1621);

            Venda venda1 = new Venda(cliente1, produto1, 1, 10);


            Venda venda2 = new Venda(cliente2, produto2, 2, 15);

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
            Venda venda3 = new Venda(cliente1, produto1, 10, 10);
            venda3.finalizarVenda();

            System.out.println("\nTentando uma venda com quantidade menor que valor mínimo (1):");
            Venda venda4 = new Venda(cliente1, produto1, 0, 10);
            venda4.finalizarVenda();

            System.out.println("\nTentando uma venda sem saldo:");
            Venda venda5 = new Venda(cliente1, produto2, 1, 10);
            cliente1.setSaldo(0);
            venda5.finalizarVenda();

            System.out.println("\nTentando finalizar uma mesma venda (venda1) 2 vezes seguidas:");
            cliente1.setSaldo(2500);
            venda1.finalizarVenda();

            cliente1.setSaldo(1250);      //retornando o valor que estava após a primeira venda válida

            System.out.println("\nResumo final para provar que as vendas inválidas não alteraram nada:");
            cliente1.exibirDados();
            produto1.exibirDados();


    }
}
