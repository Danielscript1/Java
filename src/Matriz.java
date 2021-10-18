import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		for(int i = 0 ; i<n;i++) {
			for(int j = 0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("------------------");
		System.out.println("minha diagonal: ");
		for(int i = 0;i<n;i++ ) {
			System.out.print(mat[i][i]);
			
			
		}
		System.out.println();
		System.out.println("-------------------");
		int count =0;
		
		for(int i = 0 ; i<n;i++) {
			for(int j = 0; j<mat[i].length;j++) {
				if(mat[i][j]< 0) {
					count = mat[i][j];
					System.out.println("valores negativo: "+count);
				} 
			}
		}
	}
}