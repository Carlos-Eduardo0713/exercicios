import java.util.Locale;
import java.util.Scanner;

public class exercício_soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma, media;
		double[] vet = new double[10];
		
		System.out.print("Quantos elementos você vai digitar? ");
		n = sc.nextInt();
		
		soma = 0;
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		media = soma / n;
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for (i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}

}
