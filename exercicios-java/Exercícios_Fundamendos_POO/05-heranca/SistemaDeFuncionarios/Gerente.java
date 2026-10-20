public class Gerente extends Funcionario {

    private String setor;

    public Gerente(String nome, double salarioBase, String setor) {
        super(nome, salarioBase);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void realizarReuniao() {
        System.out.printf("O gerente %s está realizando uma reunião no setor %s\n"
            ,getNome(), setor);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Setor: %s\n", setor);
    }

}
