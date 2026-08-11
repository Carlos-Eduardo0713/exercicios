import java.util.Locale;
import java.util.Scanner;

public class exercício_circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;
		
		System.out.print("Digite o valor do raio do círculo: ");
		r = sc.nextDouble();
		
		area = 3.14159 * Math.pow(r, 2);
		
		System.out.print("AREA = " + String.format("%.3f", area));
		
		sc.close();
	}

}
