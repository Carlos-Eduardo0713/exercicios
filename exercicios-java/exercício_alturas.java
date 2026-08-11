import java.util.Locale;
import java.util.Scanner;

public class exercício_alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, menores_16;
		double altura_media, percent_menores16, soma_alturas;

		
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		sc.nextLine(); 		// limpeza de buffer
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		double alturas[] = new double[n];
		
		soma_alturas = 0;
		menores_16 = 0;
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine(); 		// limpeza de buffer

			soma_alturas += alturas[i];
			
			if (idades[i] < 16) {
				menores_16 += 1;
			}	
		}
			

		altura_media = ((double)(soma_alturas / n));
		percent_menores16 = ((double)menores_16 / n * 100);
		
		System.out.println("Altura média: " + String.format("%.2f", altura_media));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percent_menores16) + "%");
		
		for (i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
	
}
