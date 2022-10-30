import java.util.Scanner;

/*
23. Faça um programa em Java que obtenha o preço atual de um produto e
a sua venda média mensal, calcule e mostre o novo preço (pode ser
aumentado ou diminuído). Para isso, utilize a tabela abaixo:
 */

public class Questao23 {
	public static void main(String[] args) {
		float precoAtual, vendaMedia, novoPreco;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor atual do produto: ");
		precoAtual = sc.nextFloat();

		System.out.print("Insira o valor da venda média do produto: ");
		vendaMedia = sc.nextFloat();

		sc.close();

		if(precoAtual < 30 && vendaMedia < 500) {
			novoPreco = precoAtual * 1.1f;
		} else if ((precoAtual >= 30 && precoAtual < 80) && (vendaMedia >= 500 && vendaMedia < 1200)) {
			novoPreco = precoAtual * 1.15f;
		} else if (precoAtual >= 80 && vendaMedia >= 1200) {
			novoPreco = precoAtual * 0.8f;
		} else {
			novoPreco = precoAtual;
		}

		System.out.printf("O novo preço do produto é de %.2f", novoPreco);
	}
}
