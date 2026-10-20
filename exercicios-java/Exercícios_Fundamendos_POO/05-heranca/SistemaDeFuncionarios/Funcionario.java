public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = (percentual / 100) * salarioBase;
            salarioBase += aumento;
        }
    }

    public void exibirDados() {
        System.out.println(String.format("Dados de %s\nSalário base: R$ %.2f",
                nome, salarioBase));

    }

}
