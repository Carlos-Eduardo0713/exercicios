import java.util.Scanner;

public class exercício_sequência_ímpares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, i;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		
		for (i = 1; i < x + 1; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
