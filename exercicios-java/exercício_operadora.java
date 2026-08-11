import java.util.Locale;
import java.util.Scanner;

public class exercício_operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double minutos, valor_final;
		
		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextDouble();
		
		if (minutos > 100) {
			valor_final = 50 + ((minutos - 100) * 2);
		}
		else {
			valor_final = 50;
		}

		System.out.print("Valor a pagar: R$ " + String.format("%.2f", valor_final));
		
		sc.close();
	}

}