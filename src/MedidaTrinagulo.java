import java.util.Locale;
import java.util.Scanner;

public class MedidaTrinagulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xa ,xb,xc;
		double ya,yb,yc;
		double p;
		
		
		System.out.println("enter measure of triagule X: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		p = (xa+xb+xc) / 2;
		double areaX = Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));

		System.out.println("enter measure of triagule Y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		p = (ya+yb+yc)/2;
		double areaY = Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));

		System.out.println("enter measure of triagule x:  " + areaX);
		System.out.println("enter measure of triagule y:  " + areaY);

		if (areaX > areaY) {
			System.out.println("x e maior");
		} else {
			System.out.println("y e maior");
		}
		 
		
		
		
	}

}
