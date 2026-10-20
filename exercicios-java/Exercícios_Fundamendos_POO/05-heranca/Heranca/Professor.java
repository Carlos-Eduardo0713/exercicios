public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void ensinar() {
        System.out.println(getNome() + " está ensinando " + disciplina + ".");
    }

    @Override           //Indica a sobrescrita
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
