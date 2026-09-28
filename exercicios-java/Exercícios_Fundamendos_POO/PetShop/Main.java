public class Main {
    public static void main(String[] args) {

        Tutor tutor1 = new Tutor("José", "(96) 9 3232-3646", 100);
        Pet pet1 = new Pet("Bob", "Cachorro", 12, tutor1);
        Servico servico1 = new Servico("Banho", 25, 2);
        Atendimento atendimento1 = new Atendimento(pet1, servico1);

        System.out.println("Dados antes do atendimento:");
        atendimento1.exibirResumo();

        atendimento1.finalizar();

        System.out.println("\n\nDados após atendimento:");
        atendimento1.exibirResumo();

        tutor1.adicionarSaldo(1);
        System.out.printf("\nTentando finalizar novamente resulta em: %b\n", atendimento1.finalizar());

        tutor1.pagar(1);        //Só alterei o saldo para testar a repetição do mesmo atendimento

        System.out.println("\nAlterando o peso do Pet depois do atendimento não muda o preço cobrado:");
        pet1.atualizarPeso(14);
        System.out.println("Peso do Pet atualizado*");
        System.out.printf("Valor total do atendimento: R$ %.2f\n", atendimento1.calcularTotal());


    }
}
