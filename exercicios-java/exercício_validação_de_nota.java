import java.util.Locale;
import java.util.Scanner;

public class exercício_validação_de_nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Didite a primeira nota: ");
		n1 = sc.nextDouble();
		
		while (n1 < 0 || n1 > 10) {
			System.out.println("valor inválido! Tente novamente: ");
			n1 = sc.nextDouble();
		}
		
		System.out.print("Didite a segunda nota: ");
		n2 = sc.nextDouble();
		
		while (n2 < 0 || n2 > 10) {
			System.out.println("valor inválido! Tente novamente: ");
			n2 = sc.nextDouble();
		}

		media = (n1 + n2) / 2;

		System.out.print("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}

}
