import java.util.Scanner;

/*
25. Criar um algoritmo que leia a idade de uma pessoa e informe sua classe
eleitoral:
a) não-eleitor (abaixo de 16 anos)
b) eleitor obrigatório (entre 18 e 65 anos)
c) eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
 */

public class Questao25 {
	public static void main(String[] args) {
		int idade;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a sua idade: ");
		idade = sc.nextInt();

		sc.close();

		if (idade < 16) {
			System.out.print("Você é um não-eleitor.");
		} else if (idade >= 18 && idade <= 65) {
			System.out.print("Você é um eleitor obrigatório.");
		} else {
			System.out.print("Você é um eleitor facultativo.");
		}
	}
}
