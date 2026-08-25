import java.util.Scanner;

public class exercício_soma_matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m, n, i, j;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = sc.nextInt();
		
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();
		
		int[][] A = new int[m][n];
		int[][] B = new int[m][n];
		int[][] C = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				B[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
