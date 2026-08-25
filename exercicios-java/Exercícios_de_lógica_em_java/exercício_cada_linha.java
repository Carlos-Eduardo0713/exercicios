import java.util.Scanner;

public class exercício_cada_linha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n, i, j, maior;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		
		for (i = 0; i < n; i++) {
			maior = mat[0][0];
			for (j = 0; j < n; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}
		
		
		sc.close();
	}

}
