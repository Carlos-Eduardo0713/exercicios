import java.util.Scanner;

public class exercício_negativos_matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m, n, i, j;
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		m = sc.nextInt();
		
		System.out.print("Quantas colunas vai ter a matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		sc.close();
	}

}
