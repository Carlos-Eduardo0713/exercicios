import java.util.Locale;
import java.util.Scanner;

public class exercício_temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		char resp;
		
		System.out.print("Você vai digitar a temperatura em qual escala? ");
		resp = sc.next().charAt(0);
		
		if (resp == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			
			c = 5.0/9.0 * (f - 32);
			System.out.print("Temperatura equivalente em Celcius: " + String.format("%.2f", c));
		}
		else if (resp == 'C') {
			System.out.print("Digite a temperatura em Celcius: ");
			c = sc.nextDouble();
			
			f = c * 9.0/5.0 + 32;
			System.out.print("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", f));
		}
		
		sc.close();
	}

}