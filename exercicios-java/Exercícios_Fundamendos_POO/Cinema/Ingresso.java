public class Ingresso {

    public Cliente cliente;
    public Sessao sessao;
    public boolean compraConfirmada;
    public double valorPago;

    public Ingresso(Cliente cliente, Sessao sessao) {
        this.cliente = cliente;
        this.sessao = sessao;
        compraConfirmada = false;
        valorPago = 0;
    }

    public void confirmarCompra() {
        if (sessao.precoDeIngresso > 0 && !compraConfirmada && sessao.filme.podeAssistir(cliente.idade) && sessao.temVagas() && cliente.saldo >= sessao.precoDeIngresso) {
            cliente.descontarSaldo(sessao.precoDeIngresso);
            sessao.ocuparVaga();
            valorPago = sessao.precoDeIngresso;
            compraConfirmada = true;
            System.out.println("Ingresso comprado!");
        }
        else {
            if (sessao.precoDeIngresso <= 0) {
                System.out.println("O preço do ingresso deve ser positivo.");
            }
            else if (compraConfirmada) {
                System.out.println("Você já comprou este ingresso.");
            }
            else if (!sessao.filme.podeAssistir(cliente.idade)) {
                System.out.println("Você não possui idade mínima adequada.");
            }
            else if (!sessao.temVagas()) {
                System.out.println("Estamos sem vagas disponíveis.");
            }
            else if (cliente.saldo < sessao.precoDeIngresso) {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public void comprovante() {
        if (compraConfirmada) {
            System.out.printf("%s comprou o ingresso para o filme %s, na sala %s, no horário %s. Preço do ingresso: R$ %.2f\n"
                    , cliente.nome ,sessao.filme.titulo, sessao.numeroDeSala, sessao.horarioDeExibicao, valorPago);
        }
    }
}

