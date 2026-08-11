import java.util.Locale;
import java.util.Scanner;

public class exercício_troco_verificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco_unidade, dinheiro, troco, restante;
		int qtd;
		
		System.out.print("Preço unitário do produto: ");
		preco_unidade = sc.nextDouble();
		
		System.out.print("Quantidade compraa: ");
		qtd = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		if (dinheiro >= (preco_unidade * qtd)) {
			troco = dinheiro - (preco_unidade * qtd);
			System.out.print("TROCO = " + String.format("%.2f", troco));
		}
		else {
			restante = (preco_unidade * qtd) - dinheiro;
			System.out.print("DINHEIRO INSUFICIENTE. FALTAM " + 
			String.format("%.2f", restante) + " REAIS");
		}
		
		sc.close();
	}

}
