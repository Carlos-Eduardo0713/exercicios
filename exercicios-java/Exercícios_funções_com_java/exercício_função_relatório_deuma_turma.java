package curso_programacao.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exercício_função_relatório_deuma_turma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


        double[][] notas = preencherNotas();
        double[] medias = calcularMedia(notas);
        String[] situacoes = verificarSituacao(medias);

        //mostrarRelatorio(double notas, double[] medias, String[] situacoes);

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("\nMédia do %d° aluno: %.2f", i+1, medias[i]);
        }
        System.out.println();

        for (int i = 0; i < situacoes.length; i++) {
            System.out.printf("\n%d° aluno: %s", i+1, situacoes[i]);
        }
        System.out.println();

        System.out.printf("\nMaior média da turma: %.2f",maiorMedia(medias));
        System.out.println();

    System.out.printf("\nMédia geral da turma: %.2f", mediaGeral(medias));

        sc.close();
    }
    
    public static double[][] preencherNotas() {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[5][3];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Digite a %dª nota do %dº aluno: ",j+1, i+1);
                notas[i][j] = sc.nextDouble();
            }
        }

        return notas;
    }

    public static double[] calcularMedia(double[][] tabela) {
        double[] medias = new double[tabela.length];
        for (int i = 0; i < tabela.length; i++) {
            double soma = 0;
            for (int j = 0; j < tabela[i].length; j++) {
                soma += tabela[i][j];
            }
            medias[i] = (double)soma / tabela[i].length;
        }

        return medias;
    }

    public static String[] verificarSituacao(double[] medias) {
        String[] situacoes = new String[medias.length];
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] >= 7) {
                situacoes[i] = "Aprovado";
            } else if (medias[i] >= 4) {
                situacoes[i] = "Recuperação";
            }
            else {
                situacoes[i] = "Reprovado";
            }
        }
        
        return situacoes;
    }

    public static double maiorMedia(double[] medias) {
        double maior = medias[0];
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] > maior) {
                maior = medias[i];
            }
        }

        return maior;
    }

    public static double mediaGeral(double[] medias) {
        double soma = 0;
        double resultado = 0;
        for (int i = 0; i < medias.length; i++) {
            soma += medias[i];
        }
        resultado = soma / medias.length;

        return resultado;
    }


}

