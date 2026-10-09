public class Carro {

    public String modelo;
    public String marca;
    public int ano;
    public double preco;
    public boolean disponivel;

    public Carro(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        disponivel = true;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 20) {
            preco -= preco * (percentual/100);
        }
        else {
            System.out.println("Desconto inválido. (apenas até 20%)");
        }

    }

    public void marcarComoVendido() {
        disponivel = false;
    }

    public void exibirDados() {
        System.out.printf("Carro: %s %s %d: R$ %.2f | ", modelo, marca, ano, preco);
        if (disponivel) {
            System.out.println("Disponível!");
        }
        else {
            System.out.println("Indisponível!");
        }

    }

}
