import java.util.Scanner;

/*
27. Faça um algoritmo que solicite um código referente ao tipo da diária de
hospedagem e também a quantidade de diárias desejada por um cliente.
Calcule e mostre, usando estrutura condicional aninhada, o valor total a
pagar pelo cliente, conforme a tabela abaixo. Caso seja digitado um
código diferente dos apresentados na tabela acima deve ser mostrada a
mensagem “Tipo de diária inválido”.
 */

public class Questao27 {
	public static void main(String[] args) {
		String codigoDiaria;
		float valorDiaria;
		int quantidadeDiarias;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tipo de diária: ");
		codigoDiaria = sc.next();

		System.out.print("Insira a quantidade de diárias: ");
		quantidadeDiarias = sc.nextInt();
		
		sc.close();

		if(codigoDiaria.toUpperCase().equals("S")) {
			valorDiaria = 255.5f;
			System.out.printf("Valor total: R$ %.2f", valorDiaria * quantidadeDiarias);
		} else if(codigoDiaria.toUpperCase().equals("D")) {
			valorDiaria = 305.5f;
			System.out.printf("Valor total: R$ %.2f", valorDiaria * quantidadeDiarias);
		} else if(codigoDiaria.toUpperCase().equals("T")) {
			valorDiaria = 360.5f;
			System.out.printf("Valor total: R$ %.2f", valorDiaria * quantidadeDiarias);
		} else {
			System.out.print("Valor Inválido");
		}		
	}
}
