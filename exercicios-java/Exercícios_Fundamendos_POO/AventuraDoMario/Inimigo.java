public class Inimigo {

    public String tipo;
    public int pontosRecompensa;
    public boolean derrotado;

    public Inimigo(String tipo, int pontosRecompensa) {
        this.tipo = tipo;
        this.pontosRecompensa = pontosRecompensa;
        derrotado = false;
    }

    public void atacar(Mario mario) {
        if (!derrotado) {
            mario.receberDano();
        }
    }

    public boolean serPisado(Mario mario) {
        if (mario.vidas > 0 && !derrotado ) {
            derrotado = true;
            mario.pontos += pontosRecompensa;
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirStatus() {
        System.out.printf("Tipo: %s  |  Recompensa: %d  |  Derrotado? %b\n"
            , tipo, pontosRecompensa, derrotado);
    }

}
