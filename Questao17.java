import java.util.Scanner;

/*17. Escreva um programa que solicite ao usuário os valores de três contas
de consumo (p.ex. água, luz e telefone) e o valor de seu salário.
Verifique se o salário é suficiente para pagar as três contas, caso não
seja apresente a mensagem “Salário insuficiente!”. Caso seja, apresente
o valor que restou do salário após pagar as contas. 
 */

public class Questao17 {
	public static void main(String[] args) {
		float totalContas = 0, valorConta, salario;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do seu salário: ");
		salario = sc.nextFloat();


		for(int i = 1; i < 4; i++) {
			System.out.printf("Insira o valor da %dº conta: ", i);
			valorConta = sc.nextFloat();
			totalContas += valorConta;
		}

		sc.close();

		if(salario >= totalContas) {
			System.out.printf("Contas pagas, o saldo restante é de R$ %.2f", salario - totalContas);
		} else {
			System.out.printf("Salário Insuficiente");
		}
	}
}
