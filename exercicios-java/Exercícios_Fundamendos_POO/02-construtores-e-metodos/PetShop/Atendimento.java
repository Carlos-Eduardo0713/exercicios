public class Atendimento {

    public Pet pet;
    public Servico servico;
    public double valorCobrado;
    public boolean finalizado;

    public Atendimento(Pet pet, Servico servico) {
        this.pet = pet;
        this.servico = servico;
        valorCobrado = 0;
        finalizado = false;
    }

    public double calcularTotal() {
        if (!finalizado) {
            return servico.calcularPreco(pet);
        }
        else {
            return valorCobrado;
        }
    }

    public boolean finalizar() {
        if (!finalizado && pet.tutor.pagar(servico.calcularPreco(pet))) {
            finalizado = true;
            valorCobrado = servico.calcularPreco(pet);
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirResumo() {
        pet.exibirDados();
        pet.tutor.exibirDados();
        servico.exibirDados();
        System.out.printf("Finalizado: %b", finalizado);
        if (finalizado) {
            System.out.printf("\nValor total do atendimento: R$ %.2f\n", calcularTotal());
        }
    }

}
