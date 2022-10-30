import java.util.Scanner;

/*
 13. Escreva um método chamado converteDolar que recebe dois
parâmetros reais, um é o valor total em reais (R$) e o segundo a
cotação do dólar. O método deve calcular e retornar o valor em Dólar
($). Faça um algoritmo principal que solicite ao usuário o valor que o
mesmo deseja converter e a cotação do dólar e usando o método
definido acima, mostre o valor em dólar.
 */

public class Questao13 {
	public static void main(String[] args) {
		float valorReal, cotacaoDolar, valorDolar;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor em reais para ser convertido: ");
		valorReal = sc.nextFloat();

		System.out.print("Insira o valor da cotação do dólar: ");
		cotacaoDolar = sc.nextFloat();

		sc.close();

		valorDolar = converteDolar(valorReal, cotacaoDolar);
		System.out.printf("R$ %.2f = $ %.2f", valorReal, valorDolar);
	}
	
	public static float converteDolar(float valorReais, float cotacaoDolar) {
		return valorReais * cotacaoDolar;
	}
}
