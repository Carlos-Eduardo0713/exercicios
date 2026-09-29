public class Filme {

    public String titulo;
    public String genero;
    public int duracao;
    public int idadeMinima;

    public Filme(String titulo, String genero, int duracao, int idadeMinima) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.idadeMinima = idadeMinima;
    }

    public boolean podeAssistir(int idade) {
        return idade >= idadeMinima;
    }

    public void exibirDados() {
        System.out.printf("Filme: %s  |  Gênero: %s  |  Duração: %d minutos  |  Classificação indicativa: %d anos\n"
                ,titulo, genero, duracao, idadeMinima);
    }

}

