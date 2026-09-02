import java.util.Locale;
import java.util.Scanner;

public class exercício_lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double valor = 0;
		
		
		System.out.print("Código do produto comprado: ");
		cod = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		System.out.print("Valor a pagar: R$ ");
		
		if (cod == 1) {
			valor = qtd * 5;
		}
		else if (cod == 2) {
			valor = qtd * 3.5;
		}
		else if (cod == 3) {
			valor = qtd * 4.8;
		}
		else if (cod == 4) {
			valor = qtd * 8.9;
		}
		else if (cod == 5) {
			valor = qtd * 7.32;
		}
		
		System.out.print(String.format("%.2f", valor));
		
		sc.close();
	}

}
