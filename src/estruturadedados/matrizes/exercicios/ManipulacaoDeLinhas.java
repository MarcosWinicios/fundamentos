package estruturadedados.matrizes.exercicios;

import java.util.Arrays;
import java.util.Random;

public class ManipulacaoDeLinhas {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		matriz = gerarMatriz(matriz);
		System.out.println("\n\nTamanho da Matriz" + matriz.length);
		imprimirMatriz(matriz);
		
		System.out.println(Arrays.toString(pegarLinha(matriz, 4)));

	}
	
	public static int[][] gerarMatriz(int [][] matriz) {
		Random rand =  new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
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
		System.out.println();
	}
	
	public static int[] pegarLinha(int[][] matriz, int linha) {
//		linha = linha -1;
		
		int[] valoresDaLinha = new int[matriz.length];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == linha) {
					valoresDaLinha[j] = matriz[i][j];
				}
			}
			
		}
		return valoresDaLinha;
	}
	
	

}
