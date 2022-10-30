import java.util.Scanner;

/* 8. Elabore um algoritmo para calcular a velocidade de três objetos 
diferentes (com velocidade constante). Conhecemos (são dados 
digitados pelo usuário), para cada objeto, a distância percorrida e o 
tempo que necessitou para percorrer essa distância. Utilize um método 
geral que calcule e retorne a velocidade de um objeto, fornecidos como 
parâmetros os dados de distância e tempo.
 */

public class Questao8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float distancia, tempo;

		for(int i = 1; i <= 3; i++) {
			System.out.printf("Insira a distância percorrida pelo %dº objeto em metros: ", i);
			distancia = sc.nextFloat();

			System.out.printf("Insira o tempo total do %dº objeto em segundos: ", i);
			tempo = sc.nextFloat();

			System.out.printf("O valor do %dº objeto é de %.2f m/s²\n\n", i, calculaVelocidade(distancia, tempo));
		}

		sc.close();
	}
	
	public static float calculaVelocidade(float distancia, float tempo) {
		return distancia / tempo;
	}
}