import java.util.Scanner;

public class exercício_acima_diagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, j, soma = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j > i) {
					soma += mat[i][j];
				}
			}
		}
		
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		
		
		sc.close();
	}

}
