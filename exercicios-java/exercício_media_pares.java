import java.util.Locale;
import java.util.Scanner;

public class exercício_media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double pares = 0, soma_pares = 0, media_pares;
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int vet[] = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				pares += 1;
				soma_pares += vet[i];
			}
		}

		if (pares > 0) {
			media_pares = (double)soma_pares / pares;
			System.out.print("MÉDIA DOS PARES = " + String.format("%.1f", media_pares));	
		}
		else {
			System.out.print("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}

}
