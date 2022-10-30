import java.util.Scanner;

/*
21. Elabore um algoritmo que implemente uma calculadora com as funções
de somar, subtrair, multiplicar e dividir. O programa deverá solicitar ao
usuário os dois valores, e perguntar qual a operação pretendida (‘+’, ‘-‘ ,
‘*’ ou ‘/’ ) e a seguir calcular e mostrar o resultado. Obs: Obrigatório
utilizar a estrutura escolha...caso.
 */

public class Questao21 {
	public static void main(String[] args) {
		float num1, num2, resultado;
		String operacao;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do primeiro número: ");
		num1 = sc.nextFloat();

		System.out.print("Insira o valor do segundo número: ");
		num2 = sc.nextFloat();

		System.out.print("Insira o sinal da operação(+, -, *, /): ");
		operacao = sc.next();
		
		sc.close();

		if(operacao.equals("+")) {
			resultado = num1 + num2;
		} else if(operacao.equals("-")) {
			resultado = num1 - num2;
		} else if(operacao.equals("*")) {
			resultado = num1 * num2; 	
		} else {
			resultado = num1 / num2;
		}

		System.out.print(num1 + " " + operacao + " " + num2 + " = " + resultado);
	}
}