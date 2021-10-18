
import java.text.ParseException;
import java.util.Scanner;
import entities.Quartos;

public class TestAluguel {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Quartos[] vect = new Quartos[10];
		System.out.println("Digite a quantidade de equilinos: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			System.out.println("id"+i+": ");
			System.out.println("Digite o nome: ");
			String nome = sc.next().toString();
			System.out.println("Digite o email: ");
			String email = sc.next().toString();
			System.out.println("o numero do quarto: ");
			int room = sc.nextInt();
			vect[room] = new Quartos(nome,email);
		}
		System.out.println("Informações dos quartos");
		for(int i = 0; i<10;i++) {
			if(vect[i]!= null) {
				System.out.println(i+":"+vect[i]);
			}
		}
	
	}

}
