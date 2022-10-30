import java.util.Scanner;

/*
Desenvolva um programa em
Java que solicite ao usuário os valores dos lados de um retângulo e
calcule e mostre seu perímetro e sua área.
 */

public class Questao28 {
	public static void main(String[] args) {
		float altura, base, perimetro;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor da altura do retângulo: ");
		altura = sc.nextFloat();

		System.out.print("Insira o valor da base do retângulo: ");
		base = sc.nextFloat();

		sc.close();

		perimetro = calcularPerimetro(altura, base);
		System.out.printf("O perímetro do retângulo é %.2f", perimetro);

	}

	public static float calcularPerimetro(float altura, float base) {
		return (altura * 2) + (base * 2);
	}
}