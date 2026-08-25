import java.util.Locale;
import java.util.Scanner;

public class exercício_comerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, abaixode10 = 0, entre = 0, acimade20 = 0;
		double total_compra = 0, total_venda = 0, total_lucro;
		
		System.out.print("Serão digitados quantos produtos? ");
		n = sc.nextInt();
		sc.nextLine(); 		// limpeza de buffer
		
		String produtos[] = new String[n];
		double precos_compra[] = new double[n];
		double precos_venda[] = new double[n];
		double lucros[] = new double[n];
		
		for (i =0; i < n; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			produtos[i] = sc.nextLine();
			
			System.out.print("Preço de compra: ");
			precos_compra[i] = sc.nextDouble();
			
			System.out.print("Preço de venda: ");
			precos_venda[i] = sc.nextDouble();
			sc.nextLine(); 		//limpeza de buffer
		}
		
		for (i = 0; i < n; i++) {
			lucros[i] = (precos_venda[i] - precos_compra[i]) / precos_compra[i] * 100;
			total_compra += precos_compra[i];
			total_venda += precos_venda[i];
		}
		
		total_lucro = total_venda - total_compra;
		
		for (i = 0; i < n; i++) {
			if (lucros[i] < 10) {
				abaixode10 += 1;
			}
			else if (lucros[i] < 20) {
				entre += 1;
			}
			else {
				acimade20 += 1;
			}
		}
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: " + abaixode10);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acimade20);
		System.out.println("Valor total de compra: " + String.format("%.2f", total_compra));
		System.out.println("Valor total de venda: " + String.format("%.2f", total_venda));
		System.out.print("Lucro total: " + String.format("%.2f", total_lucro));
		
		sc.close();
	}

}
