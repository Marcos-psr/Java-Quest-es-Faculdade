import java.util.Scanner;

/*
22. Elabore um algoritmo que leia um número inteiro entre 1 e 12 e
escreva o mês correspondente. Caso o usuário digite um número fora
desse intervalo, deverá aparecer uma mensagem informando que não
existe mês com este número.
 */

public class Questao22 {
	public static void main(String[] args) {
		int numero;
		String mes;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um mês de um a doze: ");
		numero = sc.nextInt();

		sc.close();

		switch (numero) {
		case 1: 
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7: 
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;
		default:
			mes = "Inváldio";
		}

		System.out.print(mes);
	}
}
