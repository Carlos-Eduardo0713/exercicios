import java.util.Locale;
import java.util.Scanner;

public class exercício_notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2; 
		
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		
		if (n1 + n2 >= 60) {
			System.out.print("NOTA FINAL = " + String.format("%.1f", n1 + n2));
		}
		else {
			System.out.println("NOTA FINAL = " + String.format("%.1f", n1 + n2));
			System.out.print("REPROVADO");
		}
		
		sc.close();
	}

}
