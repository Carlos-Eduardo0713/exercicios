import java.util.Locale;
import java.util.Scanner;

public class exercício_troco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco_unidade, dinheiro, troco;
		int qtd;
		
		System.out.print("Preço unitário do produto: ");
		preco_unidade = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - (preco_unidade * qtd);
		
		System.out.println("TROCO = " + String.format("%.2f", troco));

		sc.close();
	}

}
