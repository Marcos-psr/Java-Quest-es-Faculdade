import java.util.Scanner;

/*
1. Faça um método que receba como parâmetros o Km inicial, Km final,
quantidade de litros gastos e preço do litro. Calcule e mostre:
a) Distância percorrida;
b) Consumo médio;
c) Valor gasto;

2. Faça um algoritmo principal que solicite para o usuário o valor da
quilometragem inicial, final, a quantidade de litros gastos e o preço do
litro e mostre a distância percorrida, o consumo médio e o valor gasto,
para isso utilize o método definido acima.
 */

public class Questao1e2 {
	public static void main(String[] args) {
		float kmInicial, kmFinal, litrosGastos, precoLitro;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o km inicial: ");
		kmInicial = sc.nextFloat();

		System.out.print("Insira o km final: ");
		kmFinal = sc.nextFloat();

		System.out.print("Insira a quantidade de litros de combustível gastos: ");
		litrosGastos = sc.nextFloat();

		System.out.print("Insira o preço do litro: ");
		precoLitro = sc.nextFloat();

		sc.close();

		Calculo(kmInicial, kmFinal, litrosGastos, precoLitro);
	}


	public static void Calculo(float kmInicial, float kmFinal, float litrosGastos, float precoLitro) {
		float distanciaPercorrida = kmFinal - kmInicial;

		System.out.println("A distância percorrida foi de " + distanciaPercorrida + "km");
		System.out.println("O consumo médio foi de " + (distanciaPercorrida / litrosGastos));
		System.out.println("O valor gasto foi de R$ " +  (litrosGastos * precoLitro));
	}
}