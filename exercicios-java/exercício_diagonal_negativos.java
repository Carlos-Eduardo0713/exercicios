import java.util.Scanner;

public class exercício_diagonal_negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, i, j, negativos;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		int mat[][] = new int[n][n];		
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		negativos = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					negativos += 1;
				}
			}
		}
		
		System.out.print("Quantidade de negativos = " + negativos);
		
		sc.close();
	}

}
