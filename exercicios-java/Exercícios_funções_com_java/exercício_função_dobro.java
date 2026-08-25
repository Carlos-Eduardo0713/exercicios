package curso_programacao.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exercício_função_dobro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		int result = dobro(num);
		
		mostrar(result);

		
		sc.close();
	}

	public static int dobro(int x) {
		return x * 2;
	}
	
	public static void mostrar(int valor) {
		System.out.printf("O dobro é: %d", valor);
	}
	
	
}
