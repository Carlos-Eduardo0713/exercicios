package curso_programacao.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exercícios_função_calculadora_simples {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Priemiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Operação: ");
		sc.nextLine();
		String op = sc.nextLine();

		
		System.out.println();
		mostrarResultado(op, n1, n2);

		
		sc.close();
	}

	public static double somar(double x, double y) {
		return x + y;
	}
	
	public static double subtrair(double x, double y) {
		return x - y;
	}
	
	public static double multiplicar(double x, double y) {
		return x * y;
	}
	
	public static double dividir(double x, double y) {
		return x / y;
	}
	
	public static double calcularResultado(String op, double n1, double n2) {
		switch (op) {
		case "+": 
			return  somar(n1, n2);
		case "-":
			return subtrair(n1, n2);
		case "*":
			return multiplicar(n1, n2);
		case "/":
			return dividir(n1, n2);
		default:
			return 0.0;
			}
	}
	
	public static void mostrarResultado(String op, double x, double y) {
		if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
			System.out.println("Operação inválida... Tente + - * /");
		}
		else if ((y == 0.0) && (op.equals("/"))) {
			System.out.print("Divisão impossível!");
		}
		else {
			System.out.printf("Resultado: %.2f", calcularResultado(op, x, y));
		}
	}
	
}
