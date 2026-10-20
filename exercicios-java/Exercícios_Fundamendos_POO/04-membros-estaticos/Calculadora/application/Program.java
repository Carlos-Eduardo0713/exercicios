package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Calculator calc = new Calculator(); 	<- Não é preciso instanciar uma classe utilitária
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculadora.circumference(radius);  // <- Perceba que apenas chamei o nome da Classe
		
		double v = Calculadora.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculadora.PI);
		
		/*
		   geralmente métodos static utilizam valores dentro do parâmetro "()". 
		   Métodos static não dependem de valores do objeto, e não precisam ser instanciados no Main
		   static é utilizado para constantes ("final") e classes utilitárias (calculos, conversores,
		   validadores), essas classes apenas recebem dados (no parâmetro), processam e retornam sem
		   alterar nada da classe, pois é static.
		*/
		
		sc.close();
	}

}
