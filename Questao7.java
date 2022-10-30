import java.util.Scanner;

/*
7. Elabore um algoritmo para calcular as raízes de uma equação de 
segundo grau ax²+bx+c, conhecidos os coeficientes a, b, c. Lembre-se
que as raízes x1 e x2 são calculadas pela fórmula. Elabore métodos 
separados, funções, getDelta(a,b,c), getX1(a,b,c) e getX2(a,b,c). 
Também, elabore o método principal para efetuar a leitura de dados e 
chamar às restantes funções
 */

public class Questao7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, delta;
		double x1, x2;

		System.out.print("Insira o valor de a: ");
		a = sc.nextInt();

		System.out.print("Insira o valor de b: ");
		b = sc.nextInt();

		System.out.print("Insira o valor de c: ");
		c = sc.nextInt();

		delta = getDelta(a, b, c);
		x1 = getX1(a, b, c);
		x2 = getX2(a, b, c);

		System.out.print("O valor da primeira raíz é " + x1);
		System.out.print("\nO valor da segunda raíz é " + x2);
		System.out.print("\nO valor de delta é " + delta);
		sc.close();

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