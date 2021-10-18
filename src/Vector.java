import java.util.Locale;
import java.util.Scanner;

public class Vector {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		double vector [] = new double[n];
		//int altura = sc.nextInt();
	double result=0;
		for(int i = 0;i<n;i++) {
			result += vector[i] = sc.nextDouble();
			
		}
		
		double media = result /n;
		
		System.out.printf("media de alturas de pessoas: %.2f",media);}
	
}
