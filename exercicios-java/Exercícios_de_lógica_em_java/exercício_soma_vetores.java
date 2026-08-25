import java.util.Scanner;

public class exercício_soma_vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		int A[] = new int[n];
		int B[] = new int[n];
		int C[] = new int[n];
		
		
		System.out.println("Digite os valores do vetor A:");
		for (i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor C:");
		for (i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (i = 0; i < n; i++) {
			System.out.println(C[i]);
		}

		sc.close();
	}

}
