package medidas;
import java.text.DecimalFormat;
import java.util.*;

public class Medida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		double quadrado =  a*a;
		double triangulo =  (a*b)/2;
		double trapezio =  ((a+b)*c)/2;
		
	
		String resultA = df.format(quadrado);
		String resultB = df.format(triangulo);
		String resultC = df.format(trapezio);
		
		System.out.println("AREA DO QUADRADO = " + resultA);
		System.out.println("AREA DO TRIANGULO = " + resultB);
		System.out.println("AREA DO TRAPEZIO = " + resultC);
		
		sc.close();
	}
}
