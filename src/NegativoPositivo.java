import java.util.Scanner;

public class NegativoPositivo {
	//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		if(numero>0) {
			System.out.println("Numero Positivo: "+ numero);
		}else if(numero<0) {
			System.out.println("Numero Negativo: "+ numero);
		}else {
			System.out.println("Numero Neutro: "+ numero);
		}
	}

}
