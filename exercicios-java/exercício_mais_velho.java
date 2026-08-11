import java.util.Scanner;

public class exercício_mais_velho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, posicao = 0, maior = 0;
		
		System.out.println("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		sc.nextLine(); 		//limpeza de buffer
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();

			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine(); 		//limpeza de buffer
		}
		
		for (i = 0; i < n; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				posicao = i;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nomes[posicao]);
		
		sc.close();
	}

}
