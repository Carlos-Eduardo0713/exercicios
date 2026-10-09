public class Venda {

    Cliente cliente;
    Produto produto;
    int quantidade;
    double percentualDesconto;

    public double calcularSubtotal() {
        return quantidade * produto.preco;
    }

    public double calcularDesconto() {
        return (produto.preco * (percentualDesconto / 100)) * quantidade;
    }

    public double calcularValorFinal() {
        return calcularSubtotal() - calcularDesconto();
    }

    public boolean podeFinalizar() {
        return (cliente.temSaldo(calcularValorFinal())
                && quantidade > 0
                && produto.temEstoque(quantidade));
    }

    public void finalizarVenda() {
        if (!podeFinalizar()) {
            if (quantidade <= 0) {
                System.out.println("Compra inválida, compra mínima de uma unidade");
            }
            else if (!produto.temEstoque(quantidade)) {
                System.out.println("Quantidade em estoque indisponível");
            }
            else if (!cliente.temSaldo(calcularValorFinal())) {
                System.out.println("Saldo insuficiente do cliente");
            }
        }
        else {
            produto.retirarEstoque(quantidade);
            cliente.descontarSaldo(calcularValorFinal());

            System.out.println("Compra efetuada!");
        }
    }

    public void exibirResumo() {
        cliente.exibirDados();
        System.out.println();
        produto.exibirDados();
        System.out.println();

        System.out.println("Valor total da compra: R$ " + calcularSubtotal());
        System.out.println("Desconto aplicado: R$ " + calcularDesconto());
        System.out.println("Valor final da compra: R$ " + calcularValorFinal());
    }

}
