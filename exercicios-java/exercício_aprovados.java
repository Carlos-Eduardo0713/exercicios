import java.util.Locale;
import java.util.Scanner;

public class exercício_aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		sc.nextLine(); 		//limpeza de buffer
		
		String nomes[] = new String[n];
		double n1[] = new double[n];
		double n2[] = new double[n];
		double medias[] = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			nomes[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
			sc.nextLine(); 		//limpeza de buffer
		}
		
		for (i = 0; i < n; i++) {
			medias[i] = (n1[i] + n2[i]) / 2;
		}
		
		System.out.println("Alunos aprovados:");
		
		for (i = 0; i < n; i++) {
			if (medias[i] >= 6) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
