import java.util.Scanner;

/*
12. Faça um procedimento que recebe como parâmetros o peso e a altura
de uma pessoa, calcula e mostra o valor de seu IMC (índice de massa
corporal). Faça um algoritmo que solicite o peso e altura de uma pessoa,
em seguida calcule e mostre o IMC utilizando o procedimento criado.
Sabendo que:
IMC = peso /altura2.
 */

public class Questao12 {
	public static void main(String[] args) {
		float peso, altura;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a sua altura em metros: ");
		altura = sc.nextFloat(); 

		System.out.print("Insira o seu peso em metros: ");
		peso = sc.nextFloat();

		sc.close();

		calculoIMC(peso, altura);

	}
	public static void calculoIMC(float peso, float altura) {
		float imc = peso / (altura * altura);
		System.out.printf("O valor do imc é de %.2f", imc);
	}
}
