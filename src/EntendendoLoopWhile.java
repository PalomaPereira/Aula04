import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem 5 e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
		 * calcular essa m�dia?
		 */

		Scanner leitor = new Scanner(System.in);
		int idade, i = 0;
		double media = 0;

		while (i < 5) {
			System.out.println("Informe a idade do " + (i + 1) + "� aluno:");
			idade = leitor.nextInt();
			media = media + idade;
			i++;
			// ou i+=1
		}

		leitor.close();

		media = media / 5.0;

		System.out.println("A m�dia de idades dos alunos �: " + media);

	}

}
