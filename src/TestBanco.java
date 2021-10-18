import java.util.Locale;
import java.util.Scanner;

import entities.Banco;
import entities.CadastroUsuario;

public class TestBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CadastroUsuario conta ;
		System.out.println("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Digite  a conta: ");
		int Nconta = sc.nextInt();
		System.out.println("Digite proprietario da conta: ");
		String titular = sc.next().toString();
		
		System.out.println("deseja deposita um valor inicial (y/n): ");
		char resp = sc.next().charAt(0);
		if(resp == 'y') {
			double valor=0;
			System.out.println("Digite o valor Deposito: $");
			conta = new CadastroUsuario(numeroConta, Nconta, titular,valor);
			 valor = conta.Depositar(sc.nextDouble());
		
			System.out.println("Dados da conta: "+conta);
		}else {
		
			conta = new CadastroUsuario(numeroConta, Nconta, titular);
			System.out.println(conta);
		}
	}

}
