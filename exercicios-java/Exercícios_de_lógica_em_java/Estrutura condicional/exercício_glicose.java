import java.util.Locale;
import java.util.Scanner;

public class exercício_glicose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida de glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.print("Classificação: normal");
		}
		else if (glicose <= 140) {
			System.out.print("Classificação: elevado");
		}
		else {
			System.out.print("Classificação: diabetes");
		}
		
		sc.close();
	}

}