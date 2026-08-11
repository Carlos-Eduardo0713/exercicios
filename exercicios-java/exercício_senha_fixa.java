import java.util.Scanner;

public class exercício_senha_fixa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tentativa;
		
		System.out.print("Digite a senha: ");
		tentativa = sc.nextInt();
		
		while (tentativa != 2002) {
			System.out.print("Senha inválida! Tente novamente: ");
			tentativa = sc.nextInt();
		}
		
		System.out.print("Acesso permitido!");
		
		sc.close();
	}

}
