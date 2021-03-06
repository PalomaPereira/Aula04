import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
		 * calcular essa m�dia?
		 */

		Scanner leitor = new Scanner(System.in);
		int idade, i = 0;
		double media = 0;
		int qtdealunos = 0;

		System.out.println("Informe a quantidade de alunos da sala:");

		qtdealunos = leitor.nextInt();

		while (i < qtdealunos) {
			System.out.println("Informe a idade do " + (i + 1) + "� aluno:");
			idade = leitor.nextInt();
			media = media + idade;
			i++;
		}

		leitor.close();

		media = media / (double) qtdealunos;

		System.out.println("A m�dia de idades dos alunos �: " + media);

	}

}
