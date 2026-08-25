package curso_programacao.exercícios;

import java.util.Scanner;

public class exercícios_função_ehPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		boolean resultado = ehPar(num);
		
		exibir(resultado);
		
		sc.close();
	}

	public static boolean ehPar(int x) {
		return (x % 2 == 0);
	}
	
	public static void exibir(boolean x) {
		if (x) {
			System.out.print("O número é par.");
		}
		else {
			System.out.print("O número é ímpar.");
		}
	}
	
}

