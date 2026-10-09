public class Mario {

    public String nome;
    public int vidas;
    public int moedas;
    public int pontos;

    public Mario(String nome) {
        this.nome = nome;
        vidas = 3;
        moedas = 0;
        pontos = 0;
    }

    public void pular() {
        if (vidas > 0) {
            System.out.println("Jump!");
        }
    }

    public void receberDano() {
        if (vidas > 0) {
            vidas -= 1;
        }
    }

    public void exibirStatus() {
        System.out.printf("PlayerName: %s | Vidas: %d | Moedas: %d | Pontos: %d\n"
        , nome, vidas, moedas, pontos);
    }

}
