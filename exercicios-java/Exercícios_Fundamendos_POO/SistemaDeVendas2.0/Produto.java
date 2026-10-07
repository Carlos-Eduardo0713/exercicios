public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeEstoque = 0;
    }

    public Produto(String nome) { //Esse construtor sobrecarregado utiliza outro construtor que define o estoque
        this(nome, 0);
    }

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

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
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

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

}
