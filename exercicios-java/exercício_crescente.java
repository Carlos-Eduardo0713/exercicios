import java.util.Scanner;

public class exercício_crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			
			if (y > x) {
				System.out.println("CRESCENTE!");
			}
			else {
				System.out.println("DECRESCENTE!");
			}
			
			System.out.println("Digite outros dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
