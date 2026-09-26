public class Biblioteca {

    public String nome;
    public int prazoDias;
    public double multaPorDia;
    public int emprestimosAtivos;

    public Biblioteca(String nome, int prazoDias, double multaPorDia) {
        this.nome = nome;
        this.prazoDias = prazoDias;
        this.multaPorDia = multaPorDia;
        emprestimosAtivos = 0;
    }

    public void registrarSaida() {
        emprestimosAtivos += 1;
    }

    public void registrarRetorno() {
        if (emprestimosAtivos > 0) {
            emprestimosAtivos -= 1;
        }
    }

    public void exibirDados() {
        System.out.printf("Biblioteca: %s  |  Prazo de devolução: %d dias  |  Multa diária: R$ %.2f  |  Empréstimos ativos: %d\n"
            , nome, prazoDias, multaPorDia, emprestimosAtivos);
    }

}
