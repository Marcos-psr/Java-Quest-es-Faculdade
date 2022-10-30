import java.util.Scanner;

/*
16. Crie um programa que solicite ao usuário o seu turno de trabalho e a
quantidade de horas trabalhadas, calcule e mostre o valor do salário.
Considere os valores de horas a seguir, de acordo com o turno de
trabalho. Caso o turno seja igual a ‘N’ (utilize um caractere para
representar) o valor da hora trabalhada é R$ 45,00, caso contrário é R$
37,50
 */


public class Questao16 {
	public static void main(String[] args) {
		float salarioTotal;
		int horasTrabalhadas;
		String turno;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a incial do turno trabalhado: ");
		turno = sc.nextLine();
		System.out.print(turno);

		System.out.print("Insira a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();

		sc.close();

		if(turno.toUpperCase().equals("N")) {
			salarioTotal = horasTrabalhadas * 45;
		} else {
			salarioTotal = horasTrabalhadas * 37.5f;
		}

		System.out.printf("O salário total foi de R$ %.2f", salarioTotal);
	}
}
