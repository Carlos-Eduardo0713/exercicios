import java.util.Locale;
import java.util.Scanner;

public class exercício_maior_posição {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, pos_maior = 0;
		double maior;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		double vet[] = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		maior = vet[0];
		for (i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				pos_maior = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + pos_maior);
		
		sc.close();
	}

}
