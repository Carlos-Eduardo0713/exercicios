public class Main {
    public static void main(String[] args) {

        Mario player1 = new Mario("Mauro");
        Inimigo inimigo1 = new Inimigo("Goomba", 100);
        Inimigo inimigo2 = new Inimigo("Koopa", 50);
        Moeda moeda1 = new Moeda(1);
        Moeda moeda2 = new Moeda(5);
        Fase fase1 = new Fase("Yoshi´s Island", 200);

        System.out.println("Início da fase:");
        fase1.exibirDados();
        player1.exibirStatus();
        System.out.println("Inimigos:");
        inimigo1.exibirStatus();
        inimigo2.exibirStatus();
        System.out.println("Moedas:");
        moeda1.exibirStatus();
        moeda2.exibirStatus();
        inimigo1.serPisado(player1);
        moeda1.coletar(player1);
        moeda2.coletar(player1);

        System.out.println("\nApós coletar as duas moedas e derrotar o Goomba:");
        player1.exibirStatus();
        System.out.println("Pode concluir? " + fase1.podeConcluir(player1));

        inimigo2.serPisado(player1);
        System.out.println("\nApós derrotar Koopa:");
        player1.exibirStatus();
        System.out.println("Pode concluir? " + fase1.podeConcluir(player1));
        fase1.concluir(player1);

        System.out.println("\nFim da fase:");
        fase1.exibirDados();
        player1.exibirStatus();
        System.out.println("Inimigos:");
        inimigo1.exibirStatus();
        inimigo2.exibirStatus();
        System.out.println("Moedas:");
        moeda1.exibirStatus();
        moeda2.exibirStatus();

        System.out.println("\nTestando repetições (Não deve permitir):");
        System.out.println("Tentar pisar no Goomba de novo: " + inimigo1.serPisado(player1));
        System.out.println("Tentar pisar no Koopa de novo: " + inimigo2.serPisado(player1));
        System.out.println("Tentar coletar a moeda1 de novo: " + moeda1.coletar(player1));
        System.out.println("Tentar coletar a moeda2 de novo: " + moeda2.coletar(player1));
        System.out.println("Tentar concluir a fase de novo: " + fase1.concluir(player1));
    }
}
