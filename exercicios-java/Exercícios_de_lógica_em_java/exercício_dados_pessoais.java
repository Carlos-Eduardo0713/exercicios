import java.util.Locale;
import java.util.Scanner;

public class exercício_dados_pessoais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, homens = 0, mulheres = 0;
		double menor_altura, maior_altura, soma_altura_mulheres = 0, media_mulheres = 0;
		
		
		System.out.print("Quantas pessoas serão digitas? ");
		n = sc.nextInt();
		sc.nextLine(); 		//limpeza de buffer
		
		double alturas[] = new double[n];
		char generos[] = new char[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("altura da " + (i+1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);
		}
		
		menor_altura = alturas[0];
		maior_altura = alturas[0];
		
		for (i = 0; i < n; i++) {
			if (alturas[i] < menor_altura) {
				menor_altura = alturas[i];
			}
			
			if (alturas[i] > maior_altura) {
				maior_altura = alturas[i];
			}
			
			if (generos[i] == 'F') {
				soma_altura_mulheres += alturas[i];
				mulheres += 1;
			}
			else {
				homens += 1;
			}
		}
		
		media_mulheres = (double)soma_altura_mulheres / mulheres;
		
		System.out.println("Menor altura = " + String.format("%.2f", menor_altura));
		System.out.println("Maior altura = " + String.format("%.2f", maior_altura));
		System.out.println("Média das alturas das mulheres = " + 
		String.format("%.2f", media_mulheres));
		System.out.print("Número de homens: " + homens);
		
		sc.close();
	}

}
