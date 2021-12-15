import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// ler1 num
				// ler2 num
				// + - * / %

				Scanner entrada = new Scanner(System.in);

				System.out.print("Digite o primeiro número: ");
				double numeroUm = entrada.nextDouble();
				
				System.out.print("Informe a operação: ");
				String op = entrada.next();
				
				System.out.print("Digite o segundo número: ");
				double numeroDois = entrada.nextDouble();

				double resultado = "+".equals(op) ? numeroUm + numeroDois : 0;
				resultado = "-".equals(op) ? numeroUm - numeroDois : resultado;
				resultado = "*".equals(op) ? numeroUm * numeroDois : resultado;
				resultado = "/".equals(op) ? numeroUm / numeroDois : resultado;
				resultado = "%".equals(op) ? numeroUm % numeroDois : resultado;

				System.out.printf("%.2f %s %.2f = %.2f 4 ", numeroUm, op, numeroDois, resultado);

				entrada.close();

	}
}
