
import java.util.Locale;
import java.util.Scanner;

import exercício2.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + funcionario);
		System.out.println("\n");
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		System.out.println();
		funcionario.IncreaseSalary(percentage);
		System.out.println("updated data: " + funcionario);
		
		
		
		sc.close();
	}

}
