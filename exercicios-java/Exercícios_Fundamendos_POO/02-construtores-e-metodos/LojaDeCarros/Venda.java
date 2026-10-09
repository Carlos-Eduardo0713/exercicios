public class Venda {

    public Carro carro;
    public Cliente cliente;
    public Vendedor vendedor;
    public double valorFinal;
    public boolean concluida;

    public Venda(Carro carro, Cliente cliente, Vendedor vendedor) {
        this.carro = carro;
        this.cliente = cliente;
        this.vendedor = vendedor;
        valorFinal = 0;
        concluida = false;
    }

    public boolean finalizar() {
        if (!concluida && carro.disponivel && cliente.pagar(carro.preco)) {
            valorFinal = carro.preco;
            carro.marcarComoVendido();
            cliente.carrosComprados += 1;
            vendedor.registrarComissao(valorFinal);
            concluida = true;
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirResumo() {
        System.out.println("Resumo da venda:");
        vendedor.exibirDados();
        carro.exibirDados();
        cliente.exibirDados();
        System.out.println("Venda concluída? " + concluida);
        System.out.println();
        /*
        carro.exibirDados();
        vendedor.exibirDados();
        */
    }
}
