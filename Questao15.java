import java.util.Scanner;

/*
15. Escreva um programa que solicite um número ao usuário. Caso seja
digitado um valor entre 0 e 9, mostre: “valor correto”, caso contrário
mostre: “valor incorreto”.
 */


public class Questao15 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número de 0 a 9: ");
		numero = sc.nextInt();
		
		if(numero >=0 && numero <= 9) {
			System.out.print("Valor correto!");
		} else {
			System.out.print("Valor incorreto!");
		}
		
		sc.close();
	}

}
