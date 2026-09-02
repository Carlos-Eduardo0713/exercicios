import java.util.Locale;
import java.util.Scanner;

public class exercício_media_idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, soma = 0, cont = 0;
		double media = 0;
		
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		
		if (idade < 0) {
			System.out.print("IMPOSSÍVEL CALCULAR");
		}
		else {
			while (idade >= 0) {
				soma += idade;
				idade = sc.nextInt();
				cont += 1;
			}
			media = (double)soma/cont;
			
			System.out.print("MEDIA = " + String.format("%.2f", media));
		}


		sc.close();
	}

}