import java.util.Scanner;

public class exercício_negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		int vet[] = new int[10];
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for (i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
