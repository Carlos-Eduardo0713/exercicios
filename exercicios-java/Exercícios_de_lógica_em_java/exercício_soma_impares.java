import java.util.Scanner;

public class exercício_soma_impares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, i, soma_impares, menor, maior;
		
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			maior = x;
			menor = y;
		}
		else {
			maior = y;
			menor = x;
		}
		
		soma_impares = 0;
		for (i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				soma_impares += i;
			}
		}
		
		System.out.print("SOMA DOS ÍMPARES = " + soma_impares);
		
		sc.close();
	}

}
