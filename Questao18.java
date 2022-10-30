import java.util.Scanner;

/*
18. Faça um algoritmo que a partir do preço à vista de um determinado
produto e a quantidade desejada de parcelas, calcule o preço total a
pagar e o valor da prestação mensal, referentes ao pagamento
parcelado. Se o pagamento for parcelado em 2 ou 3 vezes (menor ou
igual que 3 parcelas) deverá ser dado um acréscimo de 10% no total a
ser pago. Se for parcelado em 4 ou mais vezes, o acréscimo será de
20%.

 */

public class Questao18 {
	public static void main(String[] args) {
		float precoTotal;
		int quantidadeParcelas;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor total do produto: ");
		precoTotal = sc.nextFloat();

		System.out.print("Insira a quantidade de parcelas: ");
		quantidadeParcelas = sc.nextInt();

		sc.close();

		if(quantidadeParcelas >= 4) {
			precoTotal *= 1.2f;
		} else if(quantidadeParcelas >= 2) {
			precoTotal *= 1.1f;
		}

		System.out.printf("O valor total a ser pago é de R$ %.2f", precoTotal);
		System.out.printf("\nO valor da prestação é de %.2f", precoTotal / quantidadeParcelas);
	}
}