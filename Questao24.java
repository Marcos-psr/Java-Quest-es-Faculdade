import java.util.Scanner;

/*
24. Elabore um algoritmo para calcular as raízes de uma equação de
segundo grau, mas verifique nesta versão que delta deverá ser um valor
positivo, para poder calcular e visualizar as raízes reais da equação.
Caso contrário, visualize uma mensagem explicando que não serão
calculadas as raízes. 
 */

public class Questao24 {
	public static void main(String[] args) {
		int a, b, c, delta;
		double x1, x2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor de a: ");
		a = sc.nextInt();

		System.out.print("Insira o valor de b: ");
		b = sc.nextInt();

		System.out.print("Insira o valor de c: ");
		c = sc.nextInt();

		sc.close();

		delta = getDelta(a, b, c);
		if (delta > 0) {
			x1 = getX1(a, b, c);
			x2 = getX2(a, b, c);

			System.out.print("O valor da primeira raíz é " + x1);
			System.out.print("\nO valor da segunda raíz é " + x2);
			System.out.print("\nO valor de delta é " + delta);
		} else {
			System.out.print("\nNão existe raízes reais para os números inseridos!");
		}

	}

	public static int getDelta(int a, int b, int c) {
		return (b * b) - (4 * a * c);
	}

	public static double getX1(int a, int b, int c) {
		int delta = getDelta(a, b, c);
		return  (-b + Math.sqrt(delta)) / (2 * a);
	}

	public static double getX2(int a, int b, int c) {
		int delta = getDelta(a, b, c);
		return (-b - Math.sqrt(delta)) / (2 * a);
	}
}
