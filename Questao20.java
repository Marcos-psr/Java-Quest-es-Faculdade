import java.util.Scanner;

/*
20. Na cidade de São Paulo a circulação de veículos é restrita a
determinados horários no chamado “Centro Expandido”. Com base no
digito final da placa, o motorista sabe se deve ou não circular no horário
proibido. Faça um algoritmo que receba o digito final da placa de um
automóvel e imprima qual o dia da semana o veículo não pode circular
no “Centro Expandido”. Utilize um método que recebe o digito da placa e
retorne o dia da semana conforme a tabela ao lado.
 */

public class Questao20 {
	public static void main(String[] args) {
		int ultimoDigito;
		String diaSemana;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o digíto final placa: ");
		ultimoDigito = sc.nextInt();

		sc.close();

		diaSemana = diaRodizio(ultimoDigito);

		System.out.print("O veículo não pode circular no seguinte dia da semana: " + diaSemana);
	}

	public static String diaRodizio(int ultimoDigito) {
		switch (ultimoDigito) {
		case 1:
		case 2:
			return "Segunda";
		case 3:
		case 4:
			return "Terça";
		case 5:
		case 6:
			return "Quarta";
		case 7:
		case 8:
			return "Quinta";
		case 9:
		case 0:
			return "Sexta";
		default:
			return "Número inválido";
		}

	}
}

