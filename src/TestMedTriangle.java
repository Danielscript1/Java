import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class TestMedTriangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y,total;

	    x = new Triangle();
		y = new Triangle();
		total = new Triangle();

	
	

		System.out.println("Digite area do triangulo x : ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double areaX = x.calcAre();
		System.out.println("digite a area do triagulo y :  ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaY = y.calcAre();

		total.ShowResult(areaX, areaY);
		
		
	
	
		
		
		
		
		
		
	}

	

	
}
