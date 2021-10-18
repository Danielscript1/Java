import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int b1,b2;
		int h = 0;
		
		System.out.println("Calculo a area do trapezio");
		System.out.println("digite o tamanho da primeira: ");
		 b1 = ler.nextInt();
		 System.out.println("digite o tamanho da segunda area: ");
		 b2 = ler.nextInt();
		System.out.println("digite a altura: ");
		 h = ler.nextInt();
		
		double area = ((b1+b2)/2)*h;
		System.out.println("area do trapezio:"+ area);
		ler.close();
		
		

	}

}
