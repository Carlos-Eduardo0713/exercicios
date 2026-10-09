public class Leitor {

    public String nome;
    public String matricula;
    public int emprestimosAtivos;
    public int limiteEmprestimos;

    public Leitor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        emprestimosAtivos = 0;
        limiteEmprestimos = 2;
    }

    public boolean podeEmprestar() {
        if (emprestimosAtivos < limiteEmprestimos) {
            return true;
        }
        else {
            return false;
        }
    }

    public void registrarEmprestimo() {
        if (podeEmprestar()) {
            emprestimosAtivos += 1;
        }
    }

    public void registrarDevolucao() {
        if (emprestimosAtivos > 0) {
            emprestimosAtivos -= 1;
        }
    }

}
