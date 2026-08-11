import java.util.Locale;
import java.util.Scanner;

public class exercício_consumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia_km;
		double combustivel, media;
		
		System.out.print("Distância percorrida: ");
		distancia_km = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		combustivel = sc.nextDouble();
		
		media = distancia_km / combustivel;
		System.out.print("Consumo médio = " + String.format("%.3f", media));
		
		sc.close();
	}

}
