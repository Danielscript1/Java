import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo.
		A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
		come�ar em um dia e terminar em outro,
		tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.*/
		Scanner sc = new Scanner(System.in);
		int horaInicio;
		int HoraFinal;
		
		int duracaoMinima = 60/60;
		int duracaoMaxima =  24;
		System.out.println("Digite a hora de inicio e final: ");
		horaInicio = sc.nextInt();
		HoraFinal = sc.nextInt();
		int calcHora = Math.abs(horaInicio - HoraFinal) ;
		if(calcHora > duracaoMinima  ) {
			System.out.printf("jogo come�ou: %d, e terminiou: %d ,com dura��o maxima: %d",horaInicio,HoraFinal,calcHora);
		}else if(calcHora < duracaoMaxima) {
			System.out.printf("jogo come�ou: %d, e terminiou: %d ,com dura��o minima: %d",horaInicio,HoraFinal,calcHora);
		}else {
			System.out.println("dados incorretos");
		}

	}

}
