public class Vendedor {

    public String nome;
    public double percentualComissao;
    public double totalComissoes;

    public Vendedor(String nome, double percentualComissao) {
        this.nome = nome;
        this.percentualComissao = percentualComissao;
        totalComissoes = 0;
    }

    public double calcularComissao(double valorVenda) {
        return valorVenda * (percentualComissao / 100);
    }

    public void registrarComissao(double valorVenda) {
        totalComissoes += calcularComissao(valorVenda);
    }

    public void exibirDados() {
        System.out.printf("Vendedor: %s | Percentual de comissão: %.2f%% | Total em comissões: %.2f\n"
                           , nome, percentualComissao, totalComissoes);
    }

}
