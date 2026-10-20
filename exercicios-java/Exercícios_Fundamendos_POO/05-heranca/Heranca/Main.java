public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana", 20, "2026001");
        Professor professor = new Professor("Carlos", 38, "POO");

        aluno.exibirDados();
        aluno.estudar();
        aluno.fazerAniversario();
        System.out.println("Nova idade: " + aluno.getIdade());

        System.out.println();
        professor.exibirDados();
        professor.ensinar();
    }
}
