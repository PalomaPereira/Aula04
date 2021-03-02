import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem 5 e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual é a melhor forma de
		 * calcular essa média?
		 */

		Scanner leitor = new Scanner(System.in);
		int idade, i = 0;
		double media = 0;

		while (i < 5) {
			System.out.println("Informe a idade do " + (i + 1) + "º aluno:");
			idade = leitor.nextInt();
			media = media + idade;
			i++;
			// ou i+=1
		}

		leitor.close();

		media = media / 5.0;

		System.out.println("A média de idades dos alunos é: " + media);

	}

}
