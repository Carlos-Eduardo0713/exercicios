public class Moeda {

    public int valor;
    public boolean coletada;

    public Moeda(int valor) {
        if (valor > 0) {
            this.valor = valor;
            coletada = false;
        }
    }

    public boolean coletar(Mario mario) {
        if (!coletada && mario.vidas > 0) {
            mario.moedas += valor;
            mario.pontos += valor * 10;
            coletada = true;
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirStatus() {
        System.out.printf("Valor: %d  |  Coletada? %b\n"
            , valor, coletada);
    }



}
