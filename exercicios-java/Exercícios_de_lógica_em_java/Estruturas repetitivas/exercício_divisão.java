import java.util.Locale;
import java.util.Scanner;

public class exercício_divisão {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double numerador, denominador;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			System.out.print("Entre com numerador: ");
			numerador = sc.nextDouble();
			
			System.out.print("Entre com denominador: ");
			denominador = sc.nextDouble();
			
			if (denominador == 0) {
				System.out.println("DIVISÃO IMPOSSÍVEL");
			}
			else {
				System.out.println("DIVISÃO = " + 
				String.format("%.2f", numerador / denominador));
			}
		}
		
		sc.close();
	}

}
