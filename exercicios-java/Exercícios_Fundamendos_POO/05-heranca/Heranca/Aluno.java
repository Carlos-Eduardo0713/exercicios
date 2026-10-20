public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    @Override       //Para indicar a sobrescrita de um metodo
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }
}
