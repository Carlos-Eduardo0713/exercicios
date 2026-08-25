import java.util.Scanner;

public class exercício_dentro_fora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, x, dentro = 0, fora = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				dentro += 1;
			}
			else {
				fora += 1;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.print(fora + " FORA");

		sc.close();
	}

}
