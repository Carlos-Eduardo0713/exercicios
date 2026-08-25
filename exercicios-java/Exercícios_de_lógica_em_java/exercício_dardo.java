import java.util.Locale;
import java.util.Scanner;

public class exercício_dardo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double d1, d2, d3;
		
		
		System.out.println("Digite as tres distâncias:");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		d3 = sc.nextDouble();
		
		System.out.print("MAIOR DISTÂNCIA = ");
		
		if ((d1 > d2) && (d1 > d3)) {
			System.out.print(String.format("%.2f", d1));
		}
		else if ((d2 > d3)) {
			System.out.print(String.format("%.2f", d2));
		}
		else {
			System.out.print(String.format("%.2f", d3));
		}
		
		sc.close();
	}

}