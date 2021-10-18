import java.util.Locale;
import java.util.Scanner;

public class Vector2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nome ;
		double preco;
		double result = 0;
		double vector[] = new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("nome: ");
			 nome = sc.next().toString();
			 System.out.println("preco:$ ");
			 preco = sc.nextDouble();
			 result+=preco;
			
		}
		double media = result/n;
		System.out.printf("a media de produtos:$ %.2f",media);
			
			
	}

}
