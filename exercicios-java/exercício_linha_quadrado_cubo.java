package curso_programacao.exercícios;

import java.util.Scanner;

public class exercicio_linha_quadrado_cubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
		}
		
		
		sc.close();
	}

}
