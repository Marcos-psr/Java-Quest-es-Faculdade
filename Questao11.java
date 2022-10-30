import java.util.Scanner;

/*
11. Escreva um método chamado valorCofre que aceite três parâmetros
inteiros chamados vinteCinco, dez e cinco, que conterão a quantidade de
moedas de 25, 10 e 5 centavos respectivamente de um cofre. O método
deve calcular e retornar o valor em reais (R$). Faça um algoritmo
principal que solicite ao usuário a quantidade de moedas de 25, 10 e 5
centavos e usando o método definido acima, mostre o valor em reais.
 */

public class Questao11 {
	public static void main(String[] args) {
		int vinteCinco, dez, cinco;
		float valorTotal;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a quantidade de moedas de 25 centavos: ");
		vinteCinco = sc.nextInt();

		System.out.print("Insira a quantidade de moedas de 10 centavos: ");
		dez = sc.nextInt();

		System.out.print("Insira a quantidade de moedas de 5 centavos: ");
		cinco = sc.nextInt();		

		sc.close();

		valorTotal = valorCofre(vinteCinco, dez, cinco);
		System.out.printf("O total é de R$ %.2f", valorTotal);
		System.out.printf("\n%.2f real e %.2f centavo(s)", Math.floor(valorTotal), valorTotal % 1);
	}

	public static float valorCofre(int vinteCinco, int dez, int cinco) {
		float total = ((vinteCinco * 25) + (dez * 10) + (cinco * 5));
		return total / 100;
	}
}