import java.util.Scanner;

public class ExercicioBonus08 {

	public static void main(String[] args) {
		/*
		 * Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior
		 * do que a média. Faça um programa onde o professor informe a média e as notas
		 * de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram
		 * nota superior à média e quantos tiveram nota inferior à média.
		 */

		Scanner leitor = new Scanner(System.in);
		double media, nota;
		int notasup = 0, notainf = 0, i = 0;

		System.out.println("Informe a média da sala:");
		media = leitor.nextDouble();

		while (i < 50) {
			System.out.println("Informe a nota do " + (i + 1) + "º Aluno:");
			nota = leitor.nextDouble();

			if (nota < media) {
				notainf++;
			} else {
				notasup++;
			}

			i++;
		}

		leitor.close();

		System.out.println("Do total de 50 alunos, " + notainf + " tiveram notas abaixo da média e " + notasup
				+ " tiveram notas acimas da média.");
	}

}
