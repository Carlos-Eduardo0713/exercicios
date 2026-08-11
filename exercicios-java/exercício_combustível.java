import java.util.Scanner;

public class exercício_combustível {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gas = 0, diesel = 0, cod;
		
				
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		cod = sc.nextInt();
		
		while (cod != 4) {
			if (cod == 1) {
				alcool += 1;
			}
			else if (cod == 2) {
				gas += 1;
			}
			else if (cod == 3) {
			}
			
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gas);
		System.out.print("Diesel: " + diesel);
		
		sc.close();
	}

}