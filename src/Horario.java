import java.util.Scanner;

public class Horario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horario");
		int horas = sc.nextInt();
		if(horas <= 12) {
			System.out.println("Bom dia");
		}else if(horas >12 && horas < 18) {
			System.out.println("Boa Tarde");
		}else {
			System.out.println("Boa noite");
		}
		sc.close();

	}

}
