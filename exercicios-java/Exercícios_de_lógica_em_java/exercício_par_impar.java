import java.util.Scanner;

public class exercício_par_impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, x;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("NULO");
			}
			else if (x % 2 == 0) {
				System.out.print("PAR ");
				if (x > 0) {
					System.out.println("POSITIVO");
				}
				else {
					System.out.println("NEGATIVO");
				}
				
			}
			else if (x % 2 != 0) {
				System.out.print("IMPAR ");
				if (x > 0) {
					System.out.println("POSITIVO");
				}
				else {
					System.out.println("NEGATIVO");
				}
			}
		}

		
		sc.close();
	}

}