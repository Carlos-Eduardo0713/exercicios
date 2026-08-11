import java.util.Scanner;

public class exercício_duração {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duracao_seg, horas, resto_horas, minutos, segundos;
		
		System.out.println("Digite a duração em segundos: ");
		duracao_seg = sc.nextInt();
		
		horas = duracao_seg / 3600;
		
		resto_horas = duracao_seg % 3600;
		
		minutos = (resto_horas / 60);
		
		segundos = duracao_seg % 60;
		
		System.out.print(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
