import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("adicione a quantidades de registros: ");
		Integer n = sc.nextInt();
		List<Cliente> list = new ArrayList<>();
		for (int i = 0;i<n;i++) {
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("nome: ");
			String nome = sc.next().toString();
			System.out.println("salario:$ ");
			Double salario = sc.nextDouble();
			list.add(new Cliente(id,nome,salario));
			
			
		}
		System.out.println("digite o id do funcionario para incrementar os 10%: ");
		int id = sc.nextInt();
		Cliente emp = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		if(emp ==null) {
			System.out.println("empregado não localizado");
		}else {
			System.out.println("digite o valor da porcetagem: ");
			Double percentage = sc.nextDouble();
			emp.addPorcetagem(percentage);
		}
		
		//----listando todos os funcionarios
		System.out.println();
		System.out.println("List of employees:");
		for (Cliente obj : list) {
			System.out.println(obj);
		}
		
		
		
		
	}

}
