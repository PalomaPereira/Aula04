import java.util.Scanner;

public class ExercicioBonus07 {

	public static void main(String[] args) {
		/*
		 * No parque Valter Dino World, os clientes podem ter a chance de passar uma
		 * noite no castelo da princesa Javarella. Para isso, devem acertar quantos
		 * feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o
		 * da quantidade de feij�es at� que um cliente acerte.
		 */

		int qtdefeijao = 0;
		Scanner leitor = new Scanner(System.in);

		System.out.println("JOGO DE ADIVINHA��O");
		System.out.println("Quantos feij�es est�o no jarro?");

		while (qtdefeijao != 1238) {
			qtdefeijao = leitor.nextInt();
			if (qtdefeijao != 1238) {
				System.out.println("N�o foi dessa vez!!! Tente novamente!");
			}
		}

		leitor.close();

		System.out.println("Parab�ns! Voc� acertou!");

	}

}
