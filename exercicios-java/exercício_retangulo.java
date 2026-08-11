import java.util.Locale;
import java.util.Scanner;


public class exercício_retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retângulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retângulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		System.out.println("ÁREA = " + String.format("%.4f", area));
		
		perimetro = (2 * base) + (2 * altura);
		System.out.println("PERÍMETRO = " + String.format("%.4f", perimetro));
		
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
