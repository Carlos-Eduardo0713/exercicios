import java.util.Scanner;

public class exercício_tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, i;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		x = sc.nextInt();
		
		for (i = 0; i < 11; i++) {
			System.out.println(x + " x " + i + " = " + x*i);
		}
		
		sc.close();
	}

}
