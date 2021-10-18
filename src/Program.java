import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static final double PI = 3.14;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius: ");
		double radius = sc.nextDouble();
		double c = circuferencia(radius);
		double v = volume(radius);
		System.out.printf("circuferencia: %.2f%n",c);
		System.out.printf("volume: %.2f%n", v);
		System.out.println("PI: "+PI);

	}
	public static double circuferencia(double radius) {
		return 2*PI*radius;
	}
	public static double volume(double radius) {
		return (4*PI*Math.pow(radius, 3)/3);
	}

}
