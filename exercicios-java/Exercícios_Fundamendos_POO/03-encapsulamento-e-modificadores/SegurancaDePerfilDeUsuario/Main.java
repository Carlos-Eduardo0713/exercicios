import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario user;
        System.out.println("Bem-vindo. Vamos criar seu login...");
        System.out.print("Seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Sua senha: ");
        String senha = sc.nextLine();


        user = new Usuario(nome, senha);
        System.out.println("dados da conta:");
        System.out.println(user);

        System.out.println("\nAlterando senha...");
        System.out.println("Para alterar sua senha informe:");
        System.out.print("Senha antiga: ");
        String senhaAntiga = sc.nextLine();
        System.out.print("Nova senha: ");
        String senhaNova = sc.nextLine();
        user.alterarSenha(senhaAntiga, senhaNova);

        System.out.println("dados da conta:");
        System.out.println(user);

        System.out.println("\nDesativando conta...");
        user.suspenderConta();
        System.out.println(user);

        System.out.println("\nReativando conta...");
        user.reativarConta();
        System.out.println(user);

        System.out.println("Dono da conta: " + user.getNomeUsuario());
    }
}
