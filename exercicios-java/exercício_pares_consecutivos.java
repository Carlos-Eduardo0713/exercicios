import java.util.Scanner;

public class exercício_pares_consecutivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, cont, soma;
		
		System.out.print("Digite um número inteiro: ");
		x =sc.nextInt();
		
		while (x != 0) {
			if (x % 2 == 0) {
				soma = x;
				cont = 0;
				while (cont < 4) {
					x += 2;
					soma += x;
					cont += 1;
				}
				
			}
			else {
				x += 1;
				soma = x;
				cont = 0;
				while (cont < 4) {
					x += 2;
					soma += x;
					cont += 1;
				}

			}
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();

		}
		
		sc.close();
	}

}
