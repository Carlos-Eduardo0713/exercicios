import java.util.Scanner;

public class exercício_números_pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n, i, pares = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		int vet[] = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS PARES");
		for (i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				pares += 1;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE PARES: " + pares);
		
		sc.close();
	}

}
