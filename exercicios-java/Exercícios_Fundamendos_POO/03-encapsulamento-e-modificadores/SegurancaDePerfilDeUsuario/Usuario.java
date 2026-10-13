public class Usuario {

    private String nomeUsuario;
    private String senha;
    private boolean statusAtivo;


    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        statusAtivo = true;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public boolean isAtivo() {
        return statusAtivo;
    }


    public void suspenderConta() {
        if (isAtivo()) {
            statusAtivo = false;
        }
        else {
            System.out.println("A conta já está desativada!");
        }
    }

    public void reativarConta() {
        if (!isAtivo()) {
            statusAtivo = true;
        }
        else {
            System.out.println("A conta já está ativa!");
        }
    }

    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if (senha.equals(senhaAntiga)) {
            senha = senhaNova;
            System.out.println("Senha alterada com sucesso!");
        }
        else {
            System.out.println("Informe sua senha antiga corretamente!");
        }
    }

    public String toString() {
        return String.format("User name: %s | Password: %s | isActive? %b"
        , nomeUsuario, senha, statusAtivo);
    }
}
