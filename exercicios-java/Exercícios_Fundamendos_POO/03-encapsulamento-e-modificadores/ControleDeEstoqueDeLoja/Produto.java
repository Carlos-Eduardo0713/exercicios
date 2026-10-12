public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Informe um preço positivo!");
        }

    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
        else {
            System.out.println("Defina um estoque positivo!");
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 50) {
            preco -= preco * (porcentagem/100);
        }
        else {
            System.out.println("Porcentagem de desconto inválida! (apenas aceito entre 1 e 50 %)");
        }
    }

    public String toString() {
        return String.format("O produto %s, está custando R$ %.2f, com %d unidades em estoque disponível",
                nome, preco, quantidadeEstoque);
    }

}
