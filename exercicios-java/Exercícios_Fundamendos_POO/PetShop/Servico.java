public class Servico {

    public String nome;
    public double precoBase;
    public double adicionalPorKg;

    public Servico(String nome, double precoBase, double adicionalPorKg) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.adicionalPorKg = adicionalPorKg;
    }

    public double calcularPreco(Pet pet) {
        return precoBase + (pet.peso * adicionalPorKg);
    }

    public void exibirDados() {
        System.out.printf("Serviço: %s  |  Preço base: R$ %.2f  |  Adicional por kg: R$ %.2f\n"
            , nome, precoBase, adicionalPorKg);
    }

}
