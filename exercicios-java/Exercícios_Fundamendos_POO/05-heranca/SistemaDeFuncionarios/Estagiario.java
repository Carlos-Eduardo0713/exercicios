public class Estagiario extends Funcionario{

    private String instituicaoEnsino;

    public Estagiario(String nome, double salarioBase, String instituicaoEnsino) {
        super(nome, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void estagiar() {
        System.out.printf("%s está estagiando na instituição %s\n"
            ,getNome(), instituicaoEnsino);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Estagiáro vinculado na instituição %s\n",
                instituicaoEnsino);
    }

}
