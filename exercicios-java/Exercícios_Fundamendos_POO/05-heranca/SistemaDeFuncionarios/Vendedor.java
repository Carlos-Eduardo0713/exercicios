public class Vendedor extends Funcionario{

    private double totalVendido;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
        totalVendido = 0;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public double calcularComissao() {
        return (5.0/100) * totalVendido;
    }

    public void registrarVenda(double valor) {
        if (valor > 0) {
            totalVendido += valor;
            System.out.println("Venda registrada!");
        }
    }

    public void vender() {
        System.out.printf("O vendedor %s está recebendo um cliente.\n",
                getNome());
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Total vendido: R$ %.2f\n", totalVendido);
        System.out.printf("Total em comissões: R$ %.2f\n", calcularComissao());
    }

}
