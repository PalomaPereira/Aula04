import java.util.Scanner;

public class ExercicioBonus07 {

	public static void main(String[] args) {
		/*
		 * No parque Valter Dino World, os clientes podem ter a chance de passar uma
		 * noite no castelo da princesa Javarella. Para isso, devem acertar quantos
		 * feijões estão em um jarro (1238). Faça um programa que solicite a digitação
		 * da quantidade de feijões até que um cliente acerte.
		 */

		int qtdefeijao = 0;
		Scanner leitor = new Scanner(System.in);

		System.out.println("JOGO DE ADIVINHAÇÃO");
		System.out.println("Quantos feijões estão no jarro?");

		while (qtdefeijao != 1238) {
			qtdefeijao = leitor.nextInt();
			if (qtdefeijao != 1238) {
				System.out.println("Não foi dessa vez!!! Tente novamente!");
			}
		}

		leitor.close();

		System.out.println("Parabéns! Você acertou!");

	}

}
