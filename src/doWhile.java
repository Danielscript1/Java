import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double celsius;
		double Formula = 0;
		char resp;

		do {
			System.out.println("Digite a Temperatura em Celsius: ");
			celsius = sc.nextDouble();
			Formula += ((9 * celsius) / 5) + 32;
			System.out.println("Equivalente em Fahrenheit: " + Formula);
			System.out.println("Deseja repetir:(S ou N): ");

			resp = sc.next().charAt(0);

		} while (resp == 's' && resp != 'n');
		System.out.println("Programa finalizado");

	}

}
