import java.util.Locale;
import java.util.Scanner;

import entities.ProductVector;

public class TestVector {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco;
		double sum =0;
		int n = sc.nextInt();
		ProductVector vector [] = new ProductVector[n];
		for(int i = 0; i<n;i++) {
			 System.out.println("Digite seu nome: ");
			 String nome = sc.next().toString();
			 System.out.println("digite o price:$ ");
			  preco = sc.nextDouble();
			 
			 vector[i] = new ProductVector(nome,preco);
			 sum += preco/n;
		
	      };
		 
	      
	      System.out.printf("media de produtos:$ %.2f",sum);
		
	}
}
