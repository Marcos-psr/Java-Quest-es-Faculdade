import java.util.Scanner;

/*
10. A loja de pregos Pregão comercializa dois tipos de pregos, o telheiro e o 
quadrado. Cada telheiro custa R$ 1,05 e o quadrado custa R$ 0,51. Ao 
final do dia, o gerente quer saber quanto arrecadou com a venda dos 
pregos do tipo telheiro e quadrado (juntos), e quanto deve separar de 
comissão (10% do total arrecadado). Faça um programa para obter as 
quantidades de pregos do tipo telheiro e quadrado que foram vendidos, 
calcule e mostre o valor arrecadado com as vendas e o valor da 
comissão.
 */

public class Questao10 {
	public static void main(String[] args) {
		int pregoTelheiro, pregoQuadrado;
		float valorArrecadado, valorComissao;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a quantidade de pregos quadrados vendidos: ");
		pregoQuadrado = sc.nextInt();

		System.out.print("Insira a quantidade de pregos telheiro vendidos: ");
		pregoTelheiro = sc.nextInt();

		sc.close();

		valorArrecadado = (pregoQuadrado * 0.51f) + (pregoTelheiro * 1.05f);
		valorComissao = valorArrecadado * 0.1f;

		System.out.printf("O valor total foi de R$ %.2f e a comissão é de R$ %.2f", valorArrecadado, valorComissao);

	}
}
