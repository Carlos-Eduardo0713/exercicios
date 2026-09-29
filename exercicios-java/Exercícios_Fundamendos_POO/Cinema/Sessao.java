public class Sessao {

    public Filme filme;
    public int numeroDeSala;
    public String horarioDeExibicao;
    public double precoDeIngresso;
    public int capacidadeMaxima;
    public int lugaresDisponiveis;

    public Sessao(Filme filme, int numeroDeSala, String horarioDeExibicao, double precoDeIngresso, int capacidadeMaxima) {
        this.filme = filme;
        this.numeroDeSala = numeroDeSala;
        this.horarioDeExibicao = horarioDeExibicao;
        this.precoDeIngresso = precoDeIngresso;
        this.capacidadeMaxima = capacidadeMaxima;
        lugaresDisponiveis = capacidadeMaxima;
    }


    public boolean temVagas() {
        if (lugaresDisponiveis > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void vagasDisponiveis() {
        if (temVagas()) {
            System.out.printf("Vagas disponíveis: %d\n", lugaresDisponiveis);
        }
        else {
            System.out.println("Lotado!");
        }
    }

    public void ocuparVaga() {
        if (temVagas()) {
            lugaresDisponiveis -= 1;
            System.out.println("Cadeira reservada com sucesso!");
        }
        else {
            System.out.println("Estamos lotados");
        }
    }


}

