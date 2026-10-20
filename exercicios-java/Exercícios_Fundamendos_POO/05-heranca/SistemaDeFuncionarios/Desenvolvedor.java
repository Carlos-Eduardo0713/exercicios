public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salarioBase, String linguagemPrincipal) {
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void programar() {
        System.out.printf("O programador %s está desenvolvendo na linguagem %s\n"
            ,getNome(), linguagemPrincipal);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Linguagem %s\n", linguagemPrincipal);
    }

}
