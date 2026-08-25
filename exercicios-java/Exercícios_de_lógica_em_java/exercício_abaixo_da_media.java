import java.util.Locale;
import java.util.Scanner;

public class exercício_abaixo_da_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma = 0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		double vet[] = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		media = (double)soma / n;
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		
		for (i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.println(String.format("%.1f", vet[i]));
			}
		}

		sc.close();
	}

}
