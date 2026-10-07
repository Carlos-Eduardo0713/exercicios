public class Venda {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double percentualDesconto;
    private double subtotal;
    private boolean finalizada;


    public Venda(Cliente cliente, Produto produto, int quantidade, double percentualDesconto) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.percentualDesconto = percentualDesconto;
        subtotal = produto.getPreco() * quantidade;
        finalizada = false;
    }

    public Venda(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        percentualDesconto = 0;
        subtotal = produto.getPreco() * quantidade;
        finalizada = false;
    }

    public double calcularDesconto() {
        return (produto.getPreco() * (percentualDesconto / 100)) * quantidade;
    }

    public double calcularValorFinal() {
        return subtotal - calcularDesconto();
    }

    public boolean podeFinalizar() {
        return (cliente.temSaldo(calcularValorFinal())
                && quantidade > 0
                && produto.temEstoque(quantidade)
                && !finalizada);
    }

    public boolean finalizarVenda() {
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
            else if (finalizada) {
                System.out.println("Esta venda já foi finalizada");
            }
            return false;
        }
        else {
            produto.retirarEstoque(quantidade);
            cliente.descontarSaldo(calcularValorFinal());
            finalizada = true;
            System.out.println("Compra efetuada!");
            return true;
        }
    }

    public void exibirResumo() {
        cliente.exibirDados();
        System.out.println();
        produto.exibirDados();
        System.out.println();

        System.out.println("Valor total da compra: R$ " + subtotal);
        System.out.println("Desconto aplicado: R$ " + calcularDesconto());
        System.out.println("Valor final da compra: R$ " + calcularValorFinal());
        System.out.println("Venda finalizada? " + finalizada);
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public double getSubtotal() {
        return subtotal;
    }

}
