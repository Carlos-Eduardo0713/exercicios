public class Main {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Geraldo", 2000, "Financeiro");
        Desenvolvedor dev1 = new Desenvolvedor("Roberto", 3500, "Java");
        Vendedor vendedor1 = new Vendedor("Bruno", 1800);

        System.out.println("Dados iniciais:");
        gerente1.exibirDados();
        gerente1.realizarReuniao();
        System.out.println();
        dev1.exibirDados();
        dev1.programar();
        System.out.println();
        vendedor1.exibirDados();
        vendedor1.vender();
        System.out.println();

        //testes da atividade
        gerente1.aumentarSalario(10);
        vendedor1.registrarVenda(1000);
        vendedor1.registrarVenda(500);
        vendedor1.registrarVenda(-10);

        System.out.println("Dados após os testes:");
        gerente1.exibirDados();
        System.out.println();
        dev1.exibirDados();
        System.out.println();
        vendedor1.exibirDados();
        System.out.println();

        System.out.println("Classe extra: Estagiário");
        Estagiario estagiario1 = new Estagiario("Carlos", 1621, "UNIFIP");
        estagiario1.exibirDados();
        estagiario1.estagiar();
        System.out.println("\nAcessando um método herdado da superclasse direto do main:");
        System.out.println(estagiario1.getSalarioBase());

        System.out.println("\nTestando aumentos de salários com valores inválidos:");
        estagiario1.aumentarSalario(0);
        estagiario1.aumentarSalario(-500);
        System.out.println("\nValores não foram alterados:");
        System.out.println(estagiario1.getSalarioBase());

        System.out.println("\nAplicando aumentos sucessivos de salário:");
        dev1.aumentarSalario(10);
        dev1.aumentarSalario(10);
        System.out.println("O segundo aumento foi feito com base no aumento anterior:");
        System.out.println(dev1.getSalarioBase());

        System.out.println("\nProvando que vendedores iniciam sem total de vendas e sem comissões:");
        Vendedor vendedor2 = new Vendedor("Pedro", 1800);
        vendedor2.exibirDados();

    }
}
