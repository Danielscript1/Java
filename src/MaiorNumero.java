import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a,b,c);
		
		ShowResult(higher);
	
	  
				
		
	}
	public static int max(int a, int b, int c) {
		  if(a>b&& a>c) {
			  return a;
		  }
		  else if(b>a && b>c){
			  return b;
			  }else {
				  return c;
			  }
  			
}
	public static void ShowResult(int value) {
		System.out.println("o maior valor: 	"+value);
	}
	

}
