import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class TestProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("digite nome,price,quantity");
		
		String nome = sc.next().toString();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		Product p = new Product(nome,price,quantity);

		p.setNome("computer");
		p.getNome();
		
		
		
		//p.ShowResult(p.nome, p.price, p.quantity);
		System.out.println(p);
		p.addProduct(3);
		p.removeProduct(2);
		p.totalValueInStock();

	}

}
