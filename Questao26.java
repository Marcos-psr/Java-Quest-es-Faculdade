import java.util.Scanner;

/*
26. Elabore um algoritmo que que leia o destino do passageiro partindo de
São Paulo e se a viagem inclui retorno (ida e volta). Ao final informar o
preço da passagem conforme a tabela dada a seguir. Observação:
Considere elaborar um menu de opções com os destinos e implemente a
solução com a estrutura escolha... caso

 */

public class Questao26 {
	public static void main(String[] args) {
		int codigo;
		float precoPassagem;
		String idaVolta;
		Scanner sc = new Scanner(System.in);

		System.out.print("1- Região Norte\n"
				+ "2- Região Nordeste\n"
				+ "3- Região Centro-Oeste\n"
				+ "4- Região Sul\n");
		System.out.print("\nInsira o código da região de destino: ");
		codigo = sc.nextInt();

		System.out.println("A viagem inclui retorno?");
		idaVolta = sc.next();

		sc.close();

		switch (codigo) {
		case 1:
			if(idaVolta.toUpperCase().equals("S")) {
				precoPassagem = 900;
			} else {
				precoPassagem = 500;
			}
			break;
		case 2:
			if(idaVolta.toUpperCase().equals("S")) {
				precoPassagem = 650;
			} else {
				precoPassagem = 350;
			}
			break;
		case 3:
			if(idaVolta.toUpperCase().equals("S")) {
				precoPassagem = 600;
			} else {
				precoPassagem = 350;
			}
			break;
		case 4:
			if(idaVolta.toUpperCase().equals("S")) {
				precoPassagem = 550;
			} else {
				precoPassagem = 600;
			}
			break;
		default:
			precoPassagem = 0;
		}

		if(precoPassagem == 0) {
			System.out.print("O número inserido é inválido!");
		} else {
			System.out.printf("O preço total da passagem é de R$ %.2f", precoPassagem);
		}

	}
}
