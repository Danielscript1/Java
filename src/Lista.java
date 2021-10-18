import java.util.ArrayList;
import java.util.List;







public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("daniel");
		list.add("paulo");
		list.add(1, "diego");
		System.out.println(list.size());
		for (String nome : list) {
			System.out.println(nome);
		}
		System.out.println("--------------");
		//list.remove("daniel");
		System.out.println(list);
		//remover de forma com predicado
		list.removeIf(nome->nome.charAt(0)=='d');
		//---------------------
		System.out.println(list);
		System.out.println("----------------");
		System.out.println(list.indexOf("paulo"));
		System.out.println("-----------------");
		
		System.out.println(list.isEmpty());
		System.out.println("----------------");
		List<String> result = list.stream().filter(nome->nome.charAt(0) == 'p').toList();
		System.out.println(result);
		System.out.println("--------------------");
		String name = list.stream().filter(nome->nome.charAt(0)=='c').findFirst().orElse(null);
		System.out.println(name);
		
		
	}
}
