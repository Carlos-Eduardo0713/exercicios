import java.util.Locale;
import java.util.Scanner;

public class exercício_experiências {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, c = 0, r = 0, s = 0, total_cobaias = 0, cobaias;
		double percent_c, percent_r, percent_s;
		char tipo_cobaia;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			cobaias = 0;
			System.out.print("Quantidade de cobais: ");
			cobaias = sc.nextInt();
			
			System.out.print("Tipo de cobaia: ");
			tipo_cobaia = sc.next().charAt(0);
			
			total_cobaias += cobaias;
			
			if (tipo_cobaia == 'C') {
				c += cobaias;
			}
			else if (tipo_cobaia == 'R') {
				r += cobaias;
			}
			else if (tipo_cobaia == 'S') {
				s += cobaias;
			}
			
		}
		
		percent_c = (double)c / total_cobaias * 100;
		percent_r = (double)r / total_cobaias * 100;
		percent_s = (double)s / total_cobaias * 100;
		
		System.out.println();
		System.out.println("RELATÓRIO FINAL:");
		System.out.println("Total: " + total_cobaias + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percent_c));
		System.out.println("Percentual de ratos: " + String.format("%.2f", percent_r));
		System.out.print("Percentual de sapos: " + String.format("%.2f", percent_s));
		
		sc.close();
	}

}
