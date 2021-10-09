package estruturadedados.matrizes;

import java.util.Scanner;

public class MatrizIrregulares {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas: ");

		int numEntrevistados = scan.nextInt();
		
		String [][] nomesFilhos = new String [numEntrevistados][];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos: ");
			int qddFilhos = scan.nextInt();	
			nomesFilhos[i] = new String[qddFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do Filho: " + ( j +1));
				
				nomesFilhos[i][j] = scan.next();
			}
		}
		 System.out.println();
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem: " + nomesFilhos[i].length + "filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
			System.out.println();
		}


		
	}

}
