import java.util.Locale;
import java.util.Scanner;

public class exercício_aumento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novo_salario, aumento;
		int porcentagem;
		
		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000) {
			porcentagem = 20;
		}
		else if (salario <= 3000) {
			porcentagem = 15;
		}
		else if (salario <= 8000) {
			porcentagem = 10;
		}
		else {
			porcentagem = 5;
		}
		
		aumento = (double)porcentagem/100 * salario;
		novo_salario = salario + aumento;
		
		System.out.println("Novo salário = R$ " + String.format("%.2f", novo_salario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.print("Porcentagem = " + porcentagem + " %");
		
		sc.close();
	}

}
