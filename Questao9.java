import java.util.Scanner;

/*
9. Escreva um programa que obtenha o valor de um produto e, utilizando
um método, aplique nesse valor um desconto de 9% e mostre o novo
valor.
 */


public class Questao9 {
	public static void main(String[] args) {
		float valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor total do produto: ");
		valor = sc.nextFloat();
		sc.close();
		
		System.out.print("O valor final do produto é de " + aplicaDesconto(valor));

	}

	public static float aplicaDesconto(float valor) {
		return valor * 0.91f;
	}

}
