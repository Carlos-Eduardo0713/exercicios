import java.util.Locale;
import java.util.Scanner;

public class exercício_pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valor_porhora, horas_trabalhadas, pagamento;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valor_porhora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		horas_trabalhadas = sc.nextDouble();
		
		pagamento = valor_porhora * horas_trabalhadas;
		
		System.out.print("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));

		sc.close();
	}

}