import java.util.Scanner;

/* 
3. Escreva um método com retorno que receba como parâmetros os lados
de um retângulo, calcula e retorna o valor de sua área.
area = lado*lado

4. Faça um algoritmo principal que solicite os valores dos lados de um
retângulo ao usuário, e utilizando a função definida acima, calcule e
mostre o valor de área.
 */
public class Questao3e4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float lado, area;

		System.out.print("Insira o valor do lado: ");
		lado = sc.nextFloat();

		area = calculaArea(lado);
		System.out.printf("O valor da área é de %.2f ", area);

		sc.close();
	}

	public static float calculaArea(float lado) {
		return lado * lado;
	}
}
