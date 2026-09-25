public class Fase {

    public String nome;
    public int pontosMinimos;
    public boolean concluida;

    public Fase(String nome, int pontosMinimos) {
        this.nome = nome;
        this.pontosMinimos = pontosMinimos;
        concluida = false;
    }

    public boolean podeConcluir(Mario mario) {
        return mario.vidas > 0 && mario.pontos >= pontosMinimos;
    }

    public boolean concluir(Mario mario) {
        if (!concluida && podeConcluir(mario)) {
            concluida = true;
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirDados() {
        System.out.printf("Fase: %s  |  Mínimo de pontos necessários: %d  |  Concluida? %b\n"
            , nome, pontosMinimos, concluida);
    }

}
