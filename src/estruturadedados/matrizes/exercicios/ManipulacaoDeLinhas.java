package estruturadedados.matrizes.exercicios;

import java.util.Random;

public class ManipulacaoDeLinhas {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		matriz = gerarMatriz(matriz);
		imprimirMatriz(matriz);

	}
	
	public static int[][] gerarMatriz(int [][] matriz) {
		Random rand =  new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(9);
			}
		}
		
		return matriz;
	}
	
	public static void imprimirMatriz(int[][]matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print((matriz[i][j]) + " ");
			}
			System.out.println();
		}
	}

}
