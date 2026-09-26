public class Main{
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O santo e a porca", "Ariano Suassuna");
        Livro livro3 = new Livro("Memórias póstumas de Brás Cubas", "Machado de Assis");
        Livro livro4 = new Livro("Iracema", "José de Alencar");
        Leitor leitor1 = new Leitor("Carlos", "633.333.456");
        Biblioteca biblioteca1 = new Biblioteca("Literatura", 7, 2);
        Emprestimo emprestimo1 = new Emprestimo(livro1, leitor1, biblioteca1);
        Emprestimo emprestimo2 = new Emprestimo(livro2, leitor1, biblioteca1);
        Emprestimo emprestimo3 = new Emprestimo(livro3, leitor1, biblioteca1);
        Emprestimo emprestimo4 = new Emprestimo(livro4, leitor1, biblioteca1);


        System.out.println("Dados antes do empéstimo:");
        livro1.exibirDados();
        System.out.printf("Empréstimos do leitor %s: %d\n", leitor1.nome ,leitor1.emprestimosAtivos);
        biblioteca1.exibirDados();

        emprestimo1.iniciar();
        System.out.println("\nDados durante o empréstimo:");
        livro1.exibirDados();
        System.out.printf("Empréstimos do leitor %s: %d\n", leitor1.nome ,leitor1.emprestimosAtivos);
        biblioteca1.exibirDados();


        System.out.println("\n\nDados depois do empéstimo:");
        emprestimo1.devolver(10);
        livro1.exibirDados();
        System.out.printf("Empréstimos do leitor %s: %d\n", leitor1.nome ,leitor1.emprestimosAtivos);
        biblioteca1.exibirDados();

        System.out.println("\nTentando fazer 3 empréstimos:");
        emprestimo2.iniciar();
        emprestimo3.iniciar();
        emprestimo4.iniciar();
        biblioteca1.exibirDados();
        System.out.println("O terceiro empréstimo não foi efetuado:");
        System.out.println("Empréstimos ativos do leitor: " + leitor1.emprestimosAtivos );


    }
}
