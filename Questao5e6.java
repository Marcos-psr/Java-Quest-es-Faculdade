import java.util.Scanner; 

/*
5. Construir um método que receba como parâmetros o valor de uma
compra e a quantidade de parcelas e calcula e retorna o valor da
parcela, sabendo que a loja acrescenta 5% de juros para as compras
parceladas.

6. No algoritmo principal, solicite para o usuário o valor de uma compra e a
quantidade de parcelas e utilizando o método descrito acima, mostre o
valor da parcela.
 */

public class Questao5e6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valorCompra, quantidadeParcelas, valorParcela;

		System.out.print("Insira o valor total da compra: ");
		valorCompra = sc.nextFloat();

		System.out.print("Insira a quantidade de parcelas: ");
		quantidadeParcelas = sc.nextFloat();

		valorParcela = calculaJuros(valorCompra, quantidadeParcelas);
		System.out.printf("O valor de uma parcela é de R$ %.2f", valorParcela);
		sc.close();

	}

	public static float calculaJuros(float valorCompra, float quantidadeParcelas) {
		return (valorCompra * 1.05f) / quantidadeParcelas;
	}

}