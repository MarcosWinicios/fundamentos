package desafios;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
	public static void main(String[] args) {
		double raio = 0.0;
		raio = new Scanner(System.in).nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println(String.format(Locale.US, "A=%.4f", area));
		
	}
}
