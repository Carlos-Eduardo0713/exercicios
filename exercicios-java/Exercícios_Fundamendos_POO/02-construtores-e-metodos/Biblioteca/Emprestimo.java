public class Emprestimo {

    public Livro livro;
    public Leitor leitor;
    public Biblioteca biblioteca;
    public boolean iniciado;
    public boolean devolvido;

    public Emprestimo(Livro livro, Leitor leitor, Biblioteca biblioteca) {
        this.livro = livro;
        this.leitor = leitor;
        this.biblioteca = biblioteca;
        iniciado = false;
        devolvido = false;
    }

    public boolean iniciar() {
        if (!iniciado && livro.disponivel && leitor.podeEmprestar()) {
            iniciado = true;
            livro.emprestar();
            leitor.registrarEmprestimo();
            biblioteca.registrarSaida();
            return true;
        }
        else {
            return false;
        }
    }

    public double calcularMulta(int diasComLivro) {
        int diasAtraso = diasComLivro - biblioteca.prazoDias;
        if (diasAtraso > 0) {
            return diasAtraso * biblioteca.multaPorDia;
        }
        else {
            return 0;
        }

    }

    public boolean devolver(int diasComLivro) {
        if (iniciado && !devolvido && diasComLivro >= 0) {
            if (((diasComLivro - biblioteca.prazoDias) * biblioteca.multaPorDia) > 0) {
                System.out.printf("Multa: R$ %.2f", calcularMulta(diasComLivro));
            }
            else {
                System.out.println("Entrega dentro do prazo");
            }

            livro.devolver();
            leitor.registrarDevolucao();
            biblioteca.registrarRetorno();
            devolvido = true;
            return true;
        }
        else {
            return false;
        }
    }

}
