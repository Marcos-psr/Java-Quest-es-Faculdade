import java.util.Scanner;

/*
19. Faça um algoritmo que receba o código correspondente ao cargo de um
funcionário e seu salário atual e mostre o cargo, o valor do aumento e
seu novo salário. Os cargos estão na tabela a seguir, utilize a estrutura
escolha...caso.
 */

public class Questao19 {
	public static void main(String[] args) {
		int codigo;
		float salario, novoSalario;
		String cargo;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do seu salário atual: ");
		salario = sc.nextFloat();

		System.out.print("\n1  Escriturário\n2  Secretário\n"
				+ "3  Caixa\n4  Gerente\n5  Diretor");
		System.out.print("\n\nInsira o código de seu cargo: ");
		codigo = sc.nextInt();

		sc.close();

		switch (codigo) {
		case 1:
			novoSalario = salario * 1.5f;
			cargo = "Escriturário";
			break;
		case 2:
			novoSalario = salario * 1.35f;
			cargo = "Secretário";
			break;
		case 3:
			novoSalario = salario * 1.2f;
			cargo = "Caixa";
			break;
		case 4:
			novoSalario = salario * 1.1f;
			cargo = "Gerente";
			break;
		case 5:
			novoSalario = salario;
			cargo = "Diretor";
			break;
		default:
			novoSalario = 0;
			cargo = "";
		}

		if(cargo.equals("")) {
			System.out.print("Código inválido!");
		} else {
			System.out.printf("\nO cargo é: " + cargo);
			System.out.printf("\nO seu novo salário é de R$ %.2f, o reajuste foi de R$ %.2f", novoSalario, novoSalario - salario);
		}
	}
}
