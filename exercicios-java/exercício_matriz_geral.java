import java.util.Locale;
import java.util.Scanner;

public class exercício_matriz_geral {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, j, l, c;
		double soma_positivos = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					soma_positivos += mat[i][j];
				}
			}
		}
		
		System.out.println();
		System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", soma_positivos));
		System.out.println();
		
		System.out.print("Escolha uma linha: ");
		l = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[l][i]) + " ");
		}
		
		System.out.println("\n");
		System.out.print("Escolha uma coluna: ");
		c = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][c]) + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][i]) + " ");
		}
		
		System.out.println("\n");
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		System.out.println("MATRIZ ALTERADA:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
