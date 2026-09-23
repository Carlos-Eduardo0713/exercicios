public class Produto {

    String nome;
    double preco;
    int quantidadeEstoque;

    public double calcularValorEmEstoque() {
        return preco * quantidadeEstoque;
    }

    public boolean temEstoque(int quantidade) {
        return (quantidade <= quantidadeEstoque);
    }

    public void retirarEstoque(int quantidade) {
        if (temEstoque(quantidade)) {
            quantidadeEstoque -= quantidade;
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco = preco - preco * (percentual/100);
        }
        else {
            System.out.println("Desconto inválido!");
        }
    }

    public void exibirDados() {
        System.out.printf("Produto: %s | Preço: R$ %.2f\n", nome, preco);
        System.out.printf("Quantidade em estoque: %d\n", quantidadeEstoque);
        System.out.printf("Valor em estoque: R$ %.2f\n", calcularValorEmEstoque());
    }

}
