public class Pet {

    public String nome;
    public String especie;
    public double peso;
    public Tutor tutor;

    public Pet(String nome, String especie, double peso, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.tutor = tutor;
    }

    public void atualizarPeso(double valor) {
        if (valor > 0) {
            peso = valor;
        }
    }

    public void exibirDados() {
        System.out.printf("Pet: %s  |  Espécie: %s  |  Peso: %.2f kg  |  Tutor(a): %s\n"
            , nome, especie, peso, tutor.nome);
    }

}
