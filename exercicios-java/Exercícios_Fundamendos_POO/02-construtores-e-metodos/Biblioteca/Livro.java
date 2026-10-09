public class Livro {

    public String titulo;
    public String autor;
    public boolean disponivel;


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        disponivel = true;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public void exibirDados() {
        System.out.printf("Livro: %s  |  Por: %s  |  Disponível? %b\n"
            , titulo, autor, disponivel);
    }

}
