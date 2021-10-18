package entities;

public class Triangle {
	//atributos
	public double a;
	public double b;
	public double c;
	
	
	
	
	//metodos
	
	public double calcAre() {
		 double soma;
		 double formula;
	    soma = (a+b+c)/2;
	    return formula = Math.sqrt((soma*(soma-a)*(soma-b)*(soma-c)));
		
		
	} 
	public void  ShowResult(double x,double y) {
	
		System.out.printf("area do triangulo x: %.2f %n",x);
		System.out.printf("area do triangulo y: %.2f %n",y);
		
		if( x >  y) {
			System.out.println("x é maior");
		}else if(y>x) {
			System.out.println("y é maior");
		}else {
			System.out.println("igualdade de tamanho");
		}
		
		
	}
	
}
