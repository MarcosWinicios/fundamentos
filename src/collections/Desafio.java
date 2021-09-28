package collections;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double raio = 0.0;
		raio = new Scanner(System.in).nextDouble();		
		double area  = 3.14159 * Math.pow(raio, 2);	
		System.out.println(String.format(Locale.US, "A=%.4f", area));
//		double area = 3.14159 * (raio * raio);
	}
}
