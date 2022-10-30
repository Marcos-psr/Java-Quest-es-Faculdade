import java.util.Scanner;

/*
14. Faça um programa em Java que obtenha o valor de uma compra,
calcule e mostre o valor da compra considerando o desconto, conforme
descrito abaixo:
d) para compras acima de R$ 200 a loja dá um desconto de 20%
e) para compras abaixo disso não há desconto. 
 */

public class Questao14 {
	public static void main(String[] args) {
		float valorCompra, valorFinal;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor total da compra: ");
		valorCompra = sc.nextFloat();

		sc.close();

		if(valorCompra > 200) {
			valorFinal = valorCompra * 0.8f;
		} else {
			valorFinal = valorCompra;
		}

		System.out.printf("O valor total da compra é de R$ %.2f", valorFinal);
	}
}

